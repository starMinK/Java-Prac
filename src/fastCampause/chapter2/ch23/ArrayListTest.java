package chapter2.ch23;

import chapter2.ch21.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("태백신맥1", "조정맥"));
        library.add(new Book("태백신맥2", "조정맥"));
        library.add(new Book("태백신맥3", "조정맥"));
        library.add(new Book("태백신맥4", "조정맥"));
        library.add(new Book("태백신맥5", "조정맥"));

        for (int i = 0; i < library.size(); i++) {
            library.get(i).showInfo();
        }
    }
}
