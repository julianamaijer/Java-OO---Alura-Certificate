public class CheckingAccount extends Account {

    public CheckingAccount(int bankNumber, int number){

        super(bankNumber, number);

    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public boolean withdraw(double value) {
        double valueWithdraw = value + 0.2;
        return super.withdraw(valueWithdraw);
    }
}
