import java.util.Scanner;
public class IT24103016Lab4Q1 {

  public static void main (String[] args ) {
  Scanner value = new Scanner (System.in);
  System.out.print("Enter value number:");
  int number= value.nextInt();

 if(number>0){
 System.out.println("The number is Positive");

 }else if (number<0){
 System.out.println("The number is Negative");

 }else {
 System.out.println("The number is zero"); }
  }
}