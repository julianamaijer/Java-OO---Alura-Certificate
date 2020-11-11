public abstract class EnabledEmployee extends Employee {

    private int password;

    public boolean enable(int password){
        if (this.password == password){
            return true;
        }else {
            return false;
        }
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPassword() {
        return password;
    }
}
