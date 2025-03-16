package ex_03_Literals;

public class Lab033_Char_Literals {

    public static void main(String[] args) {

        char c1 = 'A'; //A to Z , a to z, !@#$%^&*()_+
        //char c2 = "A"; it wont take as character literals should be in single quote. It's a string.
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; //it can also take blank space

        //Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("UpaliSahoo");
        System.out.println("Upali" + new_line + "Sahoo");
        System.out.println("Upali" + tab_line + "Sahoo");
        System.out.println("Upali" + back_space + "Sahoo");
        System.out.println("Hello Upali" + carriage_return + "Sahoo");

        System.out.println("Hi, This is the first line\n this is second line\n this is third line\n");

        char c10 = 'A';
        // ASCII value will print here, A= 65

        char rupees ='₹';
        System.out.println(rupees);
        char laugh_smily = '\u1f60';
        System.out.println(laugh_smily);
    }
}
