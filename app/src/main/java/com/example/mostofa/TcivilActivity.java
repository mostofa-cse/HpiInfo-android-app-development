package com.example.mostofa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TcivilActivity extends AppCompatActivity {
    Button changeActivityButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tcivil);
        changeActivityButton = (Button) findViewById(R.id.button1);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TcivilActivity.this,com.example.mostofa.HcivilActivity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button2);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( TcivilActivity.this,com.example.mostofa.TtcivilActivity.class);
                startActivity(intent);
            }
        });
    }
}
