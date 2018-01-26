import java.util.Scanner;              // Needed to use Scanner for input
import java.io.File;                   // Needed to use File
import java.io.FileNotFoundException;  // Needed for file operation
   
public class FileScanner { 
   public static void main(String[] args) 
         throws FileNotFoundException {  // Needed for file operation
      int num1;
      double num2;
      String name;
      double sum;
   
      // Setup a Scanner to read from a text file
      Scanner in = new Scanner(new File("in.txt"));
      
      num1 = in.nextInt();      // use nextInt() to read int
      System.out.println("The integer read is: " + num1);
      num2 = in.nextDouble();   // use nextDouble() to read double
      System.out.println("The floating point number is: " + num2);
      name = in.next();         // use next() to read String
      System.out.println("The String read is: " + name);
   
      sum = (double)num1 + num2;
      
      // Display
      System.out.println("Hi! " + name + ", the sum of " + num1 + " and " + num2 + " is " + sum);

     
      
      in.close();
   }
}