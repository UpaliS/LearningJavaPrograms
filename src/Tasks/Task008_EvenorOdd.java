package Tasks;

public class Task008_EvenorOdd {

    public static void main(String[] args) {

       System.out.println("Enter the number to check odd or even");
        int number = Integer.parseInt(args[0]);
        if (number%2==0) {
            System.out.println("The number " + number + " is even.");
        }
        else {
            System.out.println("The number " + number + " is odd");
        }

    }
}
