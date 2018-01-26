import java.util.Scanner;    // needed to use Scanner for input

public class CircleComputation {
   public static void main(String[] args) {
      double rad = 0.0;
      int number;
      
   // Setup a Scanner called in to scan the keyboard (System.in)
      Scanner in = new Scanner(System.in);

   // Read first input
      System.out.print("Enter a positive integer or -1 to exit: ");
      number = in.nextInt();
    
      while(number != -1) {
    	  
      System.out.print("Enter the radius: ");
      rad = in.nextDouble();    
      double area = Math.PI * (rad * rad);
      System.out.println("The area is: " + area);
      double circumference = 2 * Math.PI * rad;
      System.out.println("The circumference " + circumference);
      
   // Read next input (Take note that you need to repeat these statements)
      System.out.print("Enter a positive integer or -1 to exit: ");
      number = in.nextInt();
      
      }
      
      // Close the input stream
      in.close();
   }
}