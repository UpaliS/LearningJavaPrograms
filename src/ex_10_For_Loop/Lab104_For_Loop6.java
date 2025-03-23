package ex_10_For_Loop;

public class Lab104_For_Loop6 {

    public static void main(String[] args) {

        // any datatype can be used inside a for loop.
        // It can be long, float, etc however it is not recommended to use
        for (long i = 1l; i<10; i++) {
            System.out.println(i);
        }
        for (float f = 0.0f; f < 10.67; f++ ) {
            System.out.println("Hi, float ->" + f);
        }
    }
}
