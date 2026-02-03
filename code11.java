class BankAccount 
{
    private double balance;
    BankAccount(double initialBalance) 
    {
        if (initialBalance > 0) 
        {
            balance = initialBalance;
        } 
        else 
        {
            balance = 0;
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be greater than zero");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
    double getBalance() {
        return balance;
    }
}

   class code11
   {
    public static void main(String[] args)
      {

        BankAccount account = new BankAccount(5000);

        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(2000);
        account.withdraw(3000);
        System.out.println("Final Balance: " + account.getBalance());
    }
}