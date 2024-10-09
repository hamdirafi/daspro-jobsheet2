import java.util.Scanner;
public class Selection2Exp2244107060159 {
    public static void main(String[] args) {
        Scanner input244107060159 = new Scanner(System.in);
        int angle1;
        int angle2;
        int angle3;
        int totalAngle;

        System.out.print("angle1: ");
        angle1 = input244107060159.nextInt();
        System.out.print("angle2: ");
        angle2 = input244107060159.nextInt();
        System.out.print("angle3: ");
        angle3 = input244107060159.nextInt();
        
        totalAngle = angle1 + angle2 + angle3;
        
        if (totalAngle == 180) {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Right triangle");
            } else if (angle1 == angle2 && angle2 == angle3) {
                System.out.println("Equilateral triangle");
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Not a right triangle");
            }
        } else {
            System.out.println("Not a triangle (sum of angles must be 180 degrees)");
        }
    }
}