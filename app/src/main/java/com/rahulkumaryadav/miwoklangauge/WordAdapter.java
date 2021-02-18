package com.rahulkumaryadav.miwoklangauge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int colorResourceId;
    public WordAdapter(@NonNull Context context,  @NonNull ArrayList<Word> objects,int colorResourceId ) {
        super(context, 0, objects);
        this.colorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View listItemView = convertView;
        if (listItemView==null);
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord = getItem(position);

        TextView foreignWord = listItemView.findViewById(R.id.foreign_word);
        TextView nativeWord = listItemView.findViewById(R.id.native_word);
        ImageView imageView = listItemView.findViewById(R.id.imageView);

        foreignWord.setText(currentWord.getForeignWord());
        nativeWord.setText(currentWord.getNativeWord());


        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),colorResourceId);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}
