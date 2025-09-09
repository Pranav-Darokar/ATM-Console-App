package atmmachine;

public class ATMImpl implements ATMOperations {
    private Account account;

    public ATMImpl(Account account) {
        this.account = account;
    }

    @Override
    public void checkBalance() {
        System.out.println("Your Current Balance: ₹" + account.getBalance());
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            account.setBalance(account.getBalance() + amount);
            System.out.println("₹" + amount + " deposited successfully!");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= account.getBalance()) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("₹" + amount + " withdrawn successfully!");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}

