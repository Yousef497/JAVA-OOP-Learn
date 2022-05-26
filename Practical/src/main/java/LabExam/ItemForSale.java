package LabExam;

public class ItemForSale {

    protected String name;
    protected double price;

    public ItemForSale(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return ("Item Name: "+ this.getName()+ "\n"+ "Item Price: "+ this.getPrice() + "\n");
    }
}
