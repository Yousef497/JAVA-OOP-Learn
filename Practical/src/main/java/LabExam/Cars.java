package LabExam;

public class Cars extends ItemForSale{

    private int kmTraveled;
    private int officialPrice;

    public Cars(String name, double price, int kmTraveled, int officialPrice) {
        super(name, price);
        this.kmTraveled = kmTraveled;
        this.officialPrice = officialPrice;
    }

    public int getKmTraveled() {
        return kmTraveled;
    }

    public void setKmTraveled(int kmTraveled) {
        this.kmTraveled = kmTraveled;
    }

    public int getOfficialPrice() {
        return officialPrice;
    }

    public void setOfficialPrice(int officialPrice) {
        this.officialPrice = officialPrice;
    }

    @Override
    public String toString() {
        return (super.toString() + "Traveled meters: "+ this.getKmTraveled()+ " m" +"\n"+ "New Car Official Price: "+this.getOfficialPrice()+"\n");
    }
}
