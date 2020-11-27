import java.util.Arrays;

public class multiArrayExercise {
	public static void main(String[] args) {

		int[][] numbers = { { 4, 5, 6 }, { 1, 3 }, { 7, 8, 9 } };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.printf("%d \t", numbers[i][j]);
			}
			System.out.println("");
		}
		System.out.println("=====test2=======");
		for (int i = 0; i < numbers.length; i++) {
			int[] newNum = numbers[i];
			for (int j = 0; j < newNum.length; j++) {
				System.out.printf("%d \t", newNum[j]);
			}
			System.out.println("");
		}
		System.out.println("=====test2=======");
		String[][] textMsg = { { "lion", "zebra" }, { "chicken", "hen" } };
		Arrays.stream(textMsg).forEach(msg -> {
			for (int i = 0; i < msg.length; i++) {
				System.out.println(msg[i]);
			}
		});
	}

}
