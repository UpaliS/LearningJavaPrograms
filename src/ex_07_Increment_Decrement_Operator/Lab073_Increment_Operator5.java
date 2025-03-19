package ex_07_Increment_Decrement_Operator;

public class Lab073_Increment_Operator5 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);

        // A+B
        // A --> a++ --> ExpA -> 10, a=11
        // +
        // B --> a --> expA + expB --> 10+11

        // Line No. | a | Exp
        // 6 | 10 | NA
        // 7 | 11 | 10+11 --> 21
    }
}
