class BankAccount
 {
    String accountHolderName;
    double balance;

    BankAccount(String name, double b) 
    {
        accountHolderName = name;
        balance = b;
    }

  
    void deposit(double amount)
     {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } 
        else 
        {
            System.out.println("Invalid deposit amount");
        }
    }
 

  
    void withdraw(double amount) {
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
    void displayDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
 }

   class code4
   {
    public static void main(String[] args) {

    
        BankAccount a = new BankAccount("Varsha S", 5000);
        a.displayDetails();
        a.deposit(2000);
        a.withdraw(1500);
        a.displayDetails();
    }
}