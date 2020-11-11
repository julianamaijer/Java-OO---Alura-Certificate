public class SavingsAccount extends Account{

    public SavingsAccount(int bankNumber, int number){

        super(bankNumber,number);

    }

    @Override
    public void deposit(double value) {
        super.balance += value;
    }
}