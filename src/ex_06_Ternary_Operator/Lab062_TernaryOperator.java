package ex_06_Ternary_Operator;

public class Lab062_TernaryOperator {
    public static void main(String[] args) {
        // syntax ---> result = condition ? expression1 : expression2;
        int number = 5;
        String result = number > 0 ? "Positive" : "Negative";
        System.out.println(result);
    }
}

