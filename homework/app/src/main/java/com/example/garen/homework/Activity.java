package com.example.garen.homework;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);

        Intent intent = getIntent();
        String gg = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        TextView textView = findViewById(R.id.Text_2);
        textView.setText("B10509027:"+ gg);
    }
}
