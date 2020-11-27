package application;
import java.util.stream.IntStream;

public class arrayTest {

	public static void main(String[] args) {
		int[] newArray = new int[10];

		IntStream.range(0, newArray.length).forEach(i -> {
			System.out.println(i + ". " + newArray[i]);
		});
	}

}
