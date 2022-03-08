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

import java.util.List;

public class Adapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<ItemModel> listItem;
    private int positionSelect = -1;


    public Adapter(Context context, int idLayout, List<ItemModel> listItem) {
        this.context = context;
        this.idLayout = idLayout;
        this.listItem = listItem;
    }


    @Override
    public int getCount() {
        return listItem.size();
    }

    @Override
    public Object getItem(int position) {
        return listItem;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        if (view == null) {
            view = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
        }

        TextView tv_item = (TextView) view.findViewById(R.id.tv_item);
        ImageView imageView = (ImageView) view.findViewById(R.id.logo);
        final LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.idLinearLayout);
        final ItemModel items = listItem.get(position);

        if (listItem != null && !listItem.isEmpty()) {
            tv_item.setText(items.getName());
            int idItem = items.getId();
            switch (idItem) {
                case 1:
                    imageView.setImageResource(R.drawable.ca_nau_lau);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.ga_bo_toi);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.do_choi_dang_mo_hinh);
                    break;
                case 4:
                    imageView.setImageResource(R.drawable.xa_can_cau);
                    break;
                case 5:
                    imageView.setImageResource(R.drawable.lanh_dao_gian_don);
                    break;
                case 6:
                    imageView.setImageResource(R.drawable.hieu_long_con_tre);
                    break;
                default:
                    break;
            }
        }
//        convertView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, items.getName(), Toast.LENGTH_LONG).show();
//                positionSelect = position;
//                notifyDataSetChanged();
//            }
//        });

        if (positionSelect == position) {
            linearLayout.setBackgroundColor(Color.BLUE);
        } else {
            linearLayout.setBackgroundColor(Color.WHITE);
        }
        return view;
    }

}