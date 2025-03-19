package Tasks;

public class Task006_CLI_UserInput {

    public static void main(String[] args) {
        String Name = args[0];
        int age = Integer.parseInt(args[1]);
        int salary = Integer.parseInt(args[2]);
        System.out.println("Name: " +Name+"\n"+ "age: " +age+"\n" +"salary: "+salary);
    }
}
