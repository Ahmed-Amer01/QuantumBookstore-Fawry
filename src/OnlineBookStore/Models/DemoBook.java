package OnlineBookStore.Models;

import java.time.LocalDate;

public class DemoBook extends Book {
	public DemoBook(String ISBN, String title, LocalDate publishYear){
		super(ISBN, title, publishYear);
	}
}
