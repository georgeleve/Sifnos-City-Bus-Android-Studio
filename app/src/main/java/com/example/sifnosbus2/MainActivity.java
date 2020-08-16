package com.example.sifnosbus2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    public Button BtnMove,b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize buttons
        BtnMove = findViewById(R.id.BtnActivityOne);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);


        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivity2();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToRandomActivity();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToButtonTwoActivity();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToButtonThreeActivity();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToButtonFourActivity();
            }
        });
    }


    private void moveToActivity2(){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
    private void moveToRandomActivity(){
        Intent intent = new Intent(MainActivity.this, RandomActivity.class);
        startActivity(intent);
    }
    private void moveToButtonTwoActivity(){
        Intent intent = new Intent(MainActivity.this, ButtonTwoActivity.class);
        startActivity(intent);
    }
    private void moveToButtonThreeActivity(){
        Intent intent = new Intent(MainActivity.this, ButtonThreeActivity.class);
        startActivity(intent);
    }
    private void moveToButtonFourActivity(){
        Intent intent = new Intent(MainActivity.this, ButtonFourActivity.class);
        startActivity(intent);
    }
}
