//we're learning exception handling in java today 
import java.util.Scanner;

public class Exception{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("A simple Calculator");
        System.out.println("Enter a number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter another number: ");
        int num2 = scan.nextInt();

        try{
            int result = num1 / num2 ;
            System.out.println("The result: " + num1 +"/" + num2 +" = "+ result);
        }catch ( ArithmeticException e){
            System.out.println("Error: Cannot divide by Zero!");
            System.out.println("Please enter a non-zero denominator");
        } finally{
            System.out.println("Calculation completed.");
            scan.close(); //closes the Scanner
        }
    }
}