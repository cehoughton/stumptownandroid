package com.epicodus.stumptown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    private ListView mListView;
    private String[] coffees = new String[] {"Rwanda Rwamweru", "Rwanda Huye Mountain", "Ethiopia Nano Challa", "Ethiopia Duromina", "Indonesia Bies Penantan", "Colombia El Nevado", "Guatemala Candelaria", "Colombia El Jordan", "Peru Chirinos", "Golden Hour", "Hair Bender", "Trapper Creek Decaf", "Holler Mountain", "House Blend", "French Roast"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, coffees);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String coffee = ((TextView)view).getText().toString();
                Toast.makeText(MainActivity.this, coffee, Toast.LENGTH_LONG).show();
            }
        });







    }
}
