package OnlineBookStoreClassInheritance;

import java.time.LocalDate;
import java.util.Scanner;

public class Lab4Pb2 {

    public static Book readBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Title");
        String title = sc.nextLine();

        System.out.println("Enter Book price");
        double price = sc.nextDouble();

        System.out.println("Enter release date day then month then year");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Choose Book Type 1.book 2.TextBook 3.AudioBook");
        int choice = sc.nextInt();

        if (choice == 1) {
            Book b = new Book(title, price, LocalDate.of(y, m, d));
            return b;
        } else if (choice == 2) {
            System.out.println("Enter TextBook number of pages");
            int pages = sc.nextInt();
            TextBook tb = new TextBook(title, price, LocalDate.of(y, m, d), pages);
            return tb;
        } else if (choice == 3) {
            System.out.println("Enter AudioBook length in minutes");
            double lenMins = sc.nextDouble();
            AudioBook ab = new AudioBook(title, price, LocalDate.of(y, m, d), lenMins);
            return ab;
        } else {
            System.out.println("Invalid Choice - creating a Book type");
            Book b = new Book(title, price, LocalDate.of(y, m, d));
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many books you will enter ?");
        int N = sc.nextInt();

        Book[] books = new Book[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Enter Book " + (i + 1) + " properties");
            books[i] = readBook();
        }

        for (int i = 0; i < books.length; i++) {
            System.out.println("");
            books[i].print();
        }
    }

}
