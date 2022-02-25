// You can implement multiple interfaces in one class but not inherit multi classes

public class CD implements Retailitem, Displayable {

    String artist;
    String title;
    double price;

    public CD(){}

    public CD(String artist, String title, double price) {
        this.artist = artist;
        this.title = title;
        this.price = price;
    }

    public double getItemPrice(){
        return price;
    }

    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Price: " + price);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
