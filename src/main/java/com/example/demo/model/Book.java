package com.example.demo.model;

public class Book {
//    private  int c;
    private int bId;
    private String name;
    private String description;


//    private int c=0;

    public Book(int bId, String name, String description) {
        this.bId = bId;
        this.name = name;
        this.description = description;
//        c++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Bid=" + bId +
                ", Bname='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

//    public  int getCount()
//    {
//        return c;
//    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
