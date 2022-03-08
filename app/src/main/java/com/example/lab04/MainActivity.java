package com.example.lab04;

import androidx.appcompat.app.AppCompatActivity;
import com.example.lab04.R;
import com.example.lab04.Adapter;
import com.example.lab04.ItemModel;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private List<ItemModel> listItem;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.idListView);
        listItem = new ArrayList<>();

        listItem.add(new ItemModel(1, "Lập Trình Java"));
        listItem.add(new ItemModel(2, "Lập Trình Java"));
        listItem.add(new ItemModel(3, "Lập Trình Java"));
        listItem.add(new ItemModel(4, "Lập Trình Java"));
        listItem.add(new ItemModel(5, "Lập Trình Java"));
        listItem.add(new ItemModel(6, "Lập Trình Java"));


        Adapter adapter = new Adapter(this, R.id.tv_item, listItem);

        listView.setAdapter(adapter);


    }
}