import java.util.Scanner;

public class ExceptionTypes{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Exploring Exception types🎉: Unchecked Exceptions");
        System.out.println("Choose an option:");
        System.out.println("1. ArithmeticException: Division by Zero");
        System.out.println("2. ArrayIndexOutOfBoundsException: Array Index Error");
        System.out.println("3. NullPointerException: Null Pointer Error");

        int choice = scan.nextInt();

        switch(choice){
            case 1:
                testArithmeticException();
                break;
            case 2:
                testArrayException();
                break;
            case 3:
                testNullPointerException();
                break;
            default:
                System.out.println("Invalid Choice!, Choose between 1-3.");
        }

        scan.close();
    }
    public static void testArithmeticException(){
        try{
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch(ArithmeticException e){
            System.out.println("A demo of arithmetic exception");
            System.out.println("Message: " + e.getMessage());
        }
    }
    public static void testArrayException(){
        try{
            int[] arr = {1, 2, 3, 4};
            System.out.println("Accessing index 5 "+ arr[5]);//this will throw an error
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("A demo of ArrayIndexOutOfBoundsException");
            System.out.println("Message: " + e.getMessage());
        }
    }
    public static void testNullPointerException(){
        try{
            String text = null;
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e){
            System.out.println("A demo of NullPointerException");
            System.out.println("Message: " + e.getMessage());
        }
    }
}