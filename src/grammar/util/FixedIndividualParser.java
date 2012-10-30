package grammar.util;

import grammar.GrammarException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Vector;

public class FixedIndividualParser {
    
    private FileReader file;
    private BufferedReader buffer;

    public FixedIndividualParser(String path) throws GrammarException{
              
        try {
            file = new FileReader(path);
            buffer = new BufferedReader(file);
        } catch (FileNotFoundException e) {
            throw new GrammarException(e.getMessage());
        }
        
    }
    
    public Vector<String> getProductions(){
        Vector<String> res = new Vector<String>();
        
        String line;

        try {
            while((line = buffer.readLine()) != null) {
                if (!line.substring( 0, 2 ).equals( "//" )) res.add( line );
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        return res;
    }

}
