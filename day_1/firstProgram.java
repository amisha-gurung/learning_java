public class firstProgram{
    public static void main(String[] args){
        System.out.println("This is a Java Program. Amisha's day 1 of learning java khikhikhi🦕");
        
        // this is one-line comment
        /* this is 
        multi line
        comment */
         
        // java variables and datatypes
        String name = "Mio";
        int age = 20;

        //implementing them 
        System.out.println("Hi! I'm " + name + " and I'm " + age);

        int[] nums = {5, 4, 3, 2, 1};
        for(int i= 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
