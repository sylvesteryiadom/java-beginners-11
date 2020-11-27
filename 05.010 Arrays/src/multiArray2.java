public class multiArray2 {
	public static void main(String[] args) {
		// initializing arrays

		String[][] PetCarComp = { { "dog", "cat" }, { "bmw", "benz" }, { "apple", "google" } };

		// looping through multi-dimensional arrays

		for (int i = 0; i < PetCarComp.length; i++) { // using i to loop through FOR individual arrays ["dog","cat"]
			for (int j = 0; j < PetCarComp[i].length; j++) { // using j to loop through FOR individual elements
				System.out.printf("%s \t", PetCarComp[i][j]);
			}
			System.out.println();
		}
	}

}