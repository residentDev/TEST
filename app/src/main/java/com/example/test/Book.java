package com.example.test;

//3-  create a custom class Book

public class Book {

    // the resource ID for the imageView
    private int img;
    //textView1 and textView2
    private String title, desc;

    //Book class constructor
    public Book (int img, String title, String desc){
        this.img = img;
        this.title = title;
        this.desc = desc;
    }

    //getters

    public int getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }
}
