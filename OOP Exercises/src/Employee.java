// Abstract Classes
/*An abstract class cannot be instantiated, but other classes are derived from it.
**An abstract class serves as a superclass for other classes
* The abstract class represents the generic or abstract form of all the
* classes that are derived from it.
* A class becomes abstract when you place the abstract keyword in the class
* definition
*
* No object can be made from the abstract class alone but objects can be made
* from the inherited classes
*
* It acts as a generic form for other classes
*
* An abstract method is a method that appears in a superclass, but expects to be
* overridden in a subclass and you should override this method, otherwise a compiler
* error
* When defining an abstract method in the class the class becomes automatically abstract
* */

public abstract class Employee extends Person {

    // we use protected access modifier to allow only the base class and the inherited classes to use
    // these attributes of the base class
    // it is something between private and public

    protected double salary;
    protected String rank;
    protected String job;

    public Employee(){}

    public Employee(String n, double a, String ad, String nat, double sal, String r, String j){
        super(n,a,ad,nat);
        salary = sal;
        rank = r;
        job = j;
    }

    // example of abstract method, we con write the method identifier and no body.
    // this method must be overriden in the inherited class.
    public abstract double getSalary();
    /*{
        return salary;
    }*/

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
