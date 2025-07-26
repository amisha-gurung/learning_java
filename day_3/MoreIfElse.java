import java.util.Scanner;

public class MoreIfElse{
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);

        System.out.println("Enter trst score between 0 to 100");
        int score = number.nextInt();
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Your grade is: " + grade);

    }
}