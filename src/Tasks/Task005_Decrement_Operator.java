package Tasks;

public class Task005_Decrement_Operator {

    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--); // 19+19+20 = 58
        System.out.println(a); // 19
    }
}
