import java.io.*;
public class FileHandlingReader {
    public static void main(String[] args){

        File file = new File("test.txt");

        try{

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            System.out.println("Reading from file: " + br.readLine());

            // while(br.ready()){
            //     System.out.println(br.ready());
            //     System.out.println("Line: " + br.readLine());
            // }
            while(br.read() != -1){
                System.out.print("Line: " + (char)br.read());
            }
            br.close();
            fr.close();
        }catch(Exception e){
            System.out.println("An error occurred while reading the file: " + e.getMessage());
    }
}
}
