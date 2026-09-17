import java.util.Scanner;

public class TernaryAndSwitch{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        sc.nextLine(); // Consume leftover newline
        // String result = (age < 18) ? "You are a minor." : 
        //                   (age >= 18 && age < 65) ? "You are an adult." : 
        //                   "You are a senior citizen."; 
        // System.out.println(result);

        String res = age < 18 ? "you are a minor" : age >= 18 && age < 65 ? "you are an adult" : "you are a senior citizen";
        System.out.println(res);

        // Using switch statement
        // String day = "Monday";
        // sc = new Scanner(System.in);
        System.out.println("Enter the day of the week");
        String day = sc.nextLine();
        
        switch(day.trim().toLowerCase()) {
            case "monday":
            System.out.println("Start of the week!");
            break;
            case "tuesday":
            System.out.println("Second day of the week!");
            break;
            case "wednesday":
            System.out.println("Midweek day!");
            break;
            case "thursday":
            System.out.println("Almost weekend!");
            break;
            case "friday":
            System.out.println("End of the work week!");
            break;
            case "saturday":
            System.out.println("Weekend is here!");
            break;
            case "sunday":
            System.out.println("Rest day!");
            break;
            default:
            System.out.println("Invalid day!");

    }
    sc.close();

}
}
    

