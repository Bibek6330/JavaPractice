import java.util.Scanner;

public class Practice4 {
    // Java program for simple calculator
    // Driver class
    public static class BasicCalculator {
        // main function
        public static void main(String[] args)
        {
            // Stores two numbers
            double num1, num2;

            // Take input from the user
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the numbers:");

            // Take the inputs
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();

            System.out.println("Enter the operator (+,-,*,/):");

            char op = sc.next().charAt(0);
            double o = 0;

            switch (op) {
                // case to add two numbers
                case '+':
                    o = num1 + num2;
                    break;

                // case to subtract two numbers
                case '-':
                    o = num1 - num2;
                    break;

                // case to multiply two numbers
                case '*':
                    o = num1 * num2;
                    break;

                // case to divide two numbers
                case '/':
                    o = num1 / num2;
                    break;

                default:
                    System.out.println("You enter wrong input");
            }

            System.out.println("The final result:");
            System.out.println();

            // print the final result
            System.out.println(num1 + " " + op + " " + num2
                    + " = " + o);
        }
    }
}
