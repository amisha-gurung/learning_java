// Write a Rectangle class with methods to calculate area and perimeter
import java.util.Scanner;

public class Rectangle{
    int area(int l, int w){
        return l * w;
    }
    int perimeter(int l, int w){
        return 2 * (l + w);
    }

    public static void main(String[] args){
        Rectangle obj = new Rectangle();
        int area = obj.area(7, 4);
        int perimeter = obj.perimeter(7, 4);
        
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);

    }
}
