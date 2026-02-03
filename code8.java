class ATM 
{
    double balance;
    void deposit(double amount) 
    {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    void withdraw(double amount)
     {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
         else
         {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

 class code8
 {
    public static void main(String[] args) 
    {
        ATM atm = new ATM();
        atm.balance = 10000;

        atm.checkBalance();
        atm.deposit(3000);
        atm.withdraw(2500);
        atm.checkBalance();
    }
}