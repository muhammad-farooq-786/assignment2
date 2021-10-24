package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void calculate(View view){
        EditText qNamaz = findViewById(R.id.qazaNamaz);
        EditText qRoza = findViewById(R.id.qazaRoza);
        EditText qWitr = findViewById(R.id.qazaWitr);
        int namaz = Integer.parseInt(qNamaz.getText().toString());
        int witr = Integer.parseInt(qWitr.getText().toString());
        int roza = Integer.parseInt(qRoza.getText().toString());
        namaz=namaz*140;
        roza*=140;
        witr*=140;
        int total = namaz+roza+witr;

        TextView result = findViewById(R.id.result);
        result.setText(String.valueOf(total));
    }
}