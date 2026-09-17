import java.util.Scanner;
public class BasicCalculatorProgram {
    static double add(double a, double b){
        return  a + b;

    }

    static double subtract(double a, double b){
        return  a - b;

    }

    static double multi(double a, double b){
        return  a * b;

    }

    static double dived(double a, double b){
        return  a / b;

    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        String Opretaion = input.nextLine();

        if (Opretaion.equals("+")){
            add(12,21);
        }


    }
}
