import java.util.Scanner;
public class Assignment201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is it Wednesday? (yes/no): ");
        String isWednesday = scanner.nextLine();
        System.out.print("Enter book category (dictionary, novel, other): ");
        String category = scanner.nextLine();
        System.out.print("Enter number of books: ");
        int numBooks = scanner.nextInt();
        double baseDiscount = 0;
        switch (category) {
            case "dictionary":
                baseDiscount = 10;
                break;
            case "novel":
                baseDiscount = 7;
                break;
            default:
                baseDiscount = 5;
        }
        double additionalDiscount = 0;
        if (isWednesday.equalsIgnoreCase("yes")) {
            if (numBooks >= 37) {
                additionalDiscount = 19;
            } else if (numBooks >= 2) {
                additionalDiscount = 2;
            }
        } else if (numBooks >= 37) {
            additionalDiscount = 1;
        }
        double totalDiscount = baseDiscount + additionalDiscount;
        double finalPrice = 100 - totalDiscount;
        System.out.println("Total discount: " + totalDiscount + "%");
        System.out.println("Final price: " + finalPrice + "%");
    }
}