public class HourlyEmployee extends Employee implements Displayable{

    private double hour_rate;
    private int numberOfHours;

    //Constructors
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, String address, int ssn, Gender sex, double hour_rate, int numberOfHours) {
        super(name, address, ssn, sex);
        this.hour_rate = hour_rate;
        this.numberOfHours = numberOfHours;
    }

    // Setters and Getters
    public double getHour_rate() {
        return hour_rate;
    }

    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    @Override
    public double earnings(){
        return (hour_rate * numberOfHours);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hour_rate=" + hour_rate +
                ", numberOfHours=" + numberOfHours +
                '}';
    }

    public void displayAllDetails(){
        System.out.println(super.toString());
        System.out.println(toString());
    }

    public void displayEarnings(){
        System.out.println(earnings());
    }
}
