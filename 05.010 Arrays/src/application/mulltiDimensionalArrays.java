package application;
public class mulltiDimensionalArrays {

	public static void main(String[] args) {
//		System.out.println("-----TEST1-----");
//
//		String[] male = { "James", "Peter", "John", "Exodus" };
//		for (String names : male) {
//			System.out.println(names);
//		}
//
//		System.out.println("-----TEST2-----");
//		Arrays.stream(male).forEach(names -> {
//			System.out.println(names);
//		});
//
//		System.out.println("-----TEST3-----");
//		for (int i = 0; i < male.length; i++) {
//			System.out.println(male[i]);
//		}

		String[][] texts = { { "james", "john", "jameson" }, { "mandy", "", "mary" }, { "alana", "angela", "andela" } };
		for (String[] strings : texts) {
			String[] subArray = strings; // reassign the individual arrays
			// loop through the individual arrays to show all array elements
			for (int i = 0; i < subArray.length; i++) {
				System.out.printf("%s\t", subArray[i]);
			}
			System.out.println();
		}

	}

}
