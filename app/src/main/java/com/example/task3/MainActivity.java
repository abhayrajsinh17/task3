package com.example.task3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] items = {"MS Dhoni", "Virat Kohli", "Rohit Sharma", "Shubman Gill", "Jasprit Bumrah", "Ravindra Jadeja", "Rishabh Pant", "Ajinkya Rahane", "Cheteshwar Pujara", "KL Rahul", "Mohammed Shami", "Ravichandran Ashwin", "Ishant Sharma", "Axar Patel", "Shardul Thakur", "Suryakumar Yadav", "Hardik Pandya", "Bhuvneshwar Kumar", "Shikhar Dhawan", "Yuzvendra Chahal", "Kuldeep Yadav"};

        ListView itemListView = findViewById(R.id.playerListView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, items);
        itemListView.setAdapter(adapter);
        itemListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedItem = (String) parent.getItemAtPosition(position);

                Toast.makeText(MainActivity.this, selectedItem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
