package com.example.registrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnClick;
    EditText etname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClick=findViewById(R.id.btnClick);
        etname=findViewById(R.id.etname);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=etname.getText().toString();
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("NAME" , name);

                startActivity(intent);
            }
        });
    }
}