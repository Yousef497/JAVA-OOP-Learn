public class Salaried_Employee extends Employee {

    protected double bonus;
    protected double deduction;

    public Salaried_Employee(){}

    public Salaried_Employee(String n, double a, String ad, String nat, double sal, String r, String j, double b, double ded){
        super(n,a,ad,nat,sal,r,j);
        bonus = b;
        deduction = ded;
    }

    // to override the method of the base class
    // if we put the keyword final in the base class method name the method cannot be overridden
    @Override
    public double getSalary(){
        return (salary + bonus - deduction);
    }

}
