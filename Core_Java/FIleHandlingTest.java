import java.io.*;

public class FIleHandlingTest {
    
    public static void main(String[] args){
        File file = new File("Test.txt");
try{
        FileWriter fw = new FileWriter(file, true); // 'true' to append to the file
        fw.write("This is a test file......");
        fw.close();
}catch(Exception e){
    System.out.println("An error occurred while creating the file: " + e.getMessage());
}

    }
}
