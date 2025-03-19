package ex_06_Ternary_Operator;

public class Lab066_TO_MaxOnThree {

    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        //Logic Building Formula
        //Step 1 : Find inputs/outputs
        // I/O -> n1,n2,n3 - int
        // O/T -> String -> Max number

        // Step 2 - Rough logic
        //n1>n2 and n1>n3 -> n1
        //n2>n3 and n2>n1 -> n2
        //n3

        int max = (n1>n2) ? (n1>n3) ? n1:n3 : ((n2>n3) ? n2:n3);
        System.out.println("Maximum is " + max);
    }
}
