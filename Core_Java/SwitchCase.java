import java.util.*;

public class SwitchCase{

// print different greeting with switch case
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please press button...");
        int button = sc.nextInt();
        switch(button){
            case 1:
            System.out.println("Hello...");
            break;
            case 2: 
            System.out.println("Namaste...");
            break;
            case 3 :
            System.out.println("Bonjure......");
            break;
            default:
            System.out.println("Invalid input.....");
            
        }

    }
}