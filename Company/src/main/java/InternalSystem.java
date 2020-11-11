public class InternalSystem {

    private int password = 2222;

    public void enable(EnabledEmployee enabledEmployee){
       boolean enabled = enabledEmployee.enable(this.password);
       if(enabled){
           System.out.println("Great! You're accessing the system.");
       }else {
           System.out.println("Your password is incorrect!");
       }
    }
}
