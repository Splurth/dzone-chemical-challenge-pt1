package fastCow;

/** Oops Junit4 dependency, busted */

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class SplurthTest {

	private String element;
	private String symbol;
	private boolean expectedMatch;
	
	private static Object[][] testData = new Object[][] {
		{ "Spenglerium", "Ee", true },
		{ "Zeddemorium", "Zr", true },
		{ "Venkmine", "Kn", true }, 
		{ "Stantzon", "Zt", false }, 
		{ "Melintzum", "Nn", false },
		{ "Tullium", "Ty", false },
		};

	@Test
	public void testSomeElements() {
		
		Splurth splurth = new Splurth();
		
		for (Object[] entry : testData) {
			
			element=(String) entry[0];
			symbol=(String) entry[1];
			expectedMatch = (boolean) entry[2];
			
			assertEquals(
					"cow's not happy about symbol "+symbol+" for element "+element
					,expectedMatch
					,splurth.isValidSymbolForElement(element, symbol)
					);
			
		}
	}
}

