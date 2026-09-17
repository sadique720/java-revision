import java.util.*;
public class NumberOfTable {

    // Print table of number form user input

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number..");
        int number = sc.nextInt();
        System.out.println("Table of" + number);
        for(int i = 1; i <= 10; i++){
            System.out.println(number +" X " + i + " = " + number*i );

        }

    }
    
}
