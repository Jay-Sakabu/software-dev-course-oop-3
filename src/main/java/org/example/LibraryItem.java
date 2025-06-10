package org.example;

public class LibraryItem {
    protected String title;
    protected int year;
    protected String author;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Item: " + this.title + " by " + this.author + "(" + this.year + ")";
    }
}
