class ATM 
{
    private double balance;
    private int pin;

    ATM(double initialBalance, int pin)
     {
        this.balance = initialBalance;
        this.pin = pin;
     }

    boolean validatePin(int enteredPin) 
    {
        return this.pin == enteredPin;
    }

    void withdraw(int enteredPin, double amount) 
    {
        if (!validatePin(enteredPin)) 
        {
            System.out.println("Incorrect PIN. Withdrawal denied.");
        } else if (amount > 0 && amount <= balance)
         {
            balance -= amount;
            System.out.println("Withdrawal Successful: " + amount);
            System.out.println("Remaining Balance: " + balance);
         } 
         else
          {
            System.out.println("Insufficient balance or invalid amount.");
         }
    }
}

   class code14
   {
    public static void main(String[] args) {

        ATM atm = new ATM(10000, 1234);
        atm.withdraw(1234, 3000);  
        atm.withdraw(1111, 2000);  
    }
}