//Define an interface Shape with method area(). Implement it in Circle and Rectangle
import java.util.Scanner;
import java.lang.Math;

public class Interface{
    public interface Shape{
        double area();
    }

    static class Circle implements Shape{
        private double radius;
        public Circle(double radius){
            this.radius = radius;
        }

        public double area(){
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle implements Shape{
        private double length, breadth;
        
        public Rectangle(double length, double breadth){
            this.length = length;
            this.breadth = breadth;
        }

        public double area(){
            return length * breadth;
        }

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double rad = scanner.nextDouble();
        Circle Cobj = new Circle(rad);
        System.out.println("The area of the circle is: " + Cobj.area());

        System.out.println("Enter the length and breadth of Rectangle");
        double len = scanner.nextDouble();
        double bre = scanner.nextDouble();
        Rectangle robj = new Rectangle(len, bre);
        System.out.println("The area of rectangle is: " + robj.area());
    }
}