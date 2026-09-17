import java.util.*;
public class ScannerInput{
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first input..");
        int a = sc.nextInt();
        System.out.println("Please enter second inout");
        int b = sc.nextInt();
        int Total = a + b;
        System.out.print("Sum of total number is = ");
        System.out.print(Total);
    }
}