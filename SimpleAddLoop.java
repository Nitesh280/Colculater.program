
import java.util.Scanner;

public class SimpleAddLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String again;

        do {
            
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            int sum = a + b;
            System.out.println("Sum: " + sum);

            System.out.print("Do you want to add more numbers? (yes/no): ");      // Ask to continue
            again = scanner.next();

        } while (again.equalsIgnoreCase("yes"));

        System.out.println("Goodbye!");
        scanner.close();
    }
}
