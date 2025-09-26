//Demonstrate access modifiers (public, private, protected, deault) using a class with different methods
public class Car{
    //public method
    public void carModel(){
        System.out.println("The car model is Defender 110");
    }

    //private method
    private void startEngine(){
        System.out.println("Starting Engine");
    }

    public void start(){
        startEngine();
        System.out.println("Car is ready to drive!");
    }

    //protected method
    protected void checkOilLevel(){
        System.out.println("Checking oil level");
    }

    //default modifier
    void accelerate(){
        System.out.println("Accelerating");
    }


    public static void main(String[] args){
        Car obj = new Car();

        obj.carModel(); //Public - accessible everywhere
        // obj.startEngine(); // would cause compilation error
        obj.start(); //Public method that calls private method internally
        obj.checkOilLevel(); //Protected - accessible in same package & subclasses
        obj.accelerate(); //Protected - accessible in same package & subclasses
    }
}