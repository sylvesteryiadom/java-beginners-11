class Carrier {
	public int xPos[];
	public int yPos[];

	public Carrier(int x, int y, boolean vertical) {
		xPos = new int[5];
		yPos = new int[5];

		isHit = new boolean[5];

		for (int i = 0; i < 5; i++) {
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
		return "Carrier";
	}

	public boolean registerHit(int x, int y) {
		for (int i = 0; i < 5; i++) {
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
		return (numHits == 5) ? true : false;
	}

	private boolean isHit[];
	private int numHits;
}