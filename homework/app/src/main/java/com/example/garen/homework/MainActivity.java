package com.example.garen.homework;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.example.garen.hw1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonShow = findViewById(R.id.button);
        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Next();
            }
        });
    }




    public void Next(){
        Intent intent = new Intent();
        intent.setClass( this,Activity.class);
        EditText editText = findViewById(R.id.Text_1);
        String gg = editText.getText().toString();
        intent.putExtra(EXTRA_TEXT,gg);
        startActivity(intent);



    }
}