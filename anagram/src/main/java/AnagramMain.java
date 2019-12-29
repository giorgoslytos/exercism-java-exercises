
import java.util.Arrays;

public class AnagramMain {

	public static void main(String[] args) {
        
        Anagram detector3 = new Anagram("BANANA");
        System.out.println(detector3.match(Arrays.asList("BANANA", "Banana", "banana")));
	}

}
