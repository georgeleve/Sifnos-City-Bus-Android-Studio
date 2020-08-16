package com.example.sifnosbus2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ButtonFourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_four);

        Button dial0 =  (Button) findViewById(R.id.dial0); // Find dial id
        Button dial11 =  (Button) findViewById(R.id.dial1);
        Button dial2 =  (Button) findViewById(R.id.dial2);
        Button dial3 =  (Button) findViewById(R.id.dial3);
        Button dial4 =  (Button) findViewById(R.id.dial4);
        Button dial5 =  (Button) findViewById(R.id.dial5);
        Button dial6 =  (Button) findViewById(R.id.dial6);
        Button dial7 =  (Button) findViewById(R.id.dial7);
        Button dial8 =  (Button) findViewById(R.id.dial8);
        Button dial9 =  (Button) findViewById(R.id.dial9);

        dial0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:2284031315"));
                startActivity(intent);
            }
        });

        dial11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:2284031315"));
                startActivity(intent);
            }
        });

        dial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:2284031210"));
                startActivity(intent);
            }
        });

        dial3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:6945459414"));
                startActivity(intent);
            }
        });

        dial4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:2284031329"));
                startActivity(intent);
            }
        });

        dial5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:2284360300"));
                startActivity(intent);
            }
        });

        dial6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:2284031234"));
                startActivity(intent);
            }
        });

        dial7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:22840 33661"));
                startActivity(intent);
            }
        });

        dial8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:2284033541"));
                startActivity(intent);
            }
        });

        dial9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:2284033033"));
                startActivity(intent);
            }
        });
    }
}
