package application;

import java.util.Arrays;
import java.util.Scanner;

public class arrayExercise {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] numbersArray = new int[3];

		for (int i = 0; i < numbersArray.length; i++) {
			System.out.print("Enter three numbers:"); // ask user for input 3 times
			numbersArray[i] = scan.nextInt();
		}
		System.out.print("You entered: ");
		System.out.println(Arrays.toString(numbersArray));
		int total = 0;
//		for (int i = 0; i < numbersArray.length; i++) {
//			total += numbersArray[i];
//		}
		// TEST
		for (int member : numbersArray) {
			total += member;
		}

//		Arrays.stream(numbersArray).forEach(number -> {
//			total += number;
//		});
		System.out.printf("Your total is:  %d ", total);

		scan.close();
	}

}
