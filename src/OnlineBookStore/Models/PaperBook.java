package OnlineBookStore.Models;

import OnlineBookStore.Interfaces.*;

import java.time.LocalDate;

public class PaperBook extends Book implements Sellable, Shippable {
	private double price;
	private int quantity;
	
	public PaperBook(String ISBN, String title, LocalDate publishYear, double price, int quantity){
		super(ISBN, title, publishYear);
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public double getPrice() {
		return this.price;
	}
	
	@Override
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public double getShippingPrice(Book book, int amount) {
		return (amount * this.price) * 0.05;
	}
	
	@Override
	public void reduceQuantity(int amount) {
		if (amount > this.quantity) {
			throw new IllegalArgumentException("Not enough stock");
		}
		this.quantity -= amount;
	}
}
