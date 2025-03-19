package ex_05_TypeCasting;

public class Lab060_TypeCasting_Used {

    public static void main(String[] args) {
        int course = 100;
        float GST = 18.85f;
        // int total = course+GST; //Narrow implicit
        int total1 = course+(int)GST; // Narrow - explicit
        System.out.println(total1);

        float total2 = course+GST; // widening - auto - implicit
        float total3 = (float)course+GST; // Widening - explicit
        System.out.println(total2);
        System.out.println(total3);
    }
}
