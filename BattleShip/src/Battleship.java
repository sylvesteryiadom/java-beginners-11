class Battleship {
	public int xPos[];
	public int yPos[];

	public Battleship(int x, int y, boolean vertical) {
		xPos = new int[4];
		yPos = new int[4];

		isHit = new boolean[4];

		for (int i = 0; i < 4; i++) {
			xPos[i] = x;
			yPos[i] = y;
			isHit[i] = false;
			if (vertical)
				y++;
			else
				x++;
		}

		numHits = 0;
	}

	public String name() {
		return "Battleship";
	}

	public boolean registerHit(int x, int y) {
		for (int i = 0; i < 4; i++) {
			if (xPos[i] == x && yPos[i] == y) {
				if (!isHit[i]) {
					isHit[i] = true;
					numHits++;
				}
				return true;
			}
		}

		return false;
	}

	public boolean isSunk() {
		return (numHits == 4) ? true : false;
	}

	private boolean isHit[];
	private int numHits;
}