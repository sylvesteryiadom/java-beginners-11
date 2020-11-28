package application;

public class App {

	public static void main(String[] args) {
		Calculator calc = new Calculator(); // initialize new calculator

		final int toSquare = 100;
		int squared = calc.square(toSquare);

		String answer = String.format("%d squared is: %d", toSquare, squared);
		System.out.println(answer);

		int added = calc.add(15, 3);
		System.out.println("Added: " + added);

		int subtract = calc.subtract(10, 5);
		System.out.println("Subracted: " + subtract);

		int multiplied = calc.multiplyy(8, 2);
		System.out.println("Multiplied: " + multiplied);

	}

}
