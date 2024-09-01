import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Welcome to the Simple Calculator!");

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting... Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;
            switch (choice) {
                case 1:
                    result = calculator.add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = calculator.subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = calculator.multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = calculator.divide(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
