package com.example.mostofa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class HresultActivity extends AppCompatActivity {
    Button changeActivityButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hresult);
        changeActivityButton = (Button) findViewById(R.id.button3);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( HresultActivity.this,HcresultActivity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button4);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( HresultActivity.this,HcmtresultActivity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button6);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( HresultActivity.this,HentresultActivity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button5);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( HresultActivity.this,HaidtresultActivity.class);
                startActivity(intent);
            }
        });
    }
}
