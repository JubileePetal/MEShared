package models;

public class Order {
	
	private int currency;
	private int orderType;
	
	private long id;
	
	private String myOwner;
	private int quantity;
	private boolean isActive;
	
	private long timeEnteredSystem;
	private long timeEnteredOrderBook;
	
	private Instrument instrument;
	
	public Order() {
		
		isActive = false;
		
	}
	
	public void setOrderType(int currency, int orderType) {
		this.currency = currency;
		this.orderType = orderType;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public void setToBuyOrder() {
		orderType = OpCodes.BUY_ORDER;
	}
	
	public void setToSellOrder() {
		orderType = OpCodes.SELL_ORDER;
	}
	
	public int getOrderType() {
		return orderType;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}


	
}
