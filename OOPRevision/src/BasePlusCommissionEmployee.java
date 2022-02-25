public class BasePlusCommissionEmployee extends ComissionEmployee{

    private double base;

    // Constructors
    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(String name, String address, int ssn, Gender sex, double gross_sales, double commission_rate, double base) {
        super(name, address, ssn, sex, gross_sales, commission_rate);
        this.base = base;
    }

    // Setters and Getters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double earnings(){
        return (base + super.earnings());
    }

    @Override
    public void displayAllDetails(){
        super.displayAllDetails();
        displayEarnings();
    }

    @Override
    public void displayEarnings(){
        System.out.println(earnings());
    }
}
