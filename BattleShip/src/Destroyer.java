class Destroyer {
	public int xPos[];
	public int yPos[];

	public Destroyer(int x, int y, boolean vertical) {
		xPos = new int[2];
		yPos = new int[2];

		isHit = new boolean[2];

		for (int i = 0; i < 2; i++) {
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
		return "Destroyer";
	}

	public boolean registerHit(int x, int y) {
		for (int i = 0; i < 2; i++) {
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
		return (numHits == 2) ? true : false;
	}

	private boolean isHit[];
	private int numHits;
}