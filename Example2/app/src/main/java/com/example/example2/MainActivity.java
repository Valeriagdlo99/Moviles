package com.example.example2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonManager1;
    TextView textViewManager;
    ImageView imgViewManager;
    Intent myIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonManager1= findViewById(R.id.button);
        textViewManager= findViewById(R.id.textView);
        imgViewManager=findViewById(R.id.imageView);

        buttonManager1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textViewManager.setText("Clicked!");

                if (imgViewManager.getVisibility()== View.VISIBLE){
                    imgViewManager.setVisibility(View.INVISIBLE);
                }else{
                    imgViewManager.setVisibility(View.VISIBLE);
                }

                myIntent = new Intent(MainActivity.this, ChildActivity.class);
                myIntent.putExtra("myExtra",textViewManager.getText().toString());
                startActivity(myIntent);
            }
        });


    }
}