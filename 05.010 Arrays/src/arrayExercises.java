public class arrayExercises {

	public static void main(String[] args) {
		String[][] words = new String[][] { { "one", "two", "three" }, { "cat", "dogs", "horse" },
				{ "apple", "orange", "banana" } };

		System.out.println(words[1][1]);
		System.out.println(words[1][0]);

		for (String[] SubArray : words) {
			for (String word : SubArray) {
				System.out.printf("%s \t", word);
			}
			System.out.println();
		}

		int[][] values = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		int total = 0;
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				if ((values[i][j] == 9) || (values[i][j] == 5) || (values[i][j] == 1)) {
					System.out.printf("%d \t", values[i][j]);
					total += values[i][j];
				}
			}

		}
		System.out.println();
		System.out.printf("Total is : %d", total);
	}

}
