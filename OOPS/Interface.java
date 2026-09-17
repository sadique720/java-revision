interface Payment3 {
    void pay(double amount);


}

interface Payment4 {
    abstract void pay(double amount);


}
//class UPI extends Payment,Payment1 {  support multiple inheritance
class UPI1 implements Payment3,Payment4 {
    public void pay(double amount){
        System.out.println("Connecting to UPI.....");
        System.out.println("Verifying  to UPI Id .....");
        System.out.println("Processing INR." + amount);
    }
}
class CreditCard1  implements Payment3, Payment4{
   public void pay(double amount){
        System.out.println("Checking card.....");
        System.out.println("Verifying  CVV .....");
        System.out.println("Processing INR." + amount);
    }
}

class NetBanking1 implements Payment3, Payment4 {
    public void pay(double amount){
        System.out.println("Connecting to bank.....");
        System.out.println("Login into bank account.....");
        System.out.println("Processing INR." + amount);
    }
}

public class Interface {
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
