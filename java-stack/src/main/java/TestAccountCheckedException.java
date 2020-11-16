public class TestAccountCheckedException {

    public static void main(String[] args) {

        Account account = new Account();
        try {
            account.deposit();
        }catch (MyException ex){
            System.out.println("treatment...");
        }

    }
}
