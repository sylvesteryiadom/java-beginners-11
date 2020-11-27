public class multiArray2 {
	public static void main(String[] args) {
		// initializing arrays

		String[][] PetCarComp = { { "dog", "cat" }, { "bmw", "benz" }, { "apple", "google" } };

		// looping through multi-dimensional arrays
		for (int i = 0; i < PetCarComp.length; i++) {
			String[] singleArrays = PetCarComp[i];
//			System.out.println(Arrays.toString(PetCarComp[i]));
			for (int j = 0; j < singleArrays.length; j++) {
				System.out.printf("%s \t", singleArrays[j]);
			}
			System.out.println();
		}
	}

}