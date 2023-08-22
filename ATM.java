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
            double withdrawl = sc.nextDouble();
            ba.withdraw(withdrawl);
            break;
            case 2:
            System.out.println("Enter the amount to be deposited");
            double depo = sc.nextDouble();
            ba.deposit(depo);
            break;
            case 3:
            System.out.println("Checking your banka balance");
            ba.checkbalance();
            break;
            case 4:
            System.exit(0);
            default : 
            System.out.println("Enter the valid transaction");
            break;
            
        }
    }
}

class BankAccount{
  private double balance = 1000;
  public double getbalance(){
    return this.balance;
  }
  public void withdraw(double amount){
    if(amount > 0 && amount <= getbalance()){
    balance -= amount;
    System.out.println("Transaction is successful");
    checkbalance();
    }
    else {
        System.out.println("insufficient funds ");
        checkbalance();
    }
  }
   
   public void deposit(double amount){
    balance += amount;
    System.out.println("Transaction is successful");
    checkbalance();
   }
   
   public void checkbalance(){
    System.out.println("your account balance is :"+ getbalance());
   }
}

