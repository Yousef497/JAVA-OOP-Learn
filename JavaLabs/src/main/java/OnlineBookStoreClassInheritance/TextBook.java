package OnlineBookStoreClassInheritance;

import java.time.LocalDate;

class TextBook extends Book {

    private int numPages;

    public int getNumPages() {
        return numPages;
    }

    public TextBook(String title, double price, LocalDate releaseDate, int numPages) {
        super(title, price, releaseDate);
        this.numPages = numPages;
    }

    public void printTextBook() {
        printBook();
        System.out.println("Num of pages  : " + this.numPages);
    }

    @Override
    public String toString() {
        return super.toString() + "Number of pages = " + this.numPages + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof TextBook))
            return false;

        // Use the base class equals() to check if it the has same title
        // and release date
        if (super.equals(obj) == false)
            return false;

        TextBook tb = (TextBook) obj;
        if (this.numPages == tb.numPages)
            return true;

        return false;
    }

}