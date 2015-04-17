package models;

public class Order {
	
	int currency;
	int instrument;	
	int buyOrSell;
	
	String myOwner;
	int quantity;
	boolean isActive;
	
	long timeEnteredSystem;
	long timeEnteredOrderBook;
	
	public Order(long timeEnteredSystem) {
		
		isActive = false;
		this.timeEnteredSystem = timeEnteredSystem;
		
	}
	
	public void setOrderType(int currency, int instrument, int buyOrSell) {
		this.currency = currency;
		this.instrument = instrument;
		this.buyOrSell = buyOrSell;
	}
	
	public void setOrderOwner(String ownerNick) {
		myOwner = ownerNick;
	}
	
	public void setOrderQuantity(int orderQuantity) {
		this.quantity = orderQuantity;
	}
	
	public void activateOrder() {
		isActive = true;
	}
	
	public void setTimeEnteredOrderBook(long time) {
		timeEnteredOrderBook = time;
	}

	
}
