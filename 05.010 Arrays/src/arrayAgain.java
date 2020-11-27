public class arrayAgain {

	public static void main(String[] args) {
		// Create a 12 by 12 Multiplication table
		int[][] tables = new int[12][12];
		// loop through the rows
		for (int i = 0; i < tables.length; i++) {
			// store row array in another array and display
			int[] row = tables[i];
			for (int j = 0; j < row.length; j++) {
				// store row values inside a table
				int table = ((j + 1) * (i + 1)); // add rows and multiply by values
				System.out.printf("%d\t", table);
			}
			System.out.println();
		}

	}

}
