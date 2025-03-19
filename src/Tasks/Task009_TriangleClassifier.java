package Tasks;

import java.util.Scanner;

public class Task009_TriangleClassifier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first side of the triangle");
        int side1 = sc.nextInt();
        System.out.println("Enter the length of second side of the triangle");
        int side2 = sc.nextInt();
        System.out.println("Enter the length of third side of the triangle");
        int side3 = sc.nextInt();

        if(side1 == side2 && side2 == side3) {
            System.out.println("Triangle is equilateral");
        }
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Triangle is isoceles");
        }
        else {
            System.out.println("Triangle is Scalene");
        }
    }
}
