package com.example.user.diucoursedetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button firstBTN, secondBTN, thirdBTN, fourthBTN, fifthBTN, sixthBTN, seventhBTN, eighthBTN, ninthBTN, tenthBTN, eleventhBTN, twelfthBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstBTN = findViewById(R.id.firstBTN);
        secondBTN = findViewById(R.id.secondBTN);
        thirdBTN = findViewById(R.id.thirdBTN);
        fourthBTN = findViewById(R.id.fourthBTN);
        fifthBTN = findViewById(R.id.fifthBTN);
        sixthBTN = findViewById(R.id.sixthBTN);
        seventhBTN = findViewById(R.id.seventhBTN);
        eighthBTN = findViewById(R.id.eighthBTN);
        ninthBTN = findViewById(R.id.ninthBTN);
        tenthBTN = findViewById(R.id.tenthBTN);
        eleventhBTN = findViewById(R.id.eleventhBTN);
        twelfthBTN = findViewById(R.id.twelfthBTN);

        firstBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });

        secondBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        thirdBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

        fourthBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FourthActivity.class);
                startActivity(intent);
            }
        });

        fifthBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FifthActivity.class);
                startActivity(intent);
            }
        });

        sixthBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SixthActivity.class);
                startActivity(intent);
            }
        });

        seventhBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SeventhActivity.class);
                startActivity(intent);
            }
        });

        eighthBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EighthActivity.class);
                startActivity(intent);
            }
        });

        ninthBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NinthActivity.class);
                startActivity(intent);
            }
        });

        tenthBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TenthActivity.class);
                startActivity(intent);
            }
        });

        eleventhBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EleventhActivity.class);
                startActivity(intent);
            }
        });

        twelfthBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TwelfthActivity.class);
                startActivity(intent);
            }
        });

    }
}
