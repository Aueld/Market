package com.JJProject.java;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.JJProject.java.alpha.CommentActivity;

import com.JJProject.java.alpha.SettingActivity;

import com.google.firebase.quickstart.database.R;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainMainActivity extends AppCompatActivity {

    public Activity AMainActivity = MainMainActivity.this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_view);

        ImageButton button1 = findViewById(R.id.transbts);
        ImageButton button2 = findViewById(R.id.transbts2);
        ImageButton button3 = findViewById(R.id.transbts3);
        ImageButton button4 = findViewById(R.id.transbts4);
        ImageButton button5 = findViewById(R.id.transbts5);
        ImageButton button6 = findViewById(R.id.transbts6);
        ImageButton button7 = findViewById(R.id.transbts7);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                AMainActivity.finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("a", 2);
                startActivity(intent);

                //AMainActivity.finish();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                //AMainActivity.finish();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CommentActivity.class);
                startActivity(intent);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("a", 1);
                startActivity(intent);

                //AMainActivity.finish();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MyPageActivity.class);
                startActivity(intent);

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SettingActivity.class);
                startActivity(intent);

            }
        });
    }
}
