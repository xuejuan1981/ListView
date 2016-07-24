package com.example.lsx.listviewexar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.activity_main_list_view);
        String[] data = {"apple","banana","pear","orange","apple","banana",
                "pear","orange","apple","banana","pear","orange","banana","pear","orange"};
        ArrayAdapter<String> adaper = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,data);
        mListView.setAdapter(adaper);
    }
}
