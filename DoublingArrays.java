import java.util.InputMismatchException;
import java.util.Random;

/**
 * Student: Joseph Grados
 * Course: ITEC 2150
 * Date: 10/14/2022
 * Professor: Hyesung Park
 * Purpose: It's a program to demonstrate the ArrayIndexOutOfBounds exception and
 * it's useful for array programs.
 */
public class DoublingArrays {
    public static void main(String[] args) {
        double [] numbers = new double[50];
        Random num = new Random();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for(int i  = 0; i < numbers.length; i++) {
            numbers[i] = num.nextDouble();

        }
        System.out.println("Enter any index in the array:");
        while(true) {
            try {
                int lastIndex = sc.nextInt();
                System.out.println(numbers[lastIndex]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Enter a proper integer again:");

            }catch(InputMismatchException e){
                sc.nextLine();
                System.out.println("Enter a proper integer again:");

            }
        }

    }
}
