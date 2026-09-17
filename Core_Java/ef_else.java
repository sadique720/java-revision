import java.util.Scanner;
public class ef_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter time");
        int time = sc.nextInt();
        if(time < 10){
            System.out.println("Good morning");
        }else if (time < 20){
            System.out.println("Good day");
        }else{
            System.out.println("Good evening");
        }
    }
    
}
