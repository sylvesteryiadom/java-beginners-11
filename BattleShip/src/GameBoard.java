
import java.util.Random;

// A Battleship! game board

class GameBoard {
	public final static char ShipMask = 0x07;

	public final static char isEmpty = 0x00; // location is empty
	public final static char hasCarrier = 0x01; // location contains the carrier
	public final static char hasBattleship = 0x02; // location contains the battleship
	public final static char hasCruiser = 0x03; // location contains the cruiser
	public final static char hasSubmarine = 0x04; // location contains the submarine
	public final static char hasDestroyer = 0x05; // location contains the destroyer

	public final static char GuessMask = 0x18;

	public final static char noGuess = 0x00; // location has not been guessed yet
	public final static char isHit = 0x08; // guess is a hit
	public final static char isMiss = 0x10; // guess is a miss
	public final static char isSunk = 0x18; // guess is sunk

	public char board[][]; // the game board itself

	public Carrier carrier; // the carrier
	public Battleship battleship; // the battleship
	public Cruiser cruiser; // the cruiser
	public Submarine submarine; // the submarine
	public Destroyer destroyer; // the destroyer

	// Create a new game board

	GameBoard() {
		board = new char[10][10];

		// initialize the board to the empty state

		for (int x = 0; x < 10; x++)
			for (int y = 0; y < 10; y++)
				board[x][y] = 0;

		// select random positions for the ships

		Random rand = new Random();

		// select orientation and position for the carrier

		boolean isVertical = (rand.nextInt() % 2 == 0) ? false : true;
		int initX = Math.abs(rand.nextInt() % (isVertical ? 10 : 6));
		int initY = Math.abs(rand.nextInt() % (isVertical ? 6 : 10));
		for (int i = 0; i < 5; i++) {
			if (isVertical)
				board[initX][initY + i] = hasCarrier;
			else
				board[initX + i][initY] = hasCarrier;
		}
		carrier = new Carrier(initX, initY, isVertical);

		// select orientation and position for the battleship

		do {
			isVertical = (rand.nextInt() % 2 == 0) ? false : true;
			initX = Math.abs(rand.nextInt() % (isVertical ? 10 : 7));
			initY = Math.abs(rand.nextInt() % (isVertical ? 7 : 10));
		} while ((board[initX][initY] != 0) || (isVertical
				&& ((board[initX][initY + 1] != 0) || (board[initX][initY + 2] != 0) || (board[initX][initY + 3] != 0)))
				|| (!isVertical && ((board[initX + 1][initY] != 0) || (board[initX + 2][initY] != 0)
						|| (board[initX + 3][initY] != 0))));
		if (isVertical)
			board[initX][initY] = board[initX][initY
					+ 1] = board[initX][initY + 2] = board[initX][initY + 3] = hasBattleship;
		else
			board[initX][initY] = board[initX
					+ 1][initY] = board[initX + 2][initY] = board[initX + 3][initY] = hasBattleship;
		battleship = new Battleship(initX, initY, isVertical);

		// select orientation and position for the cruiser

		do {
			isVertical = (rand.nextInt() % 2 == 0) ? false : true;
			initX = Math.abs(rand.nextInt() % (isVertical ? 10 : 8));
			initY = Math.abs(rand.nextInt() % (isVertical ? 8 : 10));
		} while ((board[initX][initY] != 0)
				|| (isVertical && ((board[initX][initY + 1] != 0) || (board[initX][initY + 2] != 0)))
				|| (!isVertical && ((board[initX + 1][initY] != 0) || (board[initX + 2][initY] != 0))));
		if (isVertical)
			board[initX][initY] = board[initX][initY + 1] = board[initX][initY + 2] = hasCruiser;
		else
			board[initX][initY] = board[initX + 1][initY] = board[initX + 2][initY] = hasCruiser;
		cruiser = new Cruiser(initX, initY, isVertical);

		// select orientation and position for the submarine

		do {
			isVertical = (rand.nextInt() % 2 == 0) ? false : true;
			initX = Math.abs(rand.nextInt() % (isVertical ? 10 : 8));
			initY = Math.abs(rand.nextInt() % (isVertical ? 8 : 10));
		} while ((board[initX][initY] != 0)
				|| (isVertical && ((board[initX][initY + 1] != 0) || (board[initX][initY + 2] != 0)))
				|| (!isVertical && ((board[initX + 1][initY] != 0) || (board[initX + 2][initY] != 0))));
		if (isVertical)
			board[initX][initY] = board[initX][initY + 1] = board[initX][initY + 2] = hasSubmarine;
		else
			board[initX][initY] = board[initX + 1][initY] = board[initX + 2][initY] = hasSubmarine;
		submarine = new Submarine(initX, initY, isVertical);

		// select orientation and position for the destroyer

		do {
			isVertical = (rand.nextInt() % 2 == 0) ? false : true;
			initX = Math.abs(rand.nextInt() % (isVertical ? 10 : 9));
			initY = Math.abs(rand.nextInt() % (isVertical ? 9 : 10));
		} while ((board[initX][initY] != 0) || (isVertical && (board[initX][initY + 1] != 0))
				|| (!isVertical && (board[initX + 1][initY] != 0)));
		if (isVertical)
			board[initX][initY] = board[initX][initY + 1] = hasDestroyer;
		else
			board[initX][initY] = board[initX + 1][initY] = hasDestroyer;
		destroyer = new Destroyer(initX, initY, isVertical);

		// initialize game statistics

		numberSunk = 0;
		numberOfHits = 0;
		numberOfGuesses = 0;
		duplicateGuesses = 0;
	}

