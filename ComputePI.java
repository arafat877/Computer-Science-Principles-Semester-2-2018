
public class ComputePI {

	public static void main (String[] args) {

//		double sum = 0.0;
//		//int maxDenominator = 10000000;
//		int maxDenominator = 100000;
//		int numerator = 1;
//		for (int denominator = 1; denominator <= maxDenominator; denominator += 2) {  // 1, 3, 5, 7,...
//			if (denominator % 4 == 1) {
//				sum += ((double)numerator / (double)denominator);
//			} else if (denominator % 4 == 3) {
//				sum -= ((double)numerator / (double)denominator);
//			} else {   // remainder of 0 or 2
//				System.out.println("The computer has gone crazy?!");
//			}
//		}
		
		int maxTerm = 25000;  // number of terms used in computation
		double sum = 0.0;
		for (int term = 1; term <= maxTerm; term++) {  // term = 1,2,3,... ,maxTerm
		   if (term % 2 == 1) {  // odd term number: add
		      sum += 1.0/(term*2-1);
		   } else {              // even term number: subtract
			   sum -= 1.0/(term*2-1);
		   }
		}
		
		System.out.println("PI = " + (4 * sum));
		System.out.println("Real PI = " + Math.PI);
	}

}
