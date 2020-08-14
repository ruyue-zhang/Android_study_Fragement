package com.ruyue.fragement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button androidBtn = findViewById(R.id.android);
        final Button javaBtn = findViewById(R.id.java);
        androidBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidBtn.setBackground(getResources().getDrawable(R.drawable.btn_label_pressed, null));
                javaBtn.setBackground(getResources().getDrawable(R.drawable.btn_label_up, null));
            }
        });

        javaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                javaBtn.setBackground(getResources().getDrawable(R.drawable.btn_label_pressed, null));
                androidBtn.setBackground(getResources().getDrawable(R.drawable.btn_label_up, null));
            }
        });
    }
}