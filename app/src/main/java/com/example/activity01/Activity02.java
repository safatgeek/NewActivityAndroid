package com.example.activity01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_02);
        Intent i = getIntent();
        String name = i.getStringExtra("n");
        int age = i.getIntExtra("a",20);


        TextView textView1 = (TextView)findViewById(R.id.textview1);
        TextView textView2 = (TextView)findViewById(R.id.textview2);
        textView1.setText(name);
       // textView2.setText(age);
        textView2.setText(String.valueOf(age));
    }
}
