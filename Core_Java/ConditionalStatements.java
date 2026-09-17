package JAVA;
import java.util.*;
public class ConditionalStatements{
    public static void main (String args[]){
// Check user adut or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("Welcome you are adult..");
        }
        else{
            System.out.println("Sorry you are not adult ...");
        }
// find even and odd number
        System.out.println("Please enter number..");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("number is even");
        }
        else{
            System.out.println("Number is odd....");
        }

    }
}