public class FlowWithError {

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

    private static void method2(){
        System.out.println("Initialize method1");
        method2();
        System.out.println("method2 end");
    }
}
