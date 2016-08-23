package com.example.hp.recyclerview03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<Person> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
    private void init(){
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        list = new ArrayList<>();
        list.add(new Person(R.drawable.ngoctrinh01,"thao dep trai"));
        list.add(new Person(R.drawable.ngoctrinh02,"thao dep trai 02"));
        adapter= new MyAdapter(this,list);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(adapter);

    }
}
