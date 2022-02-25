enum Gender{Male, Female};

public abstract class Employee {

    protected String name;
    protected String address;
    protected int ssn;
    protected Gender sex;

    // Constructors
    public Employee() {
    }

    public Employee(String name, String address, int ssn, Gender sex) {
        this.name = name;
        this.address = address;
        this.ssn = ssn;
        this.sex = sex;
    }

    // Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", ssn=" + ssn +
                ", sex=" + sex +
                '}';
    }
}
