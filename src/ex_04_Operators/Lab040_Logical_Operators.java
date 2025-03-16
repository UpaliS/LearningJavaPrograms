package ex_04_Operators;

public class Lab040_Logical_Operators {

    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);
        boolean b = true;
        System.out.println(!!b);

        boolean c = true || false;
        System.out.println(c);

        // In AND gate
        // true||false --> true
        //false||true --> true
        // true||true --> true
        // false||false --> false
    }
}
