package ex_04_Operators;

public class Lab042_Interview_Concatination_Plus2 {

    public static void main(String[] args) {
        String first_name = "Upali";
        String last_name = "Sahoo";

        int a = 50;
        int b = 70;

        System.out.println(first_name + last_name + a + b);
        // UpaliSahoo5070 - as the string is coming first so it wont calculate the value of a and b

        System.out.println(a + b + first_name + last_name);
        // 120UpaliSahoo - as the integer is coming first so it will calculate and then concatinate

        System.out.println(first_name + last_name + (a + b));
        //it will follow the Bodmas rule and first execute the bracket
    }
        }
