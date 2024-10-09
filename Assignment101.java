import java.util.Scanner;

public class Assignment101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Initialize max to the first number
        int max = num1;

        // Compare max with num2
        if (num2 > max) {
            max = num2;
        }

        // Compare max with num3
        if (num3 > max) {
            max = num3;
        }

        // Print the maximum number
        System.out.println("The maximum number is: " + max);

        scanner.close();
    }
}