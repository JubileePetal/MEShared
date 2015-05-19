package models;

public class Option {
	
	private String	instrument;
	private double 	strikePrice;
	private double 	timeToMaturity;
	private double 	theoreticPrice;
	private int 	type;
	
	public Option() {
		// TODO Auto-generated constructor stub
	}
	
	public double getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(double strikePrice) {
		this.strikePrice = strikePrice;
	}

	public double getTimeToMaturity() {
		return timeToMaturity;
	}

	public void setTimeToMaturity(double timeToMaturity) {
		this.timeToMaturity = timeToMaturity;
	}

	public double getTheoreticPrice() {
		return theoreticPrice;
	}

	public void setTheoreticPrice(double theoreticPrice) {
		this.theoreticPrice = theoreticPrice;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}


	
	
}
