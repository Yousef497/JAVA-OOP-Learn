public class Person {
    //start of inheritance exercise

    // Attributes
    protected String name;
    protected double age;
    protected String address;
    protected String nationality;

    //constructors
    public Person(){}

    public Person(String n, double a, String ad, String nat){
        name = n;
        age = a;
        address = ad;
        nationality = nat;
    }

    // Methods, Setters and Getters
    public void setName(String n){
        name = n;
    }
    public void setAddress(String n){
        address = n;
    }
    public void setNationality(String n){
        nationality = n;
    }
    public void setAge(double n){
        age = n;
    }



    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getNationality(){
        return nationality;
    }
    public double getAge(){
        return age;
    }

}
