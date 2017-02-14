package com.example.parktaejun.koreaunivhackathon.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.parktaejun.koreaunivhackathon.R;

/**
 * Created by parktaejun on 2017. 2. 14..
 */

public class SearchAdapter extends ArrayAdapter<String>{

    public SearchAdapter(Context context, String items[]) {
        super(context, R.layout.item_search, items);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater imageinflater = LayoutInflater.from(getContext());
        View view = imageinflater.inflate(R.layout.item_search, parent, false);
        String item = getItem(position);

        TextView textView = (TextView) view.findViewById(R.id.list_text);
        textView.setText(item);

        return view;
    }
}
