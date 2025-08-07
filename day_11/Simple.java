public class Simple{
    public static void main(String[] args){
        Cat c = new Cat();
        c.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Animals make sounds.");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows.");
    }
}