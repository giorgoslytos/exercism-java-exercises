import java.util.Arrays;
import java.util.regex.Pattern;

class LuhnValidator {


    public static boolean isValid(final String candidate) {
    	String str = candidate.replace(" ","");
    	if(!Pattern.matches("\\d\\d+", str))
    		return false;
    	
    	int[] arr= new int[str.length()];
    	for(int i=0; i<str.length();i++)
    		arr[i] = Integer.parseInt(str.substring(i,i+1));
    	
    	for(int i=2;i<=arr.length;i+=2) {
    		int num = 2 * arr[arr.length-i];
    		if( num > 9) 
    			num = num - 9;
    		arr[arr.length-i] = num;
    	}
    	
    	return (Arrays.stream(arr).sum()%10 == 0)?true:false;
    }

}
