package com.example.mostofa;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button changeActivityButton;
    public WebView mywebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        changeActivityButton = (Button) findViewById(R.id.button1);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,HistoryActivity.class);
                startActivity(intent);
            }
        });

        changeActivityButton = (Button) findViewById(R.id.button2);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,GalleryActivity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button17);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,HpiclassrutingActivity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button16);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,OnlinetfActivity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button3);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,TechnologyActivity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button5);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,TeachersActivity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button18);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,StudentActivity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button7);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,AcademicCalenderActivity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button8);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,HpiWebsiteActivity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button9);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,HpiNoticeActivity.class);
                startActivity(intent);
            }
        });

        changeActivityButton = (Button) findViewById(R.id.button10);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,ResultActivity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button13);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,BtebNoticeActivity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button14);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,MapActivity.class);
                startActivity(intent);
            }
        });
        changeActivityButton = (Button) findViewById(R.id.button15);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,AboutActivity.class);
                startActivity(intent);
            }
        });

    }
}