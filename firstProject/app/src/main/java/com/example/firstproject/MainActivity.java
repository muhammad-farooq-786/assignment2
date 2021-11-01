package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonIntent = findViewById(R.id.calculate);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("result",total);
                //startActivity(buttonIntent);
                //well there can be many things
                //and you should be doing those
            }
        });
    }

}