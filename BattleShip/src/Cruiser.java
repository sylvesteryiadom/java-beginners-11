class Cruiser {
	public int xPos[];
	public int yPos[];

	public Cruiser(int x, int y, boolean vertical) {
		xPos = new int[3];
		yPos = new int[3];

		isHit = new boolean[3];

		for (int i = 0; i < 3; i++) {
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
		return "Cruiser";
	}

	public boolean registerHit(int x, int y) {
		for (int i = 0; i < 3; i++) {
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
		return (numHits == 3) ? true : false;
	}

	private boolean isHit[];
	private int numHits;
}
