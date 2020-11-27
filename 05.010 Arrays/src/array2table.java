public class array2table {

	public static void main(String[] args) {
		/** MULTIPLICATION TABLE */
//		12X12

		int[][] table = new int[12][12]; // 12 by 12 array
		for (int i = 0; i < table.length; i++) {
			int[] row = table[i];
			for (int j = 0; j < row.length; j++) {
				row[j] = ((i + 1) * (j + 1));
			}
		}
		System.out.println();
		// display table
		for (int[] row : table) {
			for (int value : row) {
				System.out.printf("%5d", value);
			}
			System.out.println("");

		}

	}

}
