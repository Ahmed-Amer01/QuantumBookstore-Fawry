package OnlineBookStore.Interfaces;

import OnlineBookStore.Models.*;

public interface Shippable {
	double getShippingPrice(Book book, int amount);
	void reduceQuantity(int amount);
}
