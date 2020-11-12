public class Manager extends Employee implements Enabled{

    private UtilEnabled utilEnabled;

    public Manager(){
        this.utilEnabled = new UtilEnabled();
    }

    public double getBonus(){
        return super.getSalary();
    }

    public boolean enable(int password) {
        return this.utilEnabled.enable(password);

    }

    public void setPassword(int password) {
        this.utilEnabled.enable(password);
    }
}
