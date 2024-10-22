
import java.util.Scanner;

 public class calculator{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter the first number:");
        double num2 = sc.nextDouble();
        System.out.print("Enter the operation(+,-,*,/):");
        char operation = sc.next().charAt(0);
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not defind.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                break;
            }


    }
 }