package com.example.lab04;

import java.util.ArrayList;

public class ItemModel {
    private int id;
    private String name;

    public ItemModel(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList initItem(){
        ArrayList<ItemModel> arrayList = new ArrayList<>();
        arrayList.add(new ItemModel(R.drawable.ca_nau_lau,"ca nau lau"));
        arrayList.add(new ItemModel(R.drawable.do_choi_dang_mo_hinh,"dochoi"));
        arrayList.add(new ItemModel(R.drawable.ga_bo_toi,"ga"));
        arrayList.add(new ItemModel(R.drawable.hieu_long_con_tre,"sach"));
        arrayList.add(new ItemModel(R.drawable.lanh_dao_gian_don,"lanhdao"));
        return arrayList;
    }

}