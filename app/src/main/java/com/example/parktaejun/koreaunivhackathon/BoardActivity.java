package com.example.parktaejun.koreaunivhackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.parktaejun.koreaunivhackathon.Adapter.BoardAdapter;
import com.example.parktaejun.koreaunivhackathon.Data.Board;

import java.util.ArrayList;
import java.util.List;

public class BoardActivity extends AppCompatActivity {

    private ListAdapter boardAdapter;
    private List<Board> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        boardAdapter = new BoardAdapter(this, items);
        ListView boardListView = (ListView) findViewById(R.id.board_list);
        boardListView.setAdapter(boardAdapter);

        items.add(new Board("이름1", "제목1", "내용1", "이미지 주소1"));
        items.add(new Board("이름2", "제목2", "내용2", "이미지 주소2"));
        items.add(new Board("이름3", "제목3", "내용3", "이미지 주소3"));
        items.add(new Board("이름4", "제목4", "내용4", "이미지 주소4"));
        items.add(new Board("이름5", "제목5", "내용5", "이미지 주소5"));
    }
}
