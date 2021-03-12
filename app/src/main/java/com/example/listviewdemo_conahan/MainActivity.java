package com.example.listviewdemo_conahan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listview;

    private String[] classes;
    private ArrayAdapter<String> myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.class_schedule);

        classes = new String[]{"CSCI 370","CSCI 392","CSCI 470","CSCI 462","ANTH 101"};

        myAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,classes);

        listview.setAdapter(myAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){

               String s = "test short";


               Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
           }
        });

        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long l){

                String s = "test long";


                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();

                return true;
            }
        });
    }
}