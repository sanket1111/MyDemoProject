package com.example.sanket.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        Intent intent=getIntent();

        String message=intent.getStringExtra("Extra Message");
        TextView textView=findViewById(R.id.display_Message);
        textView.setText(message);
    }
}
