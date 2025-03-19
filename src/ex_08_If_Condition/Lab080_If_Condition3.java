package ex_08_If_Condition;

import java.util.Scanner;

public class Lab080_If_Condition3 {

    public static void main(String[] args) {
         // allowed to vote or not
        // If age > 18 --> allowed to vote
        // else age < > 18 --> not allowed to vote

        // How to take the user input
        // 1. CLI options
        // int age = Integer.parseInt(args[]);

        // 2. Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age!");
        int age = scanner.nextInt();
        System.out.println(age);

        if (age > 18) {
            System.out.println("Allowed to vote!");
        }
        else {
            System.out.println("Not Allowed");
        }

    }
}
