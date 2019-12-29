class Proverb {
	
	String[] words;
	
    Proverb(String[] words) {
    	this.words = words;
    }

    public String recite() {
    	String output = "";
    	for(int i=0;i<this.words.length-1;i++)
    		output += "For want of a " + this.words[i] + " the " + this.words[i+1] + " was lost.\n";
    	if(this.words.length>0)
    		output += "And all for the want of a " + this.words[0] + ".";
    	return output;
    }
}
