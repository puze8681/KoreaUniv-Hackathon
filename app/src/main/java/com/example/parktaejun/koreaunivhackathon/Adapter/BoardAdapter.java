package com.example.parktaejun.koreaunivhackathon.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.parktaejun.koreaunivhackathon.Data.Board;
import com.example.parktaejun.koreaunivhackathon.R;

import java.util.List;

/**
 * Created by parktaejun on 2017. 2. 14..
 */

public class BoardAdapter extends BaseAdapter{

    private Context context;
    private List<Board> items;

    public BoardAdapter(Context context, List<Board> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        view = LayoutInflater.from(context).inflate(R.layout.item_board, null);
        TextView postName = (TextView) view.findViewById(R.id.post_name);
        postName.setText(items.get(position).postName);

        TextView postTitle = (TextView) view.findViewById(R.id.post_title);
        postName.setText(items.get(position).postName);

        TextView postContext = (TextView) view.findViewById(R.id.post_context);
        postName.setText(items.get(position).postName);

        ImageView postImage = (ImageView) view.findViewById(R.id.post_image);
        postName.setText(items.get(position).postName);

        return view;
    }
}
