package tests;

import static org.junit.Assert.*;
import jdsl.core.api.Tree;
import grammar.Derivation;
import grammar.Grammar;
import grammar.GrammarException;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class MutationTest {

    private Grammar grammar;
    int maxDepth = 100;

    public MutationTest() {
        try {
            grammar = new Grammar( "Grammars/g4.gr" );
        }
        catch (final GrammarException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    @Test
    public void generateANDmutate(){
        Derivation auxD = null, auxD2 = null;
        
        for (int i = 0; i < 1; i++) {
            try {
                auxD = new Derivation( grammar, maxDepth );            
            }
            catch (final GrammarException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println( auxD.getWord() );   
            try {
                auxD2 = auxD.mutate();                
            }
            catch (GrammarException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
           
            System.out.println( auxD2.getWord() );
            System.out.println("Mutation distance: "+StringUtils.getLevenshteinDistance( auxD.getWord(), auxD2.getWord()));
            
            
        }

    }

}
