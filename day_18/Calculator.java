//Implement a Calculator Class with overloaded methods for addition: two integers, Three integers, two double values
import java.util.Scanner;
public class Calculator{
    int addition(int a, int b){
        return a + b;
    }
    int addition(int a, int b, int c){
        return a + b + c; 
    }
    double addition(double a, double b){
        return a + b;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a integer: ");
        int a = scan.nextInt();

        System.out.println("Enter next integer: ");
        int b = scan.nextInt();

        System.out.println("Enter next integer: ");
        int c = scan.nextInt();

        System.out.println("Enter a decimal number: ");
        double x = scan.nextDouble();

        System.out.println("Enter next decimal number:");
        double y = scan.nextDouble();

        Calculator obj = new Calculator();
        int add2 = obj.addition(a, b);
        int add3 = obj.addition(a, b, c);
        double addTwo = obj.addition(x, y);

        System.out.println("The result of addition of two integers: " + add2);
        System.out.println("The result of addition of three integers: " + add3);
        System.out.println("The result of addition of two double numbers: " + addTwo);

    }
}