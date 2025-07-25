package OnlineBookStore;

import java.time.LocalDate;

import OnlineBookStore.Models.*;
import OnlineBookStore.Services.BookStoreService;

public class QuantumBookstoreFullTest {
	public static void main(String[] args) {
		BookStoreService store = new BookStoreService();
		
		store.addBook(new DemoBook("ISBN1-Demo", "C", LocalDate.of(2025, 1, 1)));
		store.addBook(new PaperBook("ISBN1-Paper", "C++", LocalDate.of(2022, 1, 1), 100.0, 10));
		store.addBook(new PaperBook("ISBN2-Paper", "C#", LocalDate.of(2005, 1, 1), 150.0, 10));
		store.addBook(new EBook("ISBN1-E", "OOP", LocalDate.of(2020, 7, 8), 200.0, "PDF"));
		store.addBook(new EBook("ISBN1-E", "Datebase", LocalDate.of(1999, 1, 1), 80.0, "PDF"));
		
		store.removeOldBooks(10);

		store.buyBook("ISBN1-Paper", 2, "ahmed@gmail.com", "Alexandria");
		store.buyBook("ISBN1-E", 1, "ahmed@gmail.com", "Giza");
		store.buyBook("ISBN1-Demo", 2, "ahmed@gmail.com", "Cairo");

	}
}