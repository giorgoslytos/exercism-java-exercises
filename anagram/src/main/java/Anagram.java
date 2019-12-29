import java.util.ArrayList;
import java.util.List;

class Anagram {
	
	
	private String word;

	public Anagram(String word) {
		this.word = word;
	}
	
	public List<String> match(List<String> arr){
		List<String> output = new ArrayList<String>();
		for(String a : arr) {
			if(a.length() != this.word.length())
				continue;
			if(checkAnagram(a)) output.add(a);
		}
		return output;
	}
	private boolean checkAnagram(String anagr) {
		StringBuilder anagram = new StringBuilder(anagr.toLowerCase());
		StringBuilder word = new StringBuilder(this.word.toLowerCase());
		if(anagram.toString().equals(word.toString())) return false;
		
		for(int i = 0;i<this.word.length();i++) {
			try {
				anagram.deleteCharAt(anagram.indexOf(word.substring(0,1)));				
			} catch(Exception e) {
				return false;
			}
			word.deleteCharAt(0);
		}
		if(word.length()==0 && anagram.length()==0) return true;
		else return false;
	}
}
