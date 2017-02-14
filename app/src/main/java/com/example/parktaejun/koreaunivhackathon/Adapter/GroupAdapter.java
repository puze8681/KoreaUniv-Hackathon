package com.example.parktaejun.koreaunivhackathon.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.parktaejun.koreaunivhackathon.Data.Board;
import com.example.parktaejun.koreaunivhackathon.Data.Group;
import com.example.parktaejun.koreaunivhackathon.R;

import java.util.List;

/**
 * Created by parktaejun on 2017. 2. 14..
 */

public class GroupAdapter extends BaseAdapter {

    private Context context;
    private List<Group> items;

    public GroupAdapter(Context context, List<Group> items) {
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

        view = LayoutInflater.from(context).inflate(R.layout.item_group, null);

        TextView groupName = (TextView) view.findViewById(R.id.group_name);
        groupName.setText(items.get(position).groupName);
        TextView religion = (TextView) view.findViewById(R.id.religion);
        religion.setText(items.get(position).religion);
        TextView allergy = (TextView) view.findViewById(R.id.allergy);
        allergy.setText(items.get(position).allergy);

        return view;
    }
}
