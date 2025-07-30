public class Overload{
    //Fields
    String words;
    String title;

    //default constructor
    Overload(){
        words = "Troubles are as light as a piece of paper. We are the ones who make it grow. Your hair is more important than anything... ";
        title = "M. -Anil Emre Daldal";
    }
    // parameterized constructor also constructor overloading 
    Overload(String w,String t){
        words = w;
        title = t;
    }

    void M(){
        System.out.println(words + title);
    }

    public static void main(String[] args){
        //creating objects
        Overload song = new Overload(); //this will call default constructor
        song.M();

        //another object
        Overload anth = new Overload("Let it be now that We've forgotten what love is... ", "-M."); //this will call parameterized constructor
        anth.M();
    }


}