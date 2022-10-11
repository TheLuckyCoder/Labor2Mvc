public class BookView {
    public void printBook(Book book) {
        System.out.println("Title: " + book.getTitle() + "\tAuthor: " + book.getAuthor());
        System.out.println("Year: " + book.getYear() + "\tPages: " + book.getPages());
        System.out.println("Language: " + book.getLanguage());
        System.out.println("Description: " + book.getDescription());
    }

    public void printBooks(Book[] books) {
        int i = 1;
        for (Book book : books) {
            System.out.print(i + ") ");
            printBook(book);
            ++i;
        }
        System.out.println();
    }
}
