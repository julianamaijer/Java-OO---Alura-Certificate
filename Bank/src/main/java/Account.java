public abstract class Account {

    protected double balance;
    private int bankNumber;
    private int number;
    private Client holder;
    private static int total = 0;

    public Account(int agencia, int number){
        Account.total++;
        //System.out.println("The total of acoounts is " + Account.total);
        this.bankNumber = agencia;
        this.number = number;
        //this.balance = 100;
        //System.out.println("I'm creating an account " + this.number);
    }

    public abstract void deposit(double value);

    public boolean withdraw(double value) {
        if(this.balance >= value) {
            this.balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(double value, Account destiny) {
        if(this.withdraw(value)) {
            destiny.deposit(value);
            return true;
        } else {
            return false;
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        if(number <= 0) {
            System.out.println("It can't be a number less than zero");
            return;
        }
        this.number = number;
    }

    public int getBankNumber(){
        return this.bankNumber;
    }

    public void setBankNumber(int bankNumber){
        if(bankNumber <= 0) {
            System.out.println("It can't be a number less than zero");
            return;
        }
        this.bankNumber = bankNumber;
    }

    public void setHolder(Client holder){
        this.holder = holder;
    }

    public Client getHolder(){
        return this.holder;
    }

    public static int getTotal(){
        return Account.total;
    }

}