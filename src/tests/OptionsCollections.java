package tests;

import java.util.ArrayList;

import models.OpCodes;
import models.OpNames;
import models.Option;

public final class OptionsCollections {
	
	public static ArrayList<Option> smallOptionsSet(){
		Option call1 = new Option();
		call1.setStrikePrice(10.0);
		call1.setTheoreticPrice(2.0);
		call1.setTimeToMaturity(0.25);
		call1.setInstrument(OpNames.INSTRUMENT1);
		call1.setType(OpCodes.CALL_OPTION);
		
		Option call2 = new Option();
		call2.setStrikePrice(11.0);
		call2.setTheoreticPrice(2.0);
		call2.setTimeToMaturity(0.25);
		call2.setInstrument(OpNames.INSTRUMENT1);
		call2.setType(OpCodes.CALL_OPTION);
		
		Option put1 = new Option();
		put1.setStrikePrice(9.0);
		put1.setTheoreticPrice(2.0);
		put1.setTimeToMaturity(0.25);
		put1.setInstrument(OpNames.INSTRUMENT1);
		put1.setType(OpCodes.PUT_OPTION);
		
		Option put2 = new Option();
		put2.setStrikePrice(9.0);
		put2.setTheoreticPrice(2.0);
		put2.setTimeToMaturity(0.5);
		put2.setInstrument(OpNames.INSTRUMENT1);
		put2.setType(OpCodes.PUT_OPTION);
		
		
		ArrayList<Option> options = new ArrayList<Option>();
		options.add(call1);
		options.add(call2);
		options.add(put1);	
		options.add(put2);
		
		return options;
	}
	
}
