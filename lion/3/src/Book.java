import java.util.Scanner;

public class Book {
    int id;
    String title;
    int releaseYear;
    String author;

    public Book(int id, String title, int releaseYear, String author) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", author='" + author + '\'' +
                '}';
    }
}
