public class Customer implements Enabled{

    private UtilEnabled utilEnabled;

    public Customer(){
        this.utilEnabled = new UtilEnabled();
    }

    public boolean enable(int password) {
        return this.utilEnabled.enable(password);

    }

    public void setPassword(int password) {
        this.utilEnabled.enable(password);
    }
}
