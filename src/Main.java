public class Main {
    public static void main(String[] args) {
        var repository = new BookRepository();
        repository.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, 1216, "English", "The Lord of the Rings is an epic high fantasy novel."));

        var view = new BookView();

        var controller = new BookController(repository, view);

        controller.updateView();

        var b2 = new Book("The Hobbit", "J.R.R. Tolkien", 1937, 310, "English", "");
        controller.addBook(b2);
        controller.updateView();

        var b2update = new Book("The Hobbit", "J.R.R. Tolkien", 1937, 310, "English", "The Hobbit");
        controller.update(b2, b2update);
        controller.updateView();

        controller.remove(b2update);
        controller.updateView();
    }
}
