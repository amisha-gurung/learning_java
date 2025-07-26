import java.util.Scanner;

public class UsingIfElse{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = num.nextInt();

        if (age >= 18){
            System.out.println("You can vote!");
        }
        else {
            System.out.println("You cann't vote yet.");
        }
    }
}