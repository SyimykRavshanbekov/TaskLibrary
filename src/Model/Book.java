package Model;

import java.util.ArrayList;

public class Book {
    private Long bookId;
    private String title;
    private int yearOfProduction;
    private String author;

    private LibraryMember currentHolder;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LibraryMember getCurrentHolder() {
        return currentHolder;
    }

    public void setCurrentHolder(LibraryMember currentHolder) {
        this.currentHolder = currentHolder;
    }
}
