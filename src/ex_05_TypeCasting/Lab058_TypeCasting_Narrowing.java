package ex_05_TypeCasting;

public class Lab058_TypeCasting_Narrowing {

    public static void main(String[] args) {

        int val = 300;
        //byte b = val; //invalid - narrowing - implicit casting is not allowed
        byte b2 = (byte)val; // valid - narrowing - explicit casting is allowed
        //but if we use this, it will cause data loss
        System.out.println(b2);
    }
}
