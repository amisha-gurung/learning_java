/*  Asks the user for their age and whether they have a student ID (true/false).

    If the user is under 18 or has a student ID, print “You get a discount!” Otherwise, print “No discount.” 
*/

import java.util.Scanner;

public class Conditions{
    public static void main(String[] args){
        Scanner qsn = new Scanner(System.in);
        System.out.println("Enter age: ");
        int Age = qsn.nextInt();

        System.out.println("Do you have Student Id???");
        boolean ID = qsn.nextBoolean();

        if( Age < 18 || ID == true){
            System.out.println("You get a Discount!! yayyy");
        }
        else{
            System.out.println("No Discount");
        }


    }
}
