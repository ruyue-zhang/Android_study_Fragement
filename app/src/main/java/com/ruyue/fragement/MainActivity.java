package com.ruyue.fragement;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final FragmentAndroid fragmentAndroid = new FragmentAndroid();
        final FragmentJava fragmentJava = new FragmentJava();
        getSupportFragmentManager().beginTransaction().add(R.id.my_fl, fragmentAndroid).commitAllowingStateLoss();


        final Button androidBtn = findViewById(R.id.android);
        final Button javaBtn = findViewById(R.id.java);

        androidBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                androidBtn.setBackground(getResources().getDrawable(R.drawable.btn_label_pressed, null));
                javaBtn.setBackground(getResources().getDrawable(R.drawable.btn_label_up, null));
                getSupportFragmentManager().beginTransaction().replace(R.id.my_fl, fragmentAndroid).commitAllowingStateLoss();
            }
        });

        javaBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                javaBtn.setBackground(getResources().getDrawable(R.drawable.btn_label_pressed, null));
                androidBtn.setBackground(getResources().getDrawable(R.drawable.btn_label_up, null));
                getSupportFragmentManager().beginTransaction().replace(R.id.my_fl, fragmentJava).commitAllowingStateLoss();
            }
        });
    }
}