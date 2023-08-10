package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   TextView welcomeText, counterText;
   Button btn;
   int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        counterText = findViewById(R.id.counterText);
        welcomeText = findViewById(R.id.welcomeText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              counterText.setText(""+increaseCounter());
            }
        });


    }
    public int increaseCounter(){
       return  ++counter;

    }
}