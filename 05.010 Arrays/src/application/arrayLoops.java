package application;

import java.util.Arrays;

public class arrayLoops {

	public static void main(String[] args) {
		String[] fruits = { "mango", "banana", "orange", "pawpaw" };

		for (String fruit : fruits) {
			System.out.println(fruit);

		}
		System.out.println("__________TEST___________");
		Arrays.stream(fruits).forEach(fruit -> {
			System.out.println(fruit);
		});

	}
}
