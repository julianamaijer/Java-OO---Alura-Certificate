public class TestAccounts {

    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount(111,111);
        checkingAccount.deposit(100);

        SavingsAccount savingsAccount = new SavingsAccount(222,222);
        savingsAccount.deposit(200);

        checkingAccount.transfer(10, savingsAccount);

        System.out.println("Checking Account: " + checkingAccount.getBalance());
        System.out.println("Savings Account: " + savingsAccount.getBalance());
    }
}
