import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    private Map<String, Book> books = new HashMap<>();

    public Book getBook(String title, String author) {
        String key = title + "-" + author;
        Book book = books.get(key);

        if (book == null) {
            book = new ConcreteBook(title, author);
            books.put(key, book);
            System.out.println("Création d'un nouveau livre : " + title + " par " + author);
        }

        return book;
    }
}