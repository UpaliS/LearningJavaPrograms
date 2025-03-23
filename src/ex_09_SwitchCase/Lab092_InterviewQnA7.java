package ex_09_SwitchCase;

public class Lab092_InterviewQnA7 {

    public static void main(String[] args) {

        // JDK --> 13

        int itemcode = 006;

        switch (itemcode) {
            case 001,002,005:
                System.out.println("All of them are Electronic Gadgets");
                break;
            case 004,006,007:
                System.out.println("All of them are mechanical");
                break;
            default:
                System.out.println("None");
                break;
        }
    }
}
