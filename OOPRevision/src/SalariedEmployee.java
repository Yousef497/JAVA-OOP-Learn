public class SalariedEmployee extends Employee implements Displayable{

    private double salary;
    private double bonus;
    private double deductions;

    // Constructors
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, String address, int ssn, Gender sex, double salary, double bonus, double deduction) {
        super(name, address, ssn, sex);
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deduction;
    }

    // Setters and Getters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeduction() {
        return deductions;
    }

    public void setDeduction(double deduction) {
        this.deductions = deduction;
    }


    // Abstract Methods
    @Override
    public double earnings(){
        return (salary + bonus - deductions);
    }

    public void displayAllDetails(){
    System.out.println(super.toString());
    System.out.println(toString());
    }

    public void displayEarnings(){
    System.out.println(earnings());
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", deductions=" + deductions +
                '}';
    }
}
