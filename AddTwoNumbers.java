import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter first number: ");       // Ask user for the first number
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");    // Ask user for the second number
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
