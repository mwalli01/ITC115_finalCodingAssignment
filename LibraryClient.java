package assignments;

import java.sql.Date;
import java.time.LocalDate;

public class LibraryClient {

	public static void main(String[] args) {
		BookItem a = new BookItem();
		a.setItemTitle("Catcher In the Rye");
		a.setAuthorName("Alfred Hitchcock");
		a.setItemNumber(12345);
		
		a.checkOut("Max wallin");
		System.out.println(a.toString());
	}

}
