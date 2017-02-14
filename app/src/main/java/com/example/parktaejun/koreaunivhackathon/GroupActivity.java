package com.example.parktaejun.koreaunivhackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.parktaejun.koreaunivhackathon.Adapter.BoardAdapter;
import com.example.parktaejun.koreaunivhackathon.Adapter.GroupAdapter;
import com.example.parktaejun.koreaunivhackathon.Data.Board;
import com.example.parktaejun.koreaunivhackathon.Data.Group;

import java.util.ArrayList;
import java.util.List;

public class GroupActivity extends AppCompatActivity {

    private ListAdapter groupAdapter;
    private List<Group> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        groupAdapter = new GroupAdapter(this, items);
        ListView groupListView = (ListView) findViewById(R.id.group_list);
        groupListView.setAdapter(groupAdapter);

        items.add(new Group("그룹이름1", "종교1", "알레르기1"));
        items.add(new Group("그룹이름2", "종교2", "알레르기2"));
        items.add(new Group("그룹이름3", "종교3", "알레르기3"));
        items.add(new Group("그룹이름4", "종교4", "알레르기4"));
        items.add(new Group("그룹이름5", "종교5", "알레르기5"));
        
        groupListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                        String positionCheck = items.get(i).groupName;
                        Intent boardIntent = new Intent(GroupActivity.this, BoardActivity.class);
                        startActivity(boardIntent);
                    }
                });
    }

}

