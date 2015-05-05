package tests;

import java.util.ArrayList;

import models.Instrument;
import models.OpCodes;
import models.Order;

public final class OrderCollections {

	public static Order simpleSellOrder() {
		
		Instrument instrument = new Instrument();
		instrument.setAbbreviation("ERB");
		instrument.setName("Ericsson B");
		instrument.setType(OpCodes.SHARE);
		
		Order a = new Order();
		a.setPrice(10.0);
		a.setOrderQuantity(10);
		a.setTimeEnteredOrderBook(0);
		a.setId(0);
		a.setInstrument(instrument);
		a.setOrderOwner("Test");
		a.setTimeEnteredSystem(0);
		a.setToSellOrder();
		a.setTypeOfOrder(OpCodes.LIMIT_ORDER);
	
		return a;
	}
	
	public static Order simpleBuyOrder() {
		
		Instrument instrument = new Instrument();
		instrument.setAbbreviation("ERB");
		instrument.setName("Ericsson B");
		instrument.setType(OpCodes.SHARE);
		
		Order a = new Order();
		a.setPrice(10.0);
		a.setOrderQuantity(10);
		a.setTimeEnteredOrderBook(0);
		a.setId(0);
		a.setInstrument(instrument);
		a.setOrderOwner("Test");
		a.setTimeEnteredSystem(0);
		a.setToBuyOrder();
		a.setTypeOfOrder(OpCodes.LIMIT_ORDER);
	
		return a;
	}

	public static ArrayList<Order> getOrderListA() {
		
		ArrayList<Order> orderList = new ArrayList<Order>();
		
		Order a = new Order();
		a.setTimeEnteredOrderBook(0);
		a.setPrice(1.0);
		a.setOrderQuantity(10);
		Order b = new Order();
		b.setTimeEnteredOrderBook(0);
		b.setPrice(2.0);
		b.setOrderQuantity(10);
		Order c = new Order();
		c.setTimeEnteredOrderBook(0);
		c.setPrice(3.0);
		c.setOrderQuantity(10);
		Order d = new Order();
		d.setTimeEnteredOrderBook(0);
		d.setPrice(4.0);
		d.setOrderQuantity(10);
		Order e = new Order();
		e.setTimeEnteredOrderBook(0);
		e.setPrice(5.0);
		e.setOrderQuantity(10);
		
		orderList.add(a);
		orderList.add(b);
		orderList.add(c);
		orderList.add(d);
		orderList.add(e);
		
		return orderList;
	}
	
	public static ArrayList<Order> getOrderListB() {
		
		ArrayList<Order> orderList = new ArrayList<Order>();
		
		Order a = new Order();
		a.setTimeEnteredOrderBook(0);
		a.setPrice(1.0);
		a.setOrderQuantity(20);
		Order b = new Order();
		b.setTimeEnteredOrderBook(0);
		b.setPrice(2.0);
		b.setOrderQuantity(10);
		Order c = new Order();
		c.setTimeEnteredOrderBook(0);
		c.setPrice(3.0);
		c.setOrderQuantity(10);
		Order d = new Order();
		d.setTimeEnteredOrderBook(0);
		d.setPrice(4.0);
		d.setOrderQuantity(10);
		Order e = new Order();
		e.setTimeEnteredOrderBook(0);
		e.setPrice(5.0);
		e.setOrderQuantity(10);
		
		orderList.add(a);
		orderList.add(b);
		orderList.add(c);
		orderList.add(d);
		orderList.add(e);
		
		return orderList;
	}
}
