package com.example.taruc.lab2intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.taruc.lab2intent.Message";
    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMessage = findViewById(R.id.editTextMessage);
    }

    public void sendMessage(View view){
        // Create an intent
        Intent intent = new Intent(this,SecondActivity.class);

        String message = editTextMessage.getText().toString() ;

        intent.putExtra(EXTRA_MESSAGE,message); //pack a message into EXTRA MESSAGE
        Log.d("MainActivity",message);
        startActivity(intent);

    }
}
