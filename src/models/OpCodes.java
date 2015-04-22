package models;

public class OpCodes {

	/* Instrument types */
	public static final int STOCK = 0;
	
	/* Instrument abbreviation */
	public static final int ERIC_A = 100;
	public static final int HM_B = 101;
	
	/* Currencies */
	public static final int DOLLAR = 10;
	
	/* Message types */
	public static final int LOG_IN = 20;
	public static final int LOG_OUT = 21;
	public static final int BUY_ORDER = 22;
	public static final int SELL_ORDER = 23;
	public static final int TRADE = 24;
	public static final int MARKET_DATA = 25;
	public static final int ORDER = 26;
	public static final int LOG_IN_ACCEPTED = 27;
	public static final int LOG_IN_REJECTED = 28;
	
	
	/* User types */
	public static final int TRADER = 30;
	public static final int REGULATOR = 31;
	public static final int ISVR = 32;
	public static final int ADMIN = 33;
	
}

