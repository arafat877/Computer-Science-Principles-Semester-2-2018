import java.util.Scanner;

public class Oct2Dec {

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
	

	public static void main(String[] args) {

		int octStr;


		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String: ");
		octStr = in.nextInt();   // use next() to read a String

		System.out.println(Oct2Decimal(octStr));



	}

}
