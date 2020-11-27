package application;

import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		int[] numbers = { 2, 4, 6, 8 };

		String[] stringArrayStrings = { "rice", "potatoes", "beans" };
		/*
		 * 0. Tomatoes 1. Pasta 2. Onions 2. Onions
		 *
		 * Note! Array indexes are zero-based
		 */
		/* looping through arrays */

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		stringArrayStrings[0] = "Plantains";

		for (int i = 0; i < stringArrayStrings.length; i++) {
			System.out.println(stringArrayStrings[i]);
			;
		}

//		Printing Instream arrays
		IntStream.range(0, stringArrayStrings.length).forEach(i -> {
			System.out.println(i + ". " + stringArrayStrings[i]);
		});

	}

}
