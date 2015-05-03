package models;

public class Trade {

	private long tradeID;
	private PartialTrade buyPartial;
	private PartialTrade sellPartial;

	public long getTradeID() {
		return tradeID;
	}
	public void setTradeID(long tradeID) {
		this.tradeID = tradeID;
	}
	public PartialTrade getBuyPartial() {
		return buyPartial;
	}
	public void setBuyPartial(PartialTrade buyPartial) {
		this.buyPartial = buyPartial;
	}
	public PartialTrade getSellPartial() {
		return sellPartial;
	}
	public void setSellPartial(PartialTrade sellPartial) {
		this.sellPartial = sellPartial;
	}
	
	/*
	
	private long buyOrderID;
	private long selOrderID;
	
	private String buyer;
	private String seller;

	private int quantity;
	private double price;
	private Instrument instrument;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Trade() {
		// TODO Auto-generated constructor stub
	}

	public long getTradeID() {
		return tradeID;
	}

	public void setTradeID(long tradeID) {
		this.tradeID = tradeID;
	}

	public long getBuyOrderID() {
		return buyOrderID;
	}

	public void setBuyOrderID(long buyOrderID) {
		this.buyOrderID = buyOrderID;
	}

	public long getSelOrderID() {
		return selOrderID;
	}

	public void setSelOrderID(long selOrderID) {
		this.selOrderID = selOrderID;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	
*/

}
