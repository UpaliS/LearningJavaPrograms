package ex_06_Ternary_Operator;

public class Lab067_RealAgeClassification {

    public static void main(String[] args) {
        //age = 23 --> adult (age > 18) , Minor (age <18) , senior(age>65)
        //take an input for the user

        String age1 = args[0];
        System.out.println(age1);
        System.out.println(age1 instanceof String);

        int age = Integer.parseInt(age1);
        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println(result);
    }
}
