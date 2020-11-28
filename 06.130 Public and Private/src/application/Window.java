package application;

public class Window extends windowTest {
	private int width;
	private int height;
	private boolean isVisible;
	private int top;
	private int left;

	/** SETTERS */
	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setVisibility(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public void left(int left) {
		this.left = left;
	}

	/** GETTERS */
	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

	public boolean getVisbility() {
		return this.isVisible;
	}

	public int getTop() {
		return this.top;
	}

	public int getLeft() {
		return this.left;
	}

	/** calc area of a window */
	public int area(int width, int height) {
		return width * height;
	}

}
