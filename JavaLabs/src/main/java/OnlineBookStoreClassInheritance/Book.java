package OnlineBookStoreClassInheritance;

import java.time.LocalDate;
import java.util.Scanner;

class Book {
    static int bookCount = 0;
    private int ID;
    private String title;
    private double price;
    private LocalDate releaseDate;

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public Book(String title, double price, LocalDate releaseDate) {
        this.ID = ++bookCount;
        this.title = title;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public void printBook() {
        System.out.println("ID = " + ID);
        System.out.println("Title = " + this.title);
        System.out.println("Price = " + this.price);
        System.out.println("Release = " + this.releaseDate);
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ID = " + this.ID + "\n" + "Title = " + this.title + "\n" + "Price = " + this.price + "\n" + "Release = "
                + this.releaseDate + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        // Instantly exit if comparing the same object.
        if (this == obj)
            return true;

        // If using another object type, return false.
        if (!(obj instanceof Book))
            return false;

        // Typecast here to avoid doing it with each use of the object.
        Book b = (Book) obj;
        if (this.title.equalsIgnoreCase(b.title) && this.releaseDate.equals(b.releaseDate))
            return true;

        return false;
    }

}