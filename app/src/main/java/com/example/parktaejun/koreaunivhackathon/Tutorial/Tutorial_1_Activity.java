package com.example.parktaejun.koreaunivhackathon.Tutorial;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.parktaejun.koreaunivhackathon.Adapter.SearchAdapter;
import com.example.parktaejun.koreaunivhackathon.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Tutorial_1_Activity extends AppCompatActivity {

    private EditText searchText;
    String items[];
    ArrayList listItems;
    SearchAdapter adapter;
    ListView listView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_1_);


        listView = (ListView) findViewById(R.id.searchList);
        editText = (EditText) findViewById(R.id.searchText);

        initList();

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.toString().equals("")){
                    initList();
                }
                else{
                    searchItem(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    public void initList(){
        items = new String[] {"가나다", "다라마", "마바사" , "사아자"};
        listItems = new ArrayList<>(Arrays.asList(items));
        adapter = new SearchAdapter(this, items);
        listView.setAdapter(adapter);
    }

    public void searchItem(String textToSearch){
        for(String item : items){
            if(!item.contains(textToSearch)){
                listItems.remove(item);
            }
        }
        adapter.notifyDataSetChanged();
    }
}
