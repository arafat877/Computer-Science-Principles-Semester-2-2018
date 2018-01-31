import java.util.Scanner;

public class CheckVowelsDigits {

	public static void main(String[] args) {
		String inStr;        // input String
		int inStrLen;
		int count = 0;
		int vcount = 0;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String: ");
		inStr = in.next();   // use next() to read a String
		inStr = inStr.toLowerCase();
		inStrLen = inStr.length();

		for (int i = inStrLen - 1; i >= 0; --i) {  // Process the String from the right
	         char s = inStr.charAt(i);
			if (s >= '0' && s <= '9' ) {
				count++;
			}
			if ((s == 'a') || (s == 'e') || (s == 'i') || (s == 'o') || (s == 'u')) {
				vcount++;
			}
		}
		
		double vpercent = ((double)vcount / (double)inStrLen) * 100;
		double percent = ((double)count / (double)inStrLen) * 100;
				
		System.out.println("Number of vowels: " + vcount + "(" + vpercent + "%)");
		System.out.println("Number of digits: " + count + "(" + percent + "%)");
	}
}