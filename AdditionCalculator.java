/**
 * Programmer: Joseph Grados
 * Date: 10/14/2022
 * class: ITEC 2150
 * Professor: Hyesung Park
 * Purpose: It's an example of exceptionHandling in terms of an arithmetic purpose.
 */
import java.util.InputMismatchException;
public class AdditionCalculator {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
         boolean rightInput  = true;
         do{
             try{
                 System.out.println("Enter an the first whole number");
                 int num1 = sc.nextInt();
                 System.out.println("Enter the second whole number.");
                 int num2 = sc.nextInt();
                 int answer = num1 + num2;
                 rightInput =false;
                 System.out.println("The answer of " + num1+ " + " + num2 + " = " + answer);
             }
             catch(InputMismatchException e){
                 System.out.println(e);
                 System.out.println("Please try again");
                 sc.nextLine();
             }
             catch(ArithmeticException e){
                 System.out.println(e);
                 System.out.println("Please try again");
                 sc.nextLine();
             }
             catch(Exception e){
               e.printStackTrace();
             }

         }while(rightInput);

    }
}
