package ex_09_SwitchCase;

import java.util.Scanner;

public class Lab085_Realtime_SwitchCase {

    public static void main(String[] args) {

        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use , so that I will start the automation in that browser

        // String browser = args[0];
        // system.out.println(browser);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser Name");
        String browser = scanner.next();

        switch (browser) {
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("-------------");
                System.out.println("Running TC1");
                System.out.println("Running TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                //Further code to start the firefox
                // Webdriver driver = new firefox(); // Selenium code
                break;
            case "edge":
                System.out.println("Execute the Edge code");
                break;
            default:
                System.out.println("Invalid browser name");
                break;
        }
    }
}
