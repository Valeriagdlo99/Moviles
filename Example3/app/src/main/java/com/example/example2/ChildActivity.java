package com.example.example2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {
    String anyString;
    TextView myTxtView;
    Intent intentReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        myTxtView = findViewById(R.id.textView2);
        intentReceiver=getIntent();
        myTxtView.setText(intentReceiver.getStringExtra("myExtra"));

    }

}