import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secret = 7;
        int guess = 0;
        int tries = 0;

        while (guess != secret) {
            System.out.print("Guess the number: ");
            guess = scanner.nextInt();
            tries++;

            if (guess > secret) {
                System.out.println("Too high!");
            } else if (guess < secret) {
                System.out.println("Too low!");
            }
        }
        System.out.println("Correct! Well done!");
        System.out.println("It took you " + tries + " attempts.");
    }
}
