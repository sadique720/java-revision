
class BankAcc{
    String name;
    private double balance;
    
    String address;
    
    BankAcc(String name, double balance, String address){
        this.name = name;
        this.balance = balance;
        this.address = address;
    }

    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Balance deposited......");
    }
    void withdraw(double amount){

        if(balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdraw successfully......");
        }
        else {
            System.out.println("Insufficient balance.....");

        }
    }
    void showBalance(){

        System.out.println("Your balance is......" + balance);

    }
}
public class Encapsulation {

    public static void main(String args[]) {
        BankAcc b1 = new BankAcc("Sadique", 7000, "Mumbai");

//        b1.amount = 9000000; // you can't update out side the class because it private this is called encapsulation
        b1.deposit(4000);
        b1.withdraw(10000000);
        b1.showBalance();

    }

}
