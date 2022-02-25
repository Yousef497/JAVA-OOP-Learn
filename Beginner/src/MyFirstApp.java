import java.util.Scanner;

public class MyFirstApp {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);
        int choice,num1,num2;

        System.out.println("Please Enter your Choice:");
        System.out.println("1. Add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Get the square of a number");

        choice = read.nextInt();

        switch(choice){

            case 1:
                System.out.println("Enter two positive integers:");
                num1 = read.nextInt();
                num2 = read.nextInt();
                System.out.println(num1 + num2);
                break;

            case 2:
                System.out.println("Enter two positive integers:");
                num1 = read.nextInt();
                num2 = read.nextInt();
                System.out.println(num1 - num2);
                break;

            case 3:
                System.out.println("Enter a positive integer:");
                num1 = read.nextInt();
                if(num1 > 0)
                    System.out.println(num1 * num1);
                    break;

            default:
                System.out.println("Invalid Choice");

        }


    }


}
