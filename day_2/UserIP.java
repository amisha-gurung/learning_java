import java.util.Scanner;

public class UserIP{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = ip.nextLine();

        System.out.println("Hello " + name + "!");

        System.out.println("\nWhat's your favourite number??");
        int num = ip.nextInt();

        System.out.println("Your fav number is: " + num);
        System.out.println("Adding 10 to your fav number: " + (num + 10));
    }
}