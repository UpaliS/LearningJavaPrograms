package Tasks;

public class Task003_GradingSystem {

    public static void main(String[] args) {

    // Write a program that calculates and displays the letter grade for a given numerical score
    // (e.g. A,B,C,D or F) based on the following grades scale:
    // A. 90-100
    // B. 80-89
    // C. 70-79
    // D. 60-69
    // F. 0-59

        System.out.println("Enter your marks");

        String marks1 = args[0];
        int marks = Integer.parseInt(marks1);

        System.out.println("You have entered " + marks);
        String grade = (marks>=90) ? "A" : (marks>=80) ? "B" : (marks>=70) ? "C" : (marks>=60) ? "D" : "F";
        System.out.println("Your grade is " + grade);

}

}
