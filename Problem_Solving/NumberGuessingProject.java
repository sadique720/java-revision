import java.util.Scanner;
public class NumberGuessingProject{
    public static void main(String[] args){
        int computerGuess = (int)(Math.random()*100);
        // System.out.println("The number to guess is: " + computerGuess);
        Scanner sc = new Scanner(System.in);
        int userGuess = 0;

        while(true){
            System.out.print("Enter your guess (between 1 to 100  and 0 or a negative number to quit): ");
            userGuess = sc.nextInt();
            if(userGuess == computerGuess){
                System.out.println("Congratulations! You have guessed the correct number : " + computerGuess);
                break;
            }
            else if(userGuess <= 0){
                System.out.println("......THE END......");
                break;
            }
            else if(userGuess < computerGuess){
                System.out.println("Your guess is lower than the computer's guess. Try again!");
            }
            else{
                System.out.println("Your guess is greater than the computer's guess. Try again!");
        }

    }
}
}