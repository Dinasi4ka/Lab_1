package task1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double num1 = userInput("Input the first number: ");
        double num2 = userInput("Input the second number: ");
        String operation = getOperation();

        double result = selectOperation(num1,num2,operation);

        System.out.println("Result= "+result);
    }

    private static double userInput(String value) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(value);
        return scanner.nextDouble();
    }

    private static String getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an operation (+, -, *, /): ");
        return scanner.next();
    }

    private static double selectOperation(double num1, double num2, String operation) {
        double result = 0;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Division by 0 is impossible!");
                    System.exit(1);
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Incorrect operation: " + operation);
                System.exit(1);
        }

        return result;
    }
}
