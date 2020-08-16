package com.example.sifnosbus2;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ButtonThreeActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_three);

        listView = (ListView) findViewById(R.id.list3);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("                             \nΑποστάσεις δρόμων στην Σίφνο\nRoad Distances in Sifnos\n     " +
                "                                                ");
        arrayList.add("KAMARES - APOLLONIA      5 km");
        arrayList.add("APOLLONIA – KATAVATI     1,2 km");
        arrayList.add("APOLLONIA – EXABELA      1,6 km");
        arrayList.add("APOLLONIA – VATHI           10 km");
        arrayList.add("APOLLONIA – FAROS             7 km");
        arrayList.add("APOLLONIA – CHRISSOPIGI       8 km");
        arrayList.add("APOLLONIA – PLATIS GIALOS      10 km");
        arrayList.add("APOLLONIA – ARTEMONAS    1,3 km");
        arrayList.add("APOLLONIA – POULATI\t        3,3 km");
        arrayList.add("APOLLONIA – CHERONISSOS\t    15,5 km");
        arrayList.add("APOLLONIA - TROULAKI\t          8,5 km");
        arrayList.add("APOLLONIA - VROULIDIA\t         12,5 km");
        arrayList.add("APOLLONIA - AG. ANNA\t          2,2 km");
        arrayList.add("APOLLONIA - PLATI PIGADI\t      2,5 km");
        arrayList.add("APOLLONIA - KASTRO\t           3 km");
        arrayList.add("APOLLONIA - KATO PETALI\t     1,3 km");
        arrayList.add("KAMARES - TROULAKI (THROUGH VORINI ROAD)\t8 km");
        arrayList.add("KAMARES - CHERONISSOS (THROUGH VORINI ROAD)\t15 km\n");
        arrayList.add("KAMARES - VROULIDIA (THROUGH VORINI ROAD)\t12 km\n");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
    }
}

