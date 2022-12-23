package ru.netology;

public class Book extends Product {

    private String authorName;

    public Book(int id, String name, int price, String authorName) {
        super(id, name, price);
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }
}

