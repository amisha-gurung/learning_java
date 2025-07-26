// here I'll use what I've learned in past two days and write a java program
// Exercise: Interactive Profile
/*Write a Java program that:

    Asks the user for their name.

    Asks for their favorite color.

    Prints:
    "Hello, [name]! [color] is a lovely color!"

    Then, asks for their age.

    Prints:
    "Next year, you’ll be [age + 1] years old!"
*/

import java.util.Scanner;

public class MiniProject{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("What's your Favorite color???");
        String color = scanner.nextLine();
        System.out.println("Hello! " + name + "! " + color + " is a lovely color!");

        System.out.println("\nWhat's your age?");
        int age = scanner.nextInt();
        System.out.println("next year, you'll be " + (age + 1) + " years old!");
    }
}