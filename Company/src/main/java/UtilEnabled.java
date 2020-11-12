public class UtilEnabled {

    private int password;

    public boolean enable(int password) {
        if (this.password == password){
            return true;
        }else {
            return false;
        }
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
