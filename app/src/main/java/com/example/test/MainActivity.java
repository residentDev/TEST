package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create a arrayList of the type Book
        final ArrayList<Book> books = new ArrayList<>();

        //5- in the mainActivity.java create various objects from the Book class
        books.add(new Book(R.drawable.book_holder, "Book1", "this book is good"));
        books.add(new Book(R.drawable.book_holder, "Book2", "this book is good"));
        books.add(new Book(R.drawable.book_holder, "Book3", "this book is good"));
        books.add(new Book(R.drawable.book_holder, "Book4", "this book is good"));
        books.add(new Book(R.drawable.book_holder, "Book5", "this book is good"));
        books.add(new Book(R.drawable.book_holder, "Book6", "this book is good"));
        books.add(new Book(R.drawable.book_holder, "Book7", "this book is good"));
        books.add(new Book(R.drawable.book_holder, "Book8", "this book is good"));
        books.add(new Book(R.drawable.book_holder, "Book9", "this book is good"));
        books.add(new Book(R.drawable.book_holder, "Book10", "this book is good"));
        books.add(new Book(R.drawable.book_holder, "Book11", "this book is good"));
        books.add(new Book(R.drawable.book_holder, "Book12", "this book is good"));
        books.add(new Book(R.drawable.book_holder, "Book13", "this book is good"));
        books.add(new Book(R.drawable.book_holder, "Book14", "this book is good"));
        books.add(new Book(R.drawable.book_holder, "Book15", "this book is good"));
        books.add(new Book(R.drawable.book_holder, "Book16", "this book is good"));

        //create instance of the bookAdapter and pass the context and arrayList created above
        BooksAdapter booksAdapter = new BooksAdapter(this, books);

        //referring to the listView
        ListView booksListView = findViewById(R.id.list);

        //set the bookAdapter for booksListView
        booksListView.setAdapter(booksAdapter);

    }
}