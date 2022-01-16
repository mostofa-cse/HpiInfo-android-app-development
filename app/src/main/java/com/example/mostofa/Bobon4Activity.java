package com.example.mostofa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bobon4Activity extends AppCompatActivity {
    Button changeActivityButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bobon4);
        changeActivityButton = (Button) findViewById(R.id.button1);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bobon4Activity.this,B4f1Activity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button2);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bobon4Activity.this,B4f2Activity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button3);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bobon4Activity.this,B4f3Activity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button4);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bobon4Activity.this,B4f4Activity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button5);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bobon4Activity.this,B4f5Activity.class);
                startActivity(intent);
            }
        });
    }
}
