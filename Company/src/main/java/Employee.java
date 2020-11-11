public abstract class Employee {

    private String name;
    private String numberRegister;
    private double salary;

    public Employee(){

    }

    public abstract double getBonus();

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getNumberRegister() {
        return numberRegister;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberRegister(String numberRegister) {
        this.numberRegister = numberRegister;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
