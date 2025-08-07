public class Interface{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.sound();
    }
}
interface Animal{
    void sound(); //abstract class
    default void eat(){
        System.out.println("All animals eat");
    }
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Dogs bark");
    }
}