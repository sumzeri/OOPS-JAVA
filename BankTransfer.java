// 4. A banking application needs to transfer money between two Account objects by passing
// one account object as a parameter to a method in another account object. Write a Java
// program to implement this transfer, checking for sufficient balance.
public class BankTransfer {
    double balance;
    BankTransfer(double balance) {
        this.balance = balance;
    }
    void transfer(BankTransfer receiver, double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    void display() {
        System.out.println("Balance = Rs. " + balance);
    }
    public static void main(String[] args) {
        BankTransfer account1 = new BankTransfer(5000);
        BankTransfer account2 = new BankTransfer(2000);
        account1.transfer(account2, 1500);
        account1.display();
        account2.display();
    }
}
