package com.example.thoitiet2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ThoiTietAdapter extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<ThoiTiet> arrayList;

    public ThoiTietAdapter(Context context, int layout, ArrayList<ThoiTiet> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(layout,null);

        TextView txtName = view.findViewById(R.id.txtTen);
        TextView txtKieu = view.findViewById(R.id.txtKieu);
        TextView txtNhiet = view.findViewById(R.id.txtNhietdo);
        ImageView img = view.findViewById(R.id.img);
       // TextView txtName = view.findViewById(R.id.txtTen);
        ThoiTiet temp = arrayList.get(i);
        txtName.setText(temp.getTen());
        txtKieu.setText(temp.getKieu());
        txtNhiet.setText(temp.getNhietdo());
        String t = txtKieu.getText().toString();
        if(t.compareToIgnoreCase("Rainy") == 0){
            img.setImageResource(R.drawable.img);
        }
        if(t.compareToIgnoreCase("Sunny") == 0){
            img.setImageResource(R.drawable.img_1);
        }
        if(t.compareToIgnoreCase("Cloudy") == 0){
            img.setImageResource(R.drawable.img_2);
        }



        return view;
    }
}
