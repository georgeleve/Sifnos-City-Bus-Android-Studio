package com.example.sifnosbus2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        listView = (ListView) findViewById(R.id.list0);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("\n              Δρομολόγια Λεωφορείων / Bus Roots\n" +
                        "            Jul 25, 2020 - Aug 23, 2020\n                                               ");
        arrayList.add("Artemonas - Apollonia - Kamares\nΚαθημερινά/Daily: 07:00\n" +
                "09:00 10:00 11:00 12:00 13:00 14:00 15:00 " +
                "16:00 18:00 19:00 20:00 21:00 22:00 24:00\n");

        arrayList.add("Kamares - Apollonia - Artemonas\nΚαθημερινά/Daily: 07:20 9:30 10:30 11:30 12:30 13:30" +
                "14:30 15:30 16:30 18.20 19:30 20:30 21:30 22:30 24:15\n");

        arrayList.add("Artemonas - Apollonia - Platis Gialos\nΚαθημερινά/Daily: 07:00\n" +
                "09:00 11:00 12:00 13:00 15:00\n" +
                "16:00 17:00 18:00 19:00 20:00 21:00 23:00\n");

        arrayList.add("Platis Gialos - Apollonia - Artemonas\n" +
                "Καθημερινά/Daily: 07:35 09:30 11:30 12:35 13:30\n" +
                        "15:20 16:30 17:30 18:30 19:30 20:30 21:30 23:30\n");

        arrayList.add("Apollonia - Kastro:\nΚαθημερινά/Daily: 07:25\n" +
                "10:30 12:30 14:30 18:30 20:30 22:30\n");

        arrayList.add("Kastro - Apollonia:Καθημερινά/Daily: 07:35" +
                "10:35 12:35 14:35 18:35 20:35 22:35\n");

        arrayList.add("Artemonas - Apollonia - Faros\nΚαθημερινά/Daily: 07:00\n" +
                "10:00 12:00 14:00 17:00 20:00 22:00\n");

        arrayList.add("Faros - Apollonia - Artemonas\nΚαθημερινά/Daily:" +
                " 07:15 10:20 12:20 14:20 17:20 20:20 22:20\n");

        arrayList.add("Artemonas - Apollonia - Vathi\nΚαθημερινά/Daily:" +
        " 10:00 12:00 15:00 18:00 21:00\n");

        arrayList.add("Vathi - Apollonia - Artemonas\nΚαθημερινά/Daily"
        + "10:25 12:25 15:25 18:25 21:25\n");

        arrayList.add("Artemonas - Cheronissos\nΚαθημερινά/Daily: 08:00 11:00 16:00 19:00\n");

        arrayList.add("Cheronissos - Artemonas\nΚαθημερινά/Daily: 08:20 11:20 16.20 19.20\n");

        arrayList.add("Route information: +30 2284031977\n" + "Email: portal@sifnos.gr");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);
    }
}
