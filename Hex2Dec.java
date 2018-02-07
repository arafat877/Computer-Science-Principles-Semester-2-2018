import java.util.Scanner;

public class Hex2Dec {

	public static int hex2Decimal(String s) {
		String digits = "0123456789ABCDEF";
		s = s.toUpperCase();
		int val = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int d = digits.indexOf(c);
			val = 16*val + d;
		}
		return val;
	}

	public static void main(String[] args){
		String hexStr;
		

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String: ");
		hexStr = in.next();   // use next() to read a String

		System.out.println(hex2Decimal(hexStr));




	}

}

