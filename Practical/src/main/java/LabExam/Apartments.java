package LabExam;

public class Apartments extends ItemForSale{

    private double area;
    private int avgmPrice;

    public Apartments(String name, double price, double area, int avgmPrice) {
        super(name, price);
        this.area = area;
        this.avgmPrice = avgmPrice;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getAvgmPrice() {
        return avgmPrice;
    }

    public void setAvgmPrice(int avgmPrice) {
        this.avgmPrice = avgmPrice;
    }

    @Override
    public String toString() {
        return (super.toString() + "Apartment Area: "+ this.getArea() +"\n"+ "Average Meter Price: "+this.getAvgmPrice()+"\n");
    }
}
