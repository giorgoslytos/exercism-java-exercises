import java.util.regex.Pattern;

class LargestSeriesProductCalculator {
	
	String inputNumber;
	long max=0;
	
    LargestSeriesProductCalculator(final String inputNumber) {
    	if(!Pattern.matches("\\d*", inputNumber))
    		throw new IllegalArgumentException("String to search may only contain digits.");
    	this.inputNumber = inputNumber;
    }

    long calculateLargestProductForSeriesLength(final int numberOfDigits) {
    	if(numberOfDigits>inputNumber.length())
    		throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
    	if(numberOfDigits<0)
    		throw new IllegalArgumentException("Series length must be non-negative.");
    	
    	long[] multArr = new long[inputNumber.length()-numberOfDigits+1];
    	
    	for(int i=0; i<=inputNumber.length()-numberOfDigits; i++) {
    		long mul = 1;
    		for(int j=0; j<numberOfDigits;j++) {
    			mul = mul * Long.parseLong(inputNumber.substring(i+j, i+j+1));
    		}
    		multArr[i] = mul;
    	}
    	
        for(long cur: multArr)
        	max = Math.max(max, cur);
    	
    	return max;
    }
}
