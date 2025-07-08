package OnlineBookStore.Services;

import OnlineBookStore.Models.*;
import OnlineBookStore.Interfaces.*;

public class BookStoreService {
	private Inventory inventory = new Inventory();

	public void addBook(Book book) {
		inventory.add(book);
	}

	public void removeOldBooks(int years) {
		int oldSize = inventory.getSize();
		var books = inventory.removeOutdatedBooks(years);
		System.out.println("Quantum book store: Removed " + (oldSize - books.size()) + " old books.");
	}

	public double buyBook(String ISBN, int amount, String email, String address) {
		Book book = inventory.getBookByISBN(ISBN);
		if (book == null) {
			throw new IllegalArgumentException("Quantum book store: Book not found");
		}
		
		if (!(book instanceof Sellable)) {
			throw new IllegalArgumentException("Quantum book store: Book not for sale");
		}

		double bookPrice = ((Sellable) book).getPrice() * amount;
		double shipping = 0;
		double totalPrice = bookPrice;

		if (book instanceof Shippable) {
			((Shippable) book).reduceQuantity(amount);
			shipping = ((Shippable) book).getShippingPrice(book, amount);
			System.out.println("Quantum book store: Shipping " + book.getISBN() + " to " + address);
		} else if (book instanceof Sellable) {
			System.out.println("Quantum book store: Sending " + book.getISBN() + " to " + email);
		}
		
		totalPrice = bookPrice + shipping;
		
		System.out.println("Total price: " + bookPrice);
		System.out.println("Total Shipping price: " + shipping);
		System.out.println("Total paid: " + totalPrice + '\n');
		return totalPrice;
	}
}
