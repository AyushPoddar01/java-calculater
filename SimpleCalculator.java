import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();
        
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        double result = 0;
        
        switch(operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Error: Division by zero is not allowed");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                return;
        }
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}

