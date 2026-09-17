import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class userinput {
    public static void main(String args[]){
        int a;
        int b;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter a number");
        a = sc.nextInt();
        // Scanner sc1 = new Scanner(System.in);
        // System.out.println("Enter 2nd number");
        b = sc.nextInt();
        int c = a+b;
        System.out.println("Total is = "+c);
        

        
    }
    
}
