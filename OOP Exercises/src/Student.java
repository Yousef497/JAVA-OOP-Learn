public class Student extends Person{
    // we use extends keyword
    // this is extended class (inheritance exercise
    // it will have the same attributes and methods of class Person
    // it will also have its own attributes and methods

    //Student class additional attributes
    protected double GPA;
    protected String specialization;
    protected int study_lvl;

    // constructors and methods
    public Student() {

    }

    /*public Sudent(String n, double a, String ad, String nat, int lvl, String special, double gpa){
        name = n;
        age = a;
        address = ad;
        nationality = nat;
        study_lvl = lvl;
        specialization = special;
        GPA = gpa;
    }*/

    // reusability with calling the constructor of the base class
    // we use the keyword super and passes the arguments
    public Student(String n, double a, String ad, String nat, int lvl, String special, double gpa){
        super(n,a,ad,nat);
        study_lvl = lvl;
        specialization = special;
        GPA = gpa;
    }

    // Setters and Getters
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setStudy_lvl(int study_lvl) {
        this.study_lvl = study_lvl;
    }

    public double getGPA() {
        return GPA;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getStudy_lvl() {
        return study_lvl;
    }

}
