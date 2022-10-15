/**
 * Student: Joseph Grados
 * Course: ITEC 2150
 * Date: 10/14/2022
 * Professor: Hyesung Park
 * Purpose: To made a custom exception to check if a triangle would properly fulfill the condition given in the checksides() method.
 */
package IllegalTriangleSideException;

import java.rmi.server.ExportException;

public class Triangle {
    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public boolean checkSides()throws IllegalTriangleSideException{
        if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2){
            System.out.println("This is a correct Triangle.");
            return true;

        }
        else{
            throw new IllegalTriangleSideException();
        }
    }

    public static void main(String[] args) throws IllegalTriangleSideException{
        Triangle t1 = new Triangle(1.5,1.7,1.3);
        t1.checkSides();
        Triangle t2 = new Triangle(1.2,1.6,1.8);
        t2.checkSides();
        Triangle t3 = new Triangle(1.2,2.3,3.5);
        t3.checkSides();

    }

}

class IllegalTriangleSideException extends Exception{
    public IllegalTriangleSideException() {

        System.out.println("It's an illegal triangle.");

    }
}
