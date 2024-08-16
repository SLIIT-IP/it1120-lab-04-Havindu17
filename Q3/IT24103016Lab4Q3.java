import java.util.Scanner;
public class IT24103016Lab4Q3 {

  public static void main (String[] args ) {
  Scanner value = new Scanner (System.in);
  System.out.print("Enter value number:");
  int number= value.nextInt();

 String results = (number > 0) ? " Positive": (number<0) ? "Negative" : "Zero";
 System.out.println("The number is: " + results); 
    }
}

