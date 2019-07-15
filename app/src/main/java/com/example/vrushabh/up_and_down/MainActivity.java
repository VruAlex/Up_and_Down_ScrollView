package com.example.vrushabh.up_and_down;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    ScrollView scrollView;
    FloatingActionButton floatingActionButton, floatingActionButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = findViewById(R.id.Scroll);
        floatingActionButton = findViewById(R.id.button);
        floatingActionButton2 = findViewById(R.id.feb);

        //Down Button
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.fullScroll(ScrollView.FOCUS_DOWN);
                floatingActionButton2.show();
            }
        });

        //Up button
        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.fullScroll(ScrollView.FOCUS_UP);
                floatingActionButton.show();
            }
        });
    }
}
