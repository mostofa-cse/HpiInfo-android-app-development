package com.example.mostofa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bobon1Activity extends AppCompatActivity {
    Button changeActivityButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bobon1);
      changeActivityButton = (Button) findViewById(R.id.button1);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bobon1Activity.this,B1f1Activity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button2);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bobon1Activity.this,B1f2Activity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button3);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bobon1Activity.this,B1f3Activity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button4);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bobon1Activity.this,B1f4Activity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button5);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bobon1Activity.this,B1f5Activity.class);
                startActivity(intent);
            }
        });
    }
}
