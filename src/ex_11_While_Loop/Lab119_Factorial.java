package ex_11_While_Loop;

import java.util.Scanner;

public class Lab119_Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Create a scanner object to read input from the user
        System.out.println("Welcome to factorial program\n Enter a number");
        int number = scanner.nextInt(); // Read an integer input from the user

        int factorial = 1; // Initialize the factorial variable to 1
        if (number <= 0) { // check if the number is less than or equal to 0
            System.out.println(factorial);
        } else {
            //if the number is greater than 0, calculate the factorial
            for (int i = 1; i <= number; i++) { // loop from 1 to the number
                factorial = factorial * i; // multiply the current factorial value to i
            }
        }
        System.out.println("Factorial is -> " + factorial); // Print the calculated value
    }
}
