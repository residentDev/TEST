package com.example.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

//4- create a custom arrayAdapter class of the type Book

public class BooksAdapter extends ArrayAdapter<Book> {

    // constructor of the ArrayAdapter class
    public BooksAdapter(@NonNull Context context, ArrayList<Book> books){
        // pass the context and arrayList for the super
        super(context, 0, books);

    }

    @NonNull
    @Override
    public View getView (int position, @Nullable View convertView, @NonNull ViewGroup parent){
        // convertView which is recyclable view
        View currentItemView  = convertView;
        // if the recyclable view is null then inflate the custom layout
        if(currentItemView ==  null){
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_view, parent, false);
        }

        // get the position of the view (book here) from the ArrayAdapter
        Book currentBookPosition = getItem(position);

        //according to the position of the view assign the desired image
        ImageView bookImg = currentItemView.findViewById(R.id.image);
        assert currentBookPosition != null;

        bookImg.setImageResource(currentBookPosition.getImg());

        //according to the position of the view assign the desired textView1
        TextView bookTitle = currentItemView.findViewById(R.id.text1);
        bookTitle.setText(currentBookPosition.getTitle());

        //according to the position of the view assign the desired textView2
        TextView bookDesc = currentItemView.findViewById(R.id.text2);
        bookDesc.setText(currentBookPosition.getDesc());

        //return the recyclable view
        return currentItemView;
    }

}
