package lesson9;

public class Book {

    private final String title;
    private int DataPublication;
    private final Author author;

    public Book(String title, int dataPublication, Author author) {
        this.title = title;
        this.DataPublication = dataPublication;
        this.author = author;
    }

    public void setDataPublication(int dataPublication) {
        this.DataPublication = dataPublication;
    }

    public String getTitle() {
        return title;
    }

    public int getDataPublication() {
        return DataPublication;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "книга - " + title + "  ( " + DataPublication + " год )";

    }
}
