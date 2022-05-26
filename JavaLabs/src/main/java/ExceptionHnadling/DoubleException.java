package ExceptionHnadling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = 0;
        double b = 0;
        boolean valid = true;

        System.out.println("Enter 2 double values: ");

        do{
            try{
                a = sc.nextDouble();
                b = sc.nextDouble();
                valid = true;

                System.out.println("Sum = "+(a+b));
                System.out.println("Difference = "+(a-b));
                System.out.println("Product = "+(a*b));
                System.out.println("Quotient = "+(a/b));

            }
            catch (InputMismatchException ex){
                System.out.println("You must use double values, try again");
                sc.next();
                valid = false;
            }

        } while(!valid);

    }

}
