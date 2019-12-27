import java.util.HashSet;
import java.util.Set;

class IsogramChecker {

    boolean isIsogram(String phrase) {
    	Set<Character> set = new HashSet<Character>();

    	for(char c : phrase.toLowerCase().toCharArray()) {
    		if(c == ' ' || c == '-') continue;
    		if(set.add(c) == false) return false;
    	}
    	return true;
    }
}
