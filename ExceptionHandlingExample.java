import java.util.Scanner;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        try {
            int number = Integer.parseInt(scanner.nextLine());
            
            // Check if the number is positive
            if (number < 0) {
                throw new IllegalArgumentException("Number must be positive");
            }

            // Perform some operation with the input number
            int result = 10 / number;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter a valid number.");
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            // Close any necessary resources (e.g., Scanner)
            scanner.close();
            System.out.println("Finally block executed. Scanner closed.");
        }

        System.out.println("Program execution continues after try-catch-finally block.");
    }
}
