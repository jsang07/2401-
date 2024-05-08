package test.test3;

import java.util.Arrays;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book(15000);
        Book b2 = new Book(50000);
        Book b3 = new Book(20000);
        int[] books = {b1.price, b2.price, b3.price};

        System.out.println("정렬 전");
        for (int book : books) {
            System.out.println("Book [price="+ book+"]");
        }

        Arrays.sort(books);
        System.out.println("정렬 후");
        for (int book : books) {
            System.out.println("Book [price="+ book+"]");
        }
    }
}
