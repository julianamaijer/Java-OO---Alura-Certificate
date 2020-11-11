public class TestManager {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("Marco");
        manager.setNumberRegister("3333333-3");
        manager.setSalary(5000.0);

        System.out.println(manager.getName());
        System.out.println(manager.getNumberRegister());
        System.out.println(manager.getBonus());

        boolean autenticou = manager.enable(2222);

        System.out.println(autenticou);
    }

}
