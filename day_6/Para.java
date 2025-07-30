public class Para{
    //Fields
    String language;
    int sem;
    //parameterized constructor
    Para(int s, String a){
        language = a;
        sem = s;
    }
    void Parameterized(){
        System.out.println("I'm learning " + language + " and I'm in " + sem + "th semester. Yayyyyyyy✨");
    }

    public static void main(String[] args)
    {
        Para obj = new Para(7, "Java"); //giving values to the Para constructor
        obj.Parameterized();
    }
}