import java.util.Scanner;

public class Assignment301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Input brand (converse, nike, sketcher): ");
        String brand = sc.nextLine();
        System.out.print("Input category (slip on, high top, woman, man, kids, adult): ");
        String category = sc.nextLine();
        System.out.print("Input size: ");
        int size = sc.nextInt();

        int price = 0;

        
        if (brand.equals("converse")) {
            if (category.equals("slip on")) {
                if (size >= 36 && size <= 40) {
                    price = 800000;
                } else if (size >= 40 && size <= 44) {
                    price = 1200000;
                }
            } else if (category.equals("high top")) {
                
            }
        } else if (brand.equals("nike")) {
            
        } else if (brand.equals("sketcher")) {
            
        }

        
        System.out.println("Shoes price: Rp " + price);
    }
}