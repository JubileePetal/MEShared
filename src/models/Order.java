package models;

public class Order {
	
	private String message;
	
	Currency currency;
	Instrument instrument;
	
	String ownerNick;
	int quantity;
	boolean isActivated;
	
	long timeEnteredSystem;
	long timeEnteredOrderBook;
	
	public Order(long timeEnteredSystem) {
		
		this.timeEnteredSystem = timeEnteredSystem;
		
	}
	
	public String getMessage() {
		
		return message;
	}
	
}
