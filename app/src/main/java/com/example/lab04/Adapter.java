package com.example.lab04;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lab04.R;
import com.example.lab04.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private ArrayList<ItemModel> arrayList;
    private int positionSelect = -1;


    public Adapter(Context context, int idLayout, ArrayList<ItemModel> objects) {
        this.context = context;
        this.idLayout = idLayout;
        this.arrayList = objects;
    }


    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        ItemModel item = arrayList.get(position);

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(idLayout,null);
        }

        ImageView img = convertView.findViewById(R.id.logo);
        img.setImageResource(item.getId());
        TextView txt = convertView.findViewById(R.id.tv_item);
        txt.setText(item.getName());

        return convertView;
    }

}