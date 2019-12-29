class ReverseString {

	public String reverse(String inputString) {
    	char[] tmp = inputString.toCharArray();
    	char[] output = new char[tmp.length];
    	
    	for(int i=0;i<tmp.length;i++) {
    		output[i] = tmp[tmp.length-1-i];
    	}
    	return String.valueOf(output);
    }
  
}