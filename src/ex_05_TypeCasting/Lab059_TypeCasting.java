package ex_05_TypeCasting;

public class Lab059_TypeCasting {

    public static void main(String[] args) {
        long phone_num = 9876543210l;
        //short s = phone_num; //implicit casting not allowed
        short s = (short)phone_num; //explicit casting -- narrowing
        System.out.println(s);
    }
}
