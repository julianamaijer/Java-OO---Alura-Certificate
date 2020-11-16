public class Flow {

    public static void main(String[] args) {
        System.out.println("Initialize Main ");
        try {
            method1();
        }catch (Exception ex){
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Main End");
    }

    private static void method1() throws MyException{
        System.out.println("Initialize method1");
        method2();
        System.out.println("method1 end");
    }

    private static void method2() throws MyException {
        System.out.println("Initialize method2");

        throw new MyException("deu muito errado");

        //System.out.println("method2 end");
    }
}
