import java.io.*;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args){      

        File file = new File("example.txt");

        try{
        FileWriter fileWriter = new FileWriter(file);
        System.out.println("File created....");

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Hello, this is a test file.");
        bufferedWriter.newLine();
        bufferedWriter.write("This file is created using Java.");
        bufferedWriter.close();
        System.out.println("File written successfully.");
    }catch(Exception e){
        System.out.println("An error occurred while creating the file: " + e.getMessage());

    }finally{
        System.out.println("File handling operation completed.");
    }
    }
}
