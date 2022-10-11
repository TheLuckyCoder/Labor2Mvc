import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private final List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public void update(Book oldBook, Book newBook) {
        books.set(books.indexOf(oldBook), newBook);
    }

    public void remove(Book book) {
        books.remove(book);
    }

    public Book[] getBooks() {
        return books.toArray(new Book[0]);
    }
}
