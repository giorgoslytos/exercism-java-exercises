import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProteinTranslator {

    public List<String> translate(String rnaSequence) {
    	
    	List<String> output = new ArrayList<String>();
    	Map<String, String> dictionary = new HashMap<String, String>();
    	dictionary.put("AUG", "Methionine");
    	dictionary.put("UUU", "Phenylalanine");
    	dictionary.put("UUC", "Phenylalanine");
    	dictionary.put("UUA", "Leucine");
    	dictionary.put("UUG", "Leucine");
    	dictionary.put("UCU", "Serine");
    	dictionary.put("UCC", "Serine");
    	dictionary.put("UCA", "Serine");
    	dictionary.put("UCG", "Serine");
    	dictionary.put("UAU", "Tyrosine");
    	dictionary.put("UAC", "Tyrosine");
    	dictionary.put("UGU", "Cysteine");
    	dictionary.put("UGC", "Cysteine");
    	dictionary.put("UGG", "Tryptophan");
    	
    	int i=0;
    	while(dictionary.get(rnaSequence.substring(i, i+3))!= null) {
    		output.add(dictionary.get(rnaSequence.substring(i, i+3)));
    	}
    	   	
    	return output;
    }
    
}