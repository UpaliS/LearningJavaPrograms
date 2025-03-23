package ex_11_While_Loop;

public class Lab113_While1 {

    public static void main(String[] args) {
        int i = 0; // Initialization
        while (i < 10) { // Condition ( must be true to enter the loop
            System.out.println("Start the program");
            System.out.println(i);
            i++; //Updation
        }

        // I.C.U
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
    }
}
