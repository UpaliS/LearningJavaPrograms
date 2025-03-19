package ex_08_If_Condition;

public class Lab079_If_Condition2 {

    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age > 18) {
            System.out.println("Yes you are allowed to vote");
        }
        else {
            System.out.println("No you are not allowed to vote");
        }
    }
}
