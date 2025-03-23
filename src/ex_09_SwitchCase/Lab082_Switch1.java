package ex_09_SwitchCase;

import java.util.Scanner;

public class Lab082_Switch1 {

    public static void main(String[] args) {

        //Switch
        //Take the user input and tell the day which they have told
        // 1 to 7 --> 1 -> Monday, 5 -> Tuesday
        // 8 -> not allowed or error

        // int day = Integer.parseInt(args[0]); --> CLI option

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day number (1 to 7)");
        int day = scanner.nextInt();

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
                break;
        }

    }
}
