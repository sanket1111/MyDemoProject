package com.example.sanket.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void sendMessage(View view)
    {
        EditText editText=findViewById(R.id.userMessage);
        String message=editText.getText().toString();
        Intent intent=new Intent(this,MessageActivity.class);
        intent.putExtra("Extra Message",message);
        startActivity(intent);
    }

    private void TestDemo()
    {
        int i= 1+1;
        int ii= 2+2;
        int iii = i+ii;
    }
}
