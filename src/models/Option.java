package models;

public class Option {
	
	private String		instrument;
	private double 		strikePrice;
	private double 		timeToMaturity;
	private double 		theoreticPrice;
	private Double		delta;
	private Double		gamma;
	private int 		type;
	private int 		id;
	private int 		status;
	

	
	
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

	public Double getDelta() {
		return delta;
	}

	public void setDelta(Double delta) {
		this.delta = delta;
	}

	public Double getGamma() {
		return gamma;
	}

	public void setGamma(Double gamma) {
		this.gamma = gamma;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public int getStatus() {
//		return status;
//	}
//
//	public void setStatus(int status) {
//		this.status = status;
//	}
	
	
	
	
	
}
