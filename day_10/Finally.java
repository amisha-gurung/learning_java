//Here we will learn the finally block of java. The finally block is crucial for cleanup operations - it executes regardless of whether an exception occurs or not.

import java.io.*;

public class Finally{
    public static void main(String[] args){
        FileReader file = null;

        try{
            file = new FileReader("data.txt");
            System.out.println("File opened successfully");
        } catch (FileNotFoundException e){
            System.out.println("file not found: " + e.getMessage());
        } finally{
            //This always executes
            System.out.println("Finally block executed");
            if(file != null){
                try{
                    file.close();
                    System.out.println("File closed");
                } catch (IOException e){
                    System.out.println("Error closing file");
                }
            }
        }
    }
}