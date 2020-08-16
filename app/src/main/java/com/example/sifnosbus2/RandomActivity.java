package com.example.sifnosbus2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class RandomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        Button dial0 =  (Button) findViewById(R.id.dial0); // Find dial id
        Button dial1 =  (Button) findViewById(R.id.dial1);
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
                intent.setData(Uri.parse("tel:2284031216"));
                startActivity(intent);
            }
        });

        dial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:6944742652"));
                startActivity(intent);
            }
        });

        dial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:6944761210"));
                startActivity(intent);
            }
        });

        dial3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:6944444904"));
                startActivity(intent);
            }
        });

        dial4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:6944642680"));
                startActivity(intent);
            }
        });

        dial5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:6944696409"));
                startActivity(intent);
            }
        });

        dial6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:6932403485"));
                startActivity(intent);
            }
        });

        dial7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:6944936111"));
                startActivity(intent);
            }
        });

        dial8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:6944900972"));
                startActivity(intent);
            }
        });

        dial9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:6973209720"));
                startActivity(intent);
            }
        });
    }
}
