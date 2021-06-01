package com.example.registrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView tvname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvname=findViewById(R.id.tvname);

        Intent intent =getIntent();
       String nm = intent.getStringExtra( "NAME");

       tvname.setText("welcome"+nm);

    }
}