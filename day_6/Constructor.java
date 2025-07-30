public class Constructor{
    //Fields
    int age;
    String name;

    //default constructor
    Constructor(){
        age = 22;
        name = "Bon";
    }
    //methods
    void Meth(){
        System.out.println("Hie! I'm " + name + " and my age is " + age);
    }

    public static void main(String[] args){
        Constructor obj = new Constructor();
        obj.Meth();
    }
}