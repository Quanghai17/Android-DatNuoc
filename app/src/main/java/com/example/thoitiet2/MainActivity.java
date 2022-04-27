package com.example.thoitiet2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtTen, edtNhietdo;
    Button btnAdd, btnView;
    ListView listView;
    ArrayList<ThoiTiet> arrayList;
    ThoiTietAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        arrayList = new ArrayList<>();
        adapter = new ThoiTietAdapter(MainActivity.this,R.layout.item,arrayList);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Add();
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                ThoiTiet thoiTiet = arrayList.get(i);
             //   intent.putExtra("a",thoiTiet.getAnh());
                intent.putExtra("id",i);
                intent.putExtra("a",arrayList.get(i).getAnh());
                intent.putExtra("a1",thoiTiet.getTen());
                intent.putExtra("a2",thoiTiet.getKieu());
                intent.putExtra("a3",thoiTiet.getNhietdo());

                startActivity(intent);

                return false;
            }
        });
        
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show();
            }
        });

        listView.setAdapter(adapter);
    }

    private void show() {
    }

    private void Add() {
        String kieu = "";
        String name = edtTen.getText().toString();
        String nhiet = edtNhietdo.getText().toString();
        Integer t1 = Integer.valueOf(nhiet);
        if(t1 > 30){
            kieu = "Sunny";
        }
        if(t1 >= 20 && t1 < 30){
            kieu = "Rainy";
        }if(t1 < 20) {
            kieu = "Cloudy";
        }

        arrayList.add(new ThoiTiet(name,nhiet,kieu));
        adapter.notifyDataSetChanged();
        Toast.makeText(MainActivity.this,"Them ok",Toast.LENGTH_LONG).show();

    }

    private void AnhXa() {
        edtTen = findViewById(R.id.edtTen);
        edtNhietdo = findViewById(R.id.edtNhietdo);
        btnAdd = findViewById(R.id.btnAdd);
        btnView = findViewById(R.id.btnView);
        listView = findViewById(R.id.lvTT);
    }
}