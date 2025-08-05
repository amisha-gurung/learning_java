//here we'll learn about multiple catch blocks
public class Catch{
    public static void main(String[] args){
        try{
            int[] num = {1, 2, 3, 4, 5};
            int result = 10 / 0; // arithmetic error
            System.out.println(num[10]); //array index out of bound exception
        } catch (ArithmeticException e){
            System.out.println("Arithmetic exception: cannot divided by zero"+ e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds: " + e.getMessage());
        }
    }
}