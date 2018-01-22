/*
 * Compute the sum of harmonics series from left-to-right and right-to-left.
 */
public class HarmonicSum {   // Save as "HarmonicSum.java"
	
   public static void main (String[] args) {
	   
      int maxDenominator = 50000;  // Use a more meaningful name instead of n
      int numerator = 1;
      double sumL2R = 0.0;    // sum from left-to-right
      double sumR2L = 0.0;    // sum from right-to-left
   
      
      // for-loop for summing from left-to-right
      for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
    	  
    	  double newdiv = (double)numerator / (double)denominator;
    	  sumL2R += newdiv;
          
      }
      System.out.println("The sum from left-to-right is: " + sumL2R);

      // for-loop for summing from right-to-left
      for (int newdenominator = maxDenominator; newdenominator >= 1; newdenominator--) {
    	  
    	  double newdiv = (double)numerator / (double)newdenominator;
    	  sumR2L += newdiv;
    	  
      }

      System.out.println("The sum from right-to-left is: " + sumR2L);
      
      double diff = (double)sumR2L - (double)sumL2R;
      System.out.println("The difference between the two: " + diff);
     
      // The for loop for summing from left-to-right is more accurate then the for loop for summing from right-to-left
   }
}