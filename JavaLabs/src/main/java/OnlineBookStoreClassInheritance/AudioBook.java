package OnlineBookStoreClassInheritance;

import java.time.LocalDate;

class AudioBook extends Book {

    private double lenMins;

    public AudioBook(String title, double price, LocalDate releaseDate, double lenMins) {
        super(title, price, releaseDate);
        this.lenMins = lenMins;
    }

    public double getLenMins() {
        return lenMins;
    }

    public void printAudioBook() {
        printBook();
        System.out.println("length in mins  : " + this.lenMins);
    }

    @Override
    public String toString() {
        return super.toString() + "Length in minutes = " + this.lenMins + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof AudioBook))
            return false;

        if (super.equals(obj) == false)
            return false;

        AudioBook ab = (AudioBook) obj;
        if (this.lenMins == ab.lenMins)
            return true;

        return false;
    }

}