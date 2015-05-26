package models;

import java.util.ArrayList;

public class Analytics {

	private Double SMA;
	private Double simpleVol;
	private Double spotPrice;
	private Double rateOfReturn;
	private Double ewmaVol;
	private ArrayList<Option> options = new ArrayList<Option>();

	public Double getSMA() {
		return SMA;
	}

	public void setSMA(Double sMA) {
		SMA = sMA;
	}

	public Double getSimpleVol() {
		return simpleVol;
	}

	public void setSimpleVol(Double simpleVol) {
		this.simpleVol = simpleVol;
	}

	public void setOptions(ArrayList<Option> options) {
		this.options = options;
		
	}

	public Double getSpotPrice() {
		return spotPrice;
	}

	public void setSpotPrice(Double spotPrice) {
		this.spotPrice = spotPrice;
	}

	public Double getRateOfReturn() {
		return rateOfReturn;
	}

	public void setRateOfReturn(Double rateOfReturn) {
		this.rateOfReturn = rateOfReturn;
	}

	public Double getEwmaVol() {
		return ewmaVol;
	}

	public void setEwmaVol(Double ewmaVol) {
		this.ewmaVol = ewmaVol;
	}
	
}
