import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        System.out.println("Continue with the transaction");
        System.out.println("Please enter your option to continue");
        System.out.println("1.Withdrawl");
        System.out.println("2.Deposit");
        System.out.println("3.CheckBalance");
        System.out.println("4.Exit");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        BankAccount ba = new BankAccount();
        switch(option){
            case 1:
            System.out.println("Enter the amount");
            int withdrawl = sc.nextInt();
            if(withdrawl > 0 && withdrawl <= ba.checkbalance()){
                System.out.println("Withdrawl is successful");
                System.out.println(ba.checkbalance());
            }
            else {
                System.out.println("Insufficent funds");
            }
            case 2:
            System.out.println("Enter the amount to be deposited");
            int depo = sc.nextInt();
            
        }
    }
}

class BankAccount{
  private double balance = 1000;
  public double getbalance(){
    return this.balancebalance;
  }
  public void withdraw(double amount){
    if(amount > 0 && amount <= getbalance()){
    balance -= amount;
    System.out.println("Transaction is successful");
    checkbalance();
    }
    else {
        System.out.println("insufficient funds ");
    }
  }
   
   public void deposit(double amount){
    balance += amount;
    System.out.println("Transaction is successful");
    checkbalance();
   }
   
   double checkbalance(){
    System.out.println("your account balance is :"+ getbalance());
   }
}
