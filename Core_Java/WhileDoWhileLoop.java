import java.util.Scanner;
public class WhileDoWhileLoop {
    public static void main(String[] args)
    {

        int num = 1;
        while(num <= 10){
            System.out.println("Number is = " + num);
            num++;
        }
        Scanner sc  = new Scanner(System.in);
        int age = 0;

        System.out.print("Enter your age = ");
        
        while(age <= 18){
            
             age = sc.nextInt();
            if(age < 18){
                System.out.println("You are not an adult. Please enter age 18 or above.");
            }
        }
        sc.close();
        System.out.println("You are a adult.");

        // do while loop creates a loop that will always execute at least once
        int i = 11;
        do{
            System.out.println("Number is = " + i);
            i++;

        }while(i <=  10);
    }
}
