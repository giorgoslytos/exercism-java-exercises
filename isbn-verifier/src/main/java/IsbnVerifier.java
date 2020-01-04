import java.util.regex.Pattern;
import java.util.stream.IntStream;

class IsbnVerifier {

    public static boolean isValid(final String stringToVerify) {

    	if(!Pattern.matches("([\\d]-[\\d]{3}-[\\d]{5}-[\\d|X])|([\\d]{9}[\\d|X])", stringToVerify)) 
    		return false;
    	
    	String str = stringToVerify.replace("-", "");

    	int sum =  IntStream
    		.range(0, 9)
    		.map(i-> (10-i) * Integer.parseInt(str.substring(i,i+1)))
    		.sum();
    	
    	if(str.substring(9,10).equals("X"))
    		sum += 10;
    	else 
    		sum += Integer.parseInt(str.substring(9,10));
    	
    	return sum%11==0;
    }

}
