public class TestEmployee {

    public static void main(String[] args) {

        Manager employee = new Manager();
        employee.setName("Juliana Zanon");
        employee.setNumberRegister("22222222-22");
        employee.setSalary(2000.00);

        System.out.println(employee.getName());
        System.out.println(employee.getBonus());
    }
}
