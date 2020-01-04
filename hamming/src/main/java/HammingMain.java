public class HammingMain {

	public static void main(String[] args) {
		Hamming ham = new Hamming("ABCEe", "ABCDe");
        System.out.println( ham.getHammingDistance());
	}

}
