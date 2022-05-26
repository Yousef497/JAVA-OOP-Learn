package LabExam;

public class Test {

    public static void main(String[] args) {

        ItemForSale[] items = {
                new Apartments("Maadi", 16000025.54, 150.50,8000),
                new Cars("Toyota", 170000, 60000, 210000),
                new Apartments("Madinaty", 2000000, 130,11000),
                new Cars("Mitsubishi", 190000, 100000, 300000)
        };

        for(int i = 0; i < items.length; i++){

            if(items[i] instanceof Cars)
                System.out.println(((Cars) items[i]).toString());

            else if(items[i] instanceof Apartments)
                System.out.println(((Apartments) items[i]).toString());

            else
                System.out.println(((ItemForSale) items[i]).toString());

        }

    }

}
