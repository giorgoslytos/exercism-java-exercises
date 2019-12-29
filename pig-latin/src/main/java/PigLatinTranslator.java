class PigLatinTranslator {
	
	String translate(String phrase){
		String[] words = phrase.split(" ");
		for(int i=0; i < words.length; i++) {
			if (words[i].charAt(0) == 'a' || words[i].charAt(0) ==  'e' || words[i].charAt(0) ==  'i' || words[i].charAt(0) ==  'o' || words[i].charAt(0) ==  'u') {
				words[i] += "ay";
			}
			else if ((words[i].charAt(0) == 'y' && words[i].charAt(1) ==  't') || (words[i].charAt(0) ==  'x' && words[i].charAt(1) ==  'r')) {
				words[i] += "ay";
			}
			else words[i] = consonantFunction(words[i]);
		}
		return String.join(" ", words);
	}
	
	String consonantFunction(String word) {
		int i=0;
		String tmp="";
		while(i<word.length()) {
			if (word.charAt(i) == 'a' || word.charAt(i) ==  'e' || word.charAt(i) ==  'i' || word.charAt(i) ==  'o' || word.charAt(i) ==  'u') {
				break;
			}
			if(word.charAt(i+1) == 'y') {
				tmp += word.charAt(i++);
				break;
			}
			if (word.charAt(i) == 'q' && word.charAt(i+1) == 'u') {
				tmp += word.charAt(i++);
			}
			tmp += word.charAt(i++);
		}
		return word.substring(i) + tmp + "ay";
	}
}
