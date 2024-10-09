import java.util.Scanner;

public class Selection2Exp1244107060159 {
    public static void main(String[] args) {
        Scanner input244107060159 = new Scanner(System.in);
        int year;
        
        System.out.print("Year: ");
        year = input244107060159.nextInt();

        if (year % 4 == 0) {
            System.out.println(year + "  is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println(year + "is not a leap year ");
        } else if (year % 4 == 0) {
            System.out.println(year + "  is a leap year ");
        } else {
            System.out.println(year + "is not a leap year");
        } 
        }
        }
