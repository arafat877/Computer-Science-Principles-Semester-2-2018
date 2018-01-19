/*
 * Compute the sum and average of running numbers from a lowerbound to an upperbound using loop.
 */
public class SumAndAverage {   // Save as "SumAndAverage.java"
	public static void main (String[] args) {
		int sum = 0;          // Store the accumulated sum, init to 0
		double average;       // average in double
		int lowerbound = 1;   // The lowerbound to sum
		int upperbound = 100; // The upperbound to sum

		// Use a for-loop to sum from lowerbound to upperbound
		//      for (int number = lowerbound; number <= upperbound; ++number) {
		//         sum += number;     // same as "sum = sum + number"
		//      	}
		// 1. Use a "while-do" loop 
		//      int number = lowerbound;
		//      while (number <= upperbound) {
		//         sum += number;
		//         ++number;
		//      }
		// 2. Use a "do-while" loop
		//      int number = lowerbound;
		//      do {
		//         sum += number;
		//         ++number;
		//      } while (number <= upperbound);

		/* 3. The difference between the for loop and "while-do" loop is that the for loop will take in a initialization, a condition, and 
		 * then it will increment the variable. All this will loop over and over till the condition is false. In a "while-do" loop, the loop takes
		 * in a conditional. If the conditional is true then it will loop till the conditional is false. In a "do-while" loop, the code first 
		 * completes some code, then the conditional is check afterwards. The difference between the "while-do" loop and the "do-while" loop, is
		 * the order of when the conditional is checked.
		 */

		// 4. Gets the sum from 111 to 8899, computes the average, and counts the numbers within the range
		//		int up = 111;
		//		int down = 8899;
		//		int count = 0;   // count the number within the range, init to 0
		//		for (int number = up; number <= down; number++) {
		//			sum += number;
		//			++count;
		//		}
		//		average = (double)sum/(double)count;
		//		System.out.println("The amount of numbers within range: " + count); //print out numbers within the range

		// 5. Gets the sum of all the odd numbers between 1 and 100
		//		int count = 0;
		//		for(int number = lowerbound; number <= upperbound; ++number) {
		//			if(number % 2 != 0) {
		//				sum += number;
		//				++count;
		//			}
		//			
		//		}
		//		average = (double)sum/(double)count;

		// 6. Gets the sum of all the numbers between 1 to 100 that are divisible by 7
		//		int count = 0;
		//		for(int number = lowerbound; number <= upperbound; ++number) {
		//			if(number % 7 == 0) {
		//				sum += number;
		//				++count;
		//			}
		//			
		//		}
		//		average = (double)sum/(double)count;

		// 7. Gets the sum of all the numbers between 1 to 100 that are all squared
		int square = 0;
		for (int number = lowerbound; number <= upperbound; ++number) {
			square = number * number;
			sum += square;     // same as "sum = sum + number"
		}

		// Compute average in double. Beware that int/int produces int.
		average = (double)sum/(double)upperbound;
		// Print sum and average.
		System.out.println("The sum is: " + sum + " and the average is: " + average);

	}
}