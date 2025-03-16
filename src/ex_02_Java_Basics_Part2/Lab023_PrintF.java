package ex_02_Java_Basics_Part2;

public class Lab023_PrintF {

    public static void main(String[] args) {

        int a = 10;
        System.out.printf("Your variable is %d",a);

        // %d --> int,byte,short,long datatypes
        // %s --> string
        // %f --> float, double
        // %b --> boolean

        int b = 20;
        System.out.println(" ------ ");
        System.out.printf("%d + %d",a,b);
    }
}
