public class SumOfNubmers{
    public static void main (String args[]){
// sum of numbers using For Loop
        // int total = 0;
        // for(int i = 1; i < 11; i++){
        //    total = total + i ;
        // }
        // System.out.println("Total is = "+total);

// sum of using while Loop
            // int i = 0;
            // int total = 0;
            // while(i < 11){
            //     total = total + i;
            //     i++;
            // }
            // System.out.println("Totla is ==="+ total);

// Using Do While Loop 
            int i = 1;
            int total = 0;
            do{
                System.out.println("run always atleast one");
                total = total + i ;
                i++;

            }while(i < 11);

            System.out.println("Total.."+ total);
    }    
}