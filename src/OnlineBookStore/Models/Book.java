package OnlineBookStore.Models;

import java.time.LocalDate;

public abstract class Book {
	protected String ISBN;
	protected String title;
	protected LocalDate publishYear;
	
	public Book(String ISBN, String title, LocalDate publishYear){
		this.ISBN = ISBN;
		this.title = title;
		this.publishYear = publishYear;
	}
	
	public String getISBN() {
		return this.ISBN;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public LocalDate getPublishYear() {
		return this.publishYear;
	}
	
	public void setPublishYear(LocalDate publishYear) {
		this.publishYear = publishYear;
	}
}
