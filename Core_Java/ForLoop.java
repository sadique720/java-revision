public class ForLoop {
    public static void main(String[] args) {
        // Print numbers from 1 to 10
        for ( int i = 1; i<= 10; i++){
            System.out.println("Number: " + i);
        }
        

        // Print even numbers from 2 to 20
        for ( int i = 2; i <= 20;){
            System.out.println("Even Number: " + i);
            i = i + 2; // Increment by 2 to get the next even number

        }
        
        // Print odd numbers from 1 to 19
        for (int i = 1; i <= 20; i += 2){
            System.out.println("Odd Number: " + i);
        }

        // // Print numbers from 10 to 1 in reverse order
        for (int i = 10; i >= 1; i--){         
            System.out.println("Reverse Number: " + i);
        }

    // Print pattern using for loop
    for (int i = 1; i <= 5; i++){
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Print reverse pattern using for loop
    for(int i = 5; i >= 1; i--){
        for (int j = 1; j <= i; j++ ){
            System.out.print("*");
        }
        System.out.println();

    }

        
    }
    
}
