package models;

public class LimitOrder extends Order{

	private Double price;
	
	public LimitOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
	