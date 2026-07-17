public class Calculator {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 10;
        char operator = '+';

        switch (operator) {

            case '+':
                System.out.println("Addition = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Subtraction = " + (num1 - num2));
                break;

            case '*':
                System.out.println("Multiplication = " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("Division = " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            case '%':
                System.out.println("Remainder = " + (num1 % num2));
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}