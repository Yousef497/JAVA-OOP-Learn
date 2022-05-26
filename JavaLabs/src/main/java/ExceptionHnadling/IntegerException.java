package ExceptionHnadling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        boolean valid = true;

        System.out.println("Enter 2 integers: ");

        do{
            try{
                a = sc.nextInt();
                b = sc.nextInt();
                valid = true;

                System.out.println("Sum = "+(a+b));
                System.out.println("Difference = "+(a-b));
                System.out.println("Product = "+(a*b));
                System.out.println("Quotient = "+(a/b));
                System.out.println("Remainder = "+(a%b));

            }
            catch (InputMismatchException ex){
                System.out.println("You must use integers, try again");
                sc.next();
                valid=false;
            }

            catch (ArithmeticException ex){
                System.out.println("Quotient = " + ((a==0) ? "Undefined Quantity" : ((a>0)? "+Infinity" : "-Infinity")));
                System.out.println("Remainder = 0");
            }

        } while (!valid);


    }

}
