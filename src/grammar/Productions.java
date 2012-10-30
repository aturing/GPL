package grammar;

import java.util.ArrayList;

/** 
 * 
 * Class that offers a concrete implementation of the interface Elements.
 * 
 **/

class Productions extends Elements<Production> implements Iterable<Production>{
	
	/**
	 * 
	 * Empty constructor.
	 *  
	 */
	Productions(){
		super();
	}
	
	/** 
	 * 
	 * Return the collection of productions whose left is nt.
	 * 
	 * @param nt
	 * 			The NonTerminal to be used as a filter.
	 * @throws GrammarException 
	 * 
	 **/
	public ArrayList<Production> getProductionsWithLeft(NonTerminal nt) throws GrammarException{
		ArrayList<Production> p = new ArrayList<Production>();
		if ( nt != null){
			for (Production it: this.values()) {
				if(it.getLeft().equals(nt)) {
					p.add(it);
				}
			}
		}
		return p;
	}

	
	/** 
	 * 
	 * Return the collection of productions whose left is e.
	 * 
	 * @param e
	 * 			The Element to be used as a filter.
	 * @throws GrammarException 
	 * 
	 **/
	public ArrayList<Production> getProductionsWithRight(Element e) throws GrammarException{
		ArrayList<Production> p = new ArrayList<Production>();
		if ( e != null){
			for (Production it: this.values()) {
				if(it.getLeft().equals(e)) {
					p.add(it);
				}
			}
		}
		return p;
	}
	
	/** 
     * 
     * Returns the production whose symbol is specified in a string. Null if none.
     * 
     * @param prod
     *          the string with the text that specifies the desired production
     * 
     **/
	public Production getThisProduction(String prod){
	    Production p = null;
	    
	    for (Production it: this.values()) {
	        if (it.getSymbol().equals( prod )){
	            p = it;
	        }
	    }	    
	        
        return p;
	}

}
