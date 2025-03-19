package Tasks;

public class Task007_CLIandTernaryOperator {

    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        System.out.println(number1>number2 ? "number1 is max " +number1 : "number2 is max " +number2);
    }
}