	// Returns true if the game has been won

	public boolean isGameOver() {
		return (numberSunk == 5) ? true : false;
	}

	// Records a guess

	public char guess(int x, int y) {
		numberOfGuesses++;

		if ((board[x][y] & GuessMask) != noGuess) {
			duplicateGuesses++;
			return (char) (board[x][y] & GuessMask);
		}

		switch (board[x][y] & ShipMask) {
		case isEmpty:
			board[x][y] |= isMiss;
			return isMiss;

		case hasCarrier:
			board[x][y] |= isHit;
			numberOfHits++;
			carrier.registerHit(x, y);
			if (carrier.isSunk()) {
				for (int i = 0; i < 5; i++)
					board[carrier.xPos[i]][carrier.yPos[i]] |= isSunk;
				numberSunk++;
				return isSunk;
			} else
				return isHit;

		case hasBattleship:
			board[x][y] |= isHit;
			numberOfHits++;
			battleship.registerHit(x, y);
			if (battleship.isSunk()) {
				for (int i = 0; i < 4; i++)
					board[battleship.xPos[i]][battleship.yPos[i]] |= isSunk;
				numberSunk++;
				return isSunk;
			} else
				return isHit;

		case hasCruiser:
			board[x][y] |= isHit;
			numberOfHits++;
			cruiser.registerHit(x, y);
			if (cruiser.isSunk()) {
				for (int i = 0; i < 3; i++)
					board[cruiser.xPos[i]][cruiser.yPos[i]] |= isSunk;
				numberSunk++;
				return isSunk;
			} else
				return isHit;

		case hasSubmarine:
			board[x][y] |= isHit;
			numberOfHits++;
			submarine.registerHit(x, y);
			if (submarine.isSunk()) {
				for (int i = 0; i < 3; i++)
					board[submarine.xPos[i]][submarine.yPos[i]] |= isSunk;
				numberSunk++;
				return isSunk;
			} else
				return isHit;

		case hasDestroyer:
			board[x][y] |= isHit;
			numberOfHits++;
			destroyer.registerHit(x, y);
			if (destroyer.isSunk()) {
				for (int i = 0; i < 2; i++)
					board[destroyer.xPos[i]][destroyer.yPos[i]] |= isSunk;
				numberSunk++;
				return isSunk;
			} else
				return isHit;
		}

		return isMiss; // should never get here
	}

	// Resets the game board to its initial state

	public void reset() {
		// initialize the board to the empty state

		for (int x = 0; x < 10; x++)
			for (int y = 0; y < 10; y++)
				board[x][y] &= ~GuessMask;

		// initialize game statistics

		numberSunk = 0;
		numberOfHits = 0;
		numberOfGuesses = 0;
		duplicateGuesses = 0;
	}

	// Displays the game board

	public void display() {
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
				if (board[x][y] == 0)
					System.out.print(".");
				else {
					switch (board[x][y] & ShipMask) {
					case isEmpty:
						System.out.print("M");
						break;
					case hasCarrier:
						if ((board[x][y] & GuessMask) == noGuess)
							System.out.print("a");
						else
							System.out.print("A");
						break;
					case hasBattleship:
						if ((board[x][y] & GuessMask) == noGuess)
							System.out.print("b");
						else
							System.out.print("B");
						break;
					case hasCruiser:
						if ((board[x][y] & GuessMask) == noGuess)
							System.out.print("c");
						else
							System.out.print("C");
						break;
					case hasSubmarine:
						if ((board[x][y] & GuessMask) == noGuess)
							System.out.print("s");
						else
							System.out.print("S");
						break;
					case hasDestroyer:
						if ((board[x][y] & GuessMask) == noGuess)
							System.out.print("d");
						else
							System.out.print("D");
						break;
					}
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public int numberSunk; // number of ships sunk in this game
	public int numberOfHits; // number of hits recorded in this game (duplicates aren't counted
	public int numberOfGuesses; // number of guesses made in this game
	public int duplicateGuesses; // number of duplicated guesses made in this game
}
