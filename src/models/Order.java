package models;

public class Order {
	
	private int currency;
	private int instrument;	
	private int buyOrSell;
	
	private String myOwner;
	private int quantity;
	private boolean isActive;
	
	private long timeEnteredSystem;
	private long timeEnteredOrderBook;
	
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

	public int getCurrency() {
		return currency;
	}


	
}
