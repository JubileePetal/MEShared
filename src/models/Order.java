package models;

public class Order implements Cloneable {
	
	private long id;
	
	private Instrument instrument;
	private int currency;
	private int buyOrSell;
	private int typeOfOrder;
	
	private String myOwner;
	private int quantity;
	private boolean isActive;
	private double price;
	
	private long timeEnteredSystem;
	private long timeEnteredOrderBook;
	
	public Order() {
		
		isActive = false;
		
	}
	
	public long getTimeEnteredOrderBook() {
		return timeEnteredOrderBook;
	}
	
	public long getTimeEntered() {
		return timeEnteredSystem;
	}
	
	public boolean isActive() {
		return isActive;
	}
	
	public void setOrderOwner(String ownerNick) {
		myOwner = ownerNick;
	}
	
	public String getMyOwner() {
		return myOwner;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.quantity = orderQuantity;
	}
	
	public int getQuantity() {
		return quantity;
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
		buyOrSell = OpCodes.BUY_ORDER;
	}
	
	public void setToSellOrder() {
		buyOrSell = OpCodes.SELL_ORDER;
	}
	
	public int isBuyOrSell() {
		return buyOrSell;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getTypeOfOrder() {
		return typeOfOrder;
	}

	public void setTypeOfOrder(int typeOfOrder) {
		this.typeOfOrder = typeOfOrder;
	}

	public Object clone(){  
	    try{  
	        return super.clone();  
	    }catch(Exception e){ 
	        return null; 
	    }
	}

	
}
