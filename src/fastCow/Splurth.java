package fastCow;

/**
 * 	this planet deserves a look
 *
 *	(imports are for loosers)
 */
public class Splurth {

	/***
	 * Java retro-coding, for my sponsor :
	 * 
     *                     _(__)_        V
     *                    '-e e -'__,--.__)
     *                     (o_o)        ) 
     *                        \. /___.  |
     *                        ||| _)/_)/
     *                       //_(/_(/_(
	 * 
	 *  no indexOf or toLowerCase because that cow's too lazy to at each char more than once
	 * 	no validations at all, please copy paste from another submission
	 *	(also means symbol can be as long as you want)
	 * 
	 * @param element the full element's name 
	 * @param symbol the short version 2chars Representation of the element
	 * @return cow's actual mood about symbol and element's concordance 
	 */
	public boolean isValidSymbolForElement(String element, String symbol) {
		
		int eltIdx = 0;
		int sybIdx = 0;

		//state-of-the-art java labels
		symbolLoop: 
		for (; sybIdx < symbol.length(); sybIdx++) {
			for (; eltIdx < element.length(); eltIdx++) {
				if (symbol.charAt(sybIdx) % 32 == element.charAt(eltIdx) % 32) {	
					//found it ! lets move to the next symbol's letter
					eltIdx++;
					continue symbolLoop;
				}
			}
			//we didn't find one of the symbol's char ? sad cow :(
			return false;
		}
		return true;
	}
}
