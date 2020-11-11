public class ControlBonus {

    private double total;

    public void register(Employee employee){
        double bonus = employee.getBonus();
        this.total = this.total + bonus;
    }

    public double getTotal() {
        return total;
    }
}
