

public class Inheritance{
    public static void main(String[] args){
       
        System.out.println("Simple inheritance example");

        Asus laddu = new Asus("Zephyrus G14", 120);

        laddu.open();

        laddu.yoo();
        laddu.wiwi("Ryzen 9");

        System.out.println("Brand: " + laddu.brand);
    }
}

class Laptop{
    String brand;
    int refreshRate;

    Laptop(String brand){
        this.brand = brand;
        this.refreshRate = refreshRate;
    }

    public void open(){
        System.out.println(brand + " is operating.");
    }
}

class Asus extends Laptop{
    String processor;

    public Asus(String brand, int refreshRate){
        super(brand);
        this.processor = processor;
    }

    public void yoo(){
        System.out.println(brand + " is soo cool!!!");
    }

    void wiwi(String processor){
        System.out.println(processor + " is just sooo lovely");
    }
}