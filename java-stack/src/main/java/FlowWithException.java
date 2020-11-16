public class FlowWithException {

    public static void main(String[] args) {
        System.out.println("Initialize Main ");
        try {
            method1();
        }catch (ArithmeticException | NullPointerException ex){
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Main End");
    }

    private static void method1() {
        System.out.println("Initialize method1");
        method2();
        System.out.println("method1 end");
    }

    private static void method2() {
        System.out.println("Initialize method2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            //int a = i / 0;
            Account account = null;
            account.deposit();
        }
        System.out.println("method2 end");
    }
}
