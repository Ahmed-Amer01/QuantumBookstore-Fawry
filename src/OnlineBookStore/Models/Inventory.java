package OnlineBookStore.Models;

import java.time.LocalDate;
import java.util.*;

public class Inventory {
	private List<Book> books = new ArrayList<>();
	
	public void add(Book book) {
        books.add(book);
    }
	
	public List<Book> removeOutdatedBooks(int years) {
		for(int i = 0; i< this.books.size(); i++) {
			if(this.books.get(i).getPublishYear().plusYears(years).isBefore(LocalDate.now())) {
				this.books.remove(i);
				i--;
			}
		}
		return this.books;
	}
	
	public Book getBookByISBN(String ISBN) {
		for(int i = 0; i< this.books.size(); i++) {
			if(this.books.get(i).getISBN().equalsIgnoreCase(ISBN)) {
				return this.books.get(i);
			}
		}
		return null;
	}
	
	public int getSize() {
		return books.size();
	}
}
