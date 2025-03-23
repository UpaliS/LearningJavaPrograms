package ex_09_SwitchCase;

public class Lab091_InterviewQnA6 {

    public static void main(String[] args) {

        // It is only applicable for the JDK 13 and above

        int itemCode = 001;
        switch (itemCode) {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
