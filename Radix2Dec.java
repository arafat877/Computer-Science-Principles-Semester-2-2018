import java.util.Scanner;

public class Radix2Dec {
	
	public static int Oct2Decimal(int octal) {
		int decimalNumber = 0, i = 0;

        while(octal != 0)
        {
            decimalNumber += (octal % 10) * Math.pow(8, i);
            ++i;
            octal/=10;
        }

        return decimalNumber;
    }
	
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
	
	public static int Binary2Decimal(int binaryNumber){

		int decimal = 0;
		int p = 0;
		while(true){
			if(binaryNumber == 0){
				break;
			} else {
				int temp = binaryNumber % 10;
				decimal += temp * Math.pow(2, p);
				binaryNumber = binaryNumber/10;
				p++;
			}
		}
		return decimal;
	}

	public static void main(String[] args) {
		
		int radix;
		int binStr;
		String hexStr; 
		int octStr;


		Scanner in = new Scanner(System.in);
		System.out.print("Enter a radix: ");
		radix = in.nextInt();   // use next() to read a String
		
		if (radix == 2) {
			System.out.print("Enter a String: ");
			binStr = in.nextInt();   // use next() to read a String
			System.out.println("The equivalent decimal number of " + binStr + " is: " + Binary2Decimal(binStr));
		}
		
		else if (radix == 8) {
			System.out.print("Enter a String: ");
			octStr = in.nextInt();   // use next() to read a String
			System.out.println("The equivalent decimal number of " + octStr + " is: " + Oct2Decimal(octStr));
		}
		
		else if (radix == 16) {
			System.out.print("Enter a String: ");
			hexStr = in.next();   // use next() to read a String
			System.out.println("The equivalent decimal number of " + hexStr + " is: " + hex2Decimal(hexStr));
		}

	}

}
