package application;

public class MenuTest {

	public static void main(String[] args) {
		Menu hotel = new Menu();

		String hotelOption = hotel.getDisplayOptions();
		System.out.println(hotelOption);
	}

}
