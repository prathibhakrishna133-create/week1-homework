
interface BankService {
    void deposit();
    void withdraw();
}

class SavingsAccount implements BankService {
    public void deposit() {
        System.out.println("Deposit in Savings Account");
    }

    public void withdraw() {
        System.out.println("Withdraw from Savings Account");
    }
}

class CurrentAccount implements BankService {
    public void deposit() {
        System.out.println("Deposit in Current Account");
    }

    public void withdraw() {
        System.out.println("Withdraw from Current Account");
    }
}
class code50
{


    public static void main(String[] args) {

        BankService b1 = new SavingsAccount();
        BankService b2 = new CurrentAccount();

        b1.deposit();
        b1.withdraw();

        b2.deposit();
        b2.withdraw();
    }
}
