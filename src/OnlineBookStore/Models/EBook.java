package OnlineBookStore.Models;

import OnlineBookStore.Interfaces.*;

import java.time.LocalDate;

public class EBook extends Book implements Sellable {
	private double price;
	private String fileType;
	
	public EBook(String ISBN, String title, LocalDate publishYear, double price, String fileType){
		super(ISBN, title, publishYear);
		this.price = price;
		this.fileType = fileType;
	}
	
	@Override
	public double getPrice() {
		return this.price;
	}
	
	@Override
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getFileType() {
		return this.fileType;
	}
	
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
}
