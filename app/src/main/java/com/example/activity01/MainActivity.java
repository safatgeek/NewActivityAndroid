package com.example.activity01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =(Button) findViewById(R.id.btnActvty2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2(){
        EditText editTextName = (EditText) findViewById(R.id.edittextName);
        String name = editTextName.getText().toString();
        EditText editTextAge = (EditText) findViewById(R.id.edittextAge);
        int age = Integer.parseInt(editTextAge.getText().toString()) ;
        Intent i = new Intent(this,Activity02.class);

        i.putExtra("n",name);
        i.putExtra("a",age);
        startActivity(i);
    }
}
