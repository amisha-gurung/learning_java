import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a positive number: ");
            num = scanner.nextInt();
        } while (num < 0);

        System.out.println("You entered: " + num);
    }
}
