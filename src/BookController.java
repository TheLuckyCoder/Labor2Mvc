public class BookController {

    private final BookRepository repository;
    private final BookView view;

    public BookController(BookRepository repository, BookView view) {
        this.repository = repository;
        this.view = view;
    }

    public void addBook(Book book) {
        repository.add(book);
    }

    public void remove(Book book) {
        repository.remove(book);
    }

    public void update(Book oldBook, Book newBook) {
        repository.update(oldBook, newBook);
    }

    public void updateView() {
        view.printBooks(repository.getBooks());
    }
}
