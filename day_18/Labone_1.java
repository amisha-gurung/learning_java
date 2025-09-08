//Write a program to find the largest and smallest element in an array using for-each loop
import java.util.Scanner;

public class Labone_1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " numbers: ");
        for(int i = 0; i < n; i++)
        {
            array[i] = scanner.nextInt();
        }

        int largest = array[0];
        int smallest = array[0];

        for(int arr : array){
            if (arr > largest){
                largest = arr;
            }
            if(arr < smallest){
                smallest = arr;
            }
        }

        System.out.println("\nArray elements: ");
        for(int arrElement : array)
        {
            System.out.println(arrElement + " ");
        }

        System.out.println("\nThe largest element is: " + largest);
        System.out.println("The smallest element is: " + smallest);

        scanner.close();
    }
}
