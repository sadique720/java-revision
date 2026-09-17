import java.util.Scanner;
public class ConditionalStatemens {
    public static void main(StringJava[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();
        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age >= 18 && age < 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }
    }
    
}
