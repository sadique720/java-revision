abstract class Payment {
    abstract void pay(double amount);


}

abstract class Payment1 {
    abstract void pay(double amount);


}
//class UPI extends Payment,Payment1 { not support multiple inheritance
class UPI extends Payment {
    void pay(double amount){
        System.out.println("Connecting to UPI.....");
        System.out.println("Verifying  to UPI Id .....");
        System.out.println("Processing INR." + amount);
    }
}
class CreditCard  extends Payment{
    void pay(double amount){
        System.out.println("Checking card.....");
        System.out.println("Verifying  CVV .....");
        System.out.println("Processing INR." + amount);
    }
}

class NetBanking extends Payment {
    void pay(double amount){
        System.out.println("Connecting to bank.....");
        System.out.println("Login into bank account.....");
        System.out.println("Processing INR." + amount);
    }
}

public class Abstraction {
    public static void main(String args[]) {
        UPI upi = new UPI();
        upi.pay(300);
        System.out.println();

        CreditCard crdt = new CreditCard();
        crdt.pay(3000);
        System.out.println();

        NetBanking nBank = new NetBanking();
        nBank.pay(1000);
    }

}
