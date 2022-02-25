public class Car {

    private String maker;
    private int model;

    public void setmaker(String m) {
        if (m == "Toyota" || m == "Honda" || m == "Mercedes"){
            maker = m;
        }
        else
            System.out.println("Invalid Maker");
    }

    public void setmodel(int year){
        if (year > 2010) {
            model = year;
        }
        else
            System.out.println("Invalid Model");
    }

    public String getmaker(){
        return maker;
    }

    public int getmodel(){
        return model;
    }



}
