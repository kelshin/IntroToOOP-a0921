package oop.encapsulation;

public class Book {
    // instance variables (fields) - private
    private String title;
    private String author;
    private boolean borrowed;

    // constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    // methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.length() >= 2 && title.length() <= 30) {
            this.title = title;
        } else {
            System.out.println("Invalid title length.");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (checkAuthorName(author)) {
            this.author = author;
        }
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        if (this.borrowed == borrowed) {
            System.out.println("It's already been borrowed or not borrowed.");
        } else {
            this.borrowed = borrowed;
        }
    }

    private boolean checkAuthorName(String name) {
        String[] names = name.split(" ");
        if (names.length == 2) {
            return true;
        } else {
            System.out.println("You need to provide first name and last name.");
            return false;
        }
    }
}
