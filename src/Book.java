public class Book {
    private String title;
    private String author;
    private int year;
    private int pages;
    private String language;
    private String description;

    public Book(String title, String author, int year, int pages, String language, String description) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.language = language;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public String getLanguage() {
        return language;
    }

    public String getDescription() {
        return description;
    }
}
