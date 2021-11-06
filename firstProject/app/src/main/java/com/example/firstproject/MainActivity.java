package com.example.firstproject;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonIntent = (Button)findViewById(R.id.calculate);
        buttonIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               calculate();
            }
        });

    }


    @Override

    protected void onStart() {

        super.onStart();

        Log.d(TAG, "onStart Activity Main");

    }

    @Override

    protected void onResume() {

        super. onResume();

        Log.d(TAG, " onResume Activity Main");

    }
    @Override

    protected void onPause() {

        super. onPause();

        Log.d(TAG, " onPause Activity Main");

    }

    @Override

    protected void onStop() {

        super. onStop();

        Log.d(TAG, " onStop Activity Main");

    }

    @Override

    protected void onDestroy() {

        super. onDestroy();

        Log.d(TAG, " onDestroy Activity Main");

    }

    public void calculate(){
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
        String totalNew = Integer.toString(total);

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("result",totalNew);
        startActivity(intent);
        finish();
    }
}