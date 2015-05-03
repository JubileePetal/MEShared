package models;

public class PartialTrade {
	
	private long tradeID;
	private Order order;
	
	public long getTradeID() {
		return tradeID;
	}
	public void setTradeID(long tradeID) {
		this.tradeID = tradeID;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}

}
