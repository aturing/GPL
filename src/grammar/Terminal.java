package grammar;

/** 
 * 
 * Class that offers a concrete implementation of the interface Terminal.
 * 
 **/

public class Terminal extends Element {

	
	/**
	 * 
	 *  Constructor that receives the ID and the Symbol.
	 *  
	 *  @param id
	 *  			The ID of the Terminal.
	 *  
	 *  @param symbol
	 *  				The symbol associated to the Terminal.
	 * 
	 **/
	public Terminal(int id, String symbol) throws GrammarException{
		super(id, symbol);
		this.setDepth(0);
	}
}
