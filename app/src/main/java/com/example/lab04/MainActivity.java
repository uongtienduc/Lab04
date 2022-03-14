package com.example.lab04;

import androidx.appcompat.app.AppCompatActivity;
import com.example.lab04.R;
import com.example.lab04.Adapter;
import com.example.lab04.ItemModel;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;
    ArrayList<ItemModel> arrayList;
    Adapter Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.idListView);

        arrayList = ItemModel.initItem();
        Adapter = new Adapter(MainActivity.this,R.layout.item_custom_list_view,arrayList);

        list.setAdapter(Adapter);


    }
}