
public class Product1ToN {

	public static void main(String[] args) {
		long product = 1;
		int end = 13;
		for(int start = 1; start <= end; start++) {
			product *= start;
		}
		
		System.out.println("Product of numbers 1 to 13: " + product);

	}

}
