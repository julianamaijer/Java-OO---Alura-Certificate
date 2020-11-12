public class CheckingAccount extends Account implements Taxable {

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

    public double getTaxValue() {
        return super.balance * 0.01;
    }
}
