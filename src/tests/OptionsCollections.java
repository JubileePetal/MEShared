package tests;

import java.util.ArrayList;

import models.OpCodes;
import models.OpNames;
import models.Option;

public final class OptionsCollections {
	
	public static ArrayList<Option> smallOptionsSet(){
		Option call1 = new Option();

		call1.setId(12);
		call1.setStrikePrice(1098.0);
		call1.setTheoreticPrice(2.0);
		call1.setTimeToMaturity(0.25);
		call1.setInstrument(OpNames.INSTRUMENT1);
		call1.setType(OpCodes.CALL_OPTION);
		call1.setStatus(OpCodes.SELL_OPTION);		
		
		Option call11 = new Option();
		call11.setId(122);
		call11.setStrikePrice(10.0);
		call11.setTheoreticPrice(2.0);
		call11.setTimeToMaturity(0.25);
		call11.setInstrument(OpNames.INSTRUMENT1);
		call11.setType(OpCodes.CALL_OPTION);
		call11.setStatus(OpCodes.BUY_OPTION);
		
		
		Option call2 = new Option();

		call2.setId(13);
		call2.setStrikePrice(11.0);
		call2.setStrikePrice(1102.0);
		call2.setTheoreticPrice(2.0);
		call2.setTimeToMaturity(0.25);
		call2.setInstrument(OpNames.INSTRUMENT1);
		call2.setType(OpCodes.CALL_OPTION);
		call2.setStatus(OpCodes.SELL_OPTION);
		
		Option call22 = new Option();
		call22.setId(133);
		call22.setStrikePrice(11.0);
		call22.setTheoreticPrice(2.0);
		call22.setTimeToMaturity(0.25);
		call22.setInstrument(OpNames.INSTRUMENT1);
		call22.setType(OpCodes.CALL_OPTION);
		call22.setStatus(OpCodes.BUY_OPTION);
		
		
		Option put1 = new Option();

		put1.setId(14);
		put1.setStrikePrice(1099.0);
		put1.setTheoreticPrice(2.0);
		put1.setTimeToMaturity(0.25);
		put1.setInstrument(OpNames.INSTRUMENT1);
		put1.setType(OpCodes.PUT_OPTION);
		put1.setStatus(OpCodes.SELL_OPTION);
		
		
		Option put11 = new Option();
		put11.setId(144);
		put11.setStrikePrice(9.0);
		put11.setTheoreticPrice(2.0);
		put11.setTimeToMaturity(0.25);
		put11.setInstrument(OpNames.INSTRUMENT1);
		put11.setType(OpCodes.PUT_OPTION);
		put11.setStatus(OpCodes.BUY_OPTION);
		
		
		Option put2 = new Option();

		put2.setId(15);
		put2.setStrikePrice(1101.0);
		put2.setTheoreticPrice(2.0);
		put2.setTimeToMaturity(0.5);
		put2.setInstrument(OpNames.INSTRUMENT1);
		put2.setType(OpCodes.PUT_OPTION);
		
		
		ArrayList<Option> options = new ArrayList<Option>();
		options.add(call1);
		options.add(call11);
		options.add(call2);
		options.add(call22);
		options.add(put1);
		options.add(put11);
		options.add(put2);
		
		
		return options;
	}
	
}
