package com.example.taruc.lab2intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textViewMessage = findViewById(R.id.textViewMessage);
        Intent intent = getIntent(); //who calling me

        if(intent.hasExtra(MainActivity.EXTRA_MESSAGE)){
            String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
            textViewMessage.setText(message);
        }


    }


    public void closeActivity(View view){
        finish();
    }
}
