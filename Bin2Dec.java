import java.util.Scanner;
public class Bin2Dec{

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

	public static void main(String args[]){
		int binStr;    // The Input binary string

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Binary number: ");
		binStr = in.nextInt();   // use next() to read a String

		int ret = Binary2Decimal(binStr);

		System.out.println("The equivalent decimal number for binary " + binStr + " is: " + ret);
	}
}