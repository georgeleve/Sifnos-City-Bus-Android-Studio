package com.example.sifnosbus2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ButtonTwoActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_two);

        listView = (ListView) findViewById(R.id.list2);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("                                                     \nTicket Prices/ Τιμές Εισητηρίων\n" +
                "                                                           ");
        arrayList.add("Kamares-Artemonas               1.80€");
        arrayList.add("Kamares-Platis Gialos            2.30€");
        arrayList.add("Kamares-Vathi                        2.30€");
        arrayList.add("Kamares-Kastro                     1.80€");
        arrayList.add("Kamares-Faros                      1.90€");
        arrayList.add("Artemonas-Cheronissos       2.50€");
        arrayList.add("Artemonas-Platis Gialos     1.80€");
        arrayList.add("Artemonas-Vathi                  1.80€");
        arrayList.add("Artemonas-Faros                  1.80€");
        arrayList.add("Artemonas-Kastro                 1.80€");
        arrayList.add("Artemonas-Kato Petali           1.80€");
        arrayList.add("Artemonas-Exambela             1.80€");
        arrayList.add("Artemonas-Katavati               1.80€");
        arrayList.add("Artemonas-Cheronissos      1.80€");
        arrayList.add("Kastro-Faros                          1.80€");
        arrayList.add("Kastro-Platis Gialos              2.20€");
        arrayList.add("Platis Gialos-Cheronissos   3.20€");
        arrayList.add("Local                                       1.80€");
        arrayList.add("Luggages (more than 10kg), same as the ticket price");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }
}
