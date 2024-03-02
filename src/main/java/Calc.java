import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Welcome to Calculator!");
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Logarithm (log)");
        System.out.println("6. Square root (sqrt)");
        System.out.println("7. Power (^)");
        System.out.println("8. Factorial (!)");

        int choice = scanner.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                if (num2 != 0) {
                    result = divide(num1, num2);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            case 5:
                result = logarithm(num1, num2);
                break;
            case 6:
                result = squareRoot(num1);
                break;
            case 7:
                result = power(num1, num2);
                break;
            case 8:
                result = factorial((int) num1);
                break;
            default:
                System.out.println("Error! Invalid operation.");
                return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }


    public static double logarithm(double num1, double num2) {
        return Math.log(num1) / Math.log(num2);
    }

    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public static double power(double num, double exponent) {
        return Math.pow(num, exponent);
    }

    public static int factorial(int num) {
        if (num == 0)
            return 1;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
