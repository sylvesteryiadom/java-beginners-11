package application;

public class windowTest {
	public static void main(String[] args) {
		Window carWindow = new Window();

		carWindow.setHeight(10);
		carWindow.setWidth(20);
		int area = carWindow.area(carWindow.getHeight(), carWindow.getWidth());
		System.out.println("The area of a window is: " + area);
	}

}
