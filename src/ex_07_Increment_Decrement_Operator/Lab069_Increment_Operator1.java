package ex_07_Increment_Decrement_Operator;

public class Lab069_Increment_Operator1 {

    public static void main(String[] args) {

        int a = 10;
        int b = ++a; // 10+1 --> 11
        System.out.println(b); //11
        System.out.println(a); //11

        //Exp and result table
        // line no | a | Result b
        // 7 | 10 | NA
        // 8 | 11 | 11
        // 9 | 11(na) | 11
        // 11 | 11 | 11(NA)
    }
}
