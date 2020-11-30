import java.util.Random;

class PlayGame {
	public static void main(String argv[]) {
		boolean alreadyGuessed[][] = new boolean[10][10];
		for (int x = 0; x < 10; x++)
			for (int y = 0; y < 10; y++)
				alreadyGuessed[x][y] = false;

		GameBoard b = new GameBoard();
		b.display();
		Random rand = new Random();
		while (!b.isGameOver()) {
			int xPos = Math.abs(rand.nextInt() % 10);
			int yPos = Math.abs(rand.nextInt() % 10);
			if (!alreadyGuessed[xPos][yPos]) {
				alreadyGuessed[xPos][yPos] = true;
				b.guess(xPos, yPos);
			}
		}
		b.display();
		System.out.println(b.numberOfGuesses + " guesses, " + b.numberOfHits + " hits, sunk " + b.numberSunk);
		b.reset();
		b.display();
		System.out.println(b.numberOfGuesses + " guesses, " + b.numberOfHits + " hits, sunk " + b.numberSunk);
	}
}