package com.example.thoitiet2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ImageView img;
    TextView txt1,txt2,txt3;

    ArrayList<ThoiTiet> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        AnhXa();
        Intent intent = getIntent();
        Integer id = intent.getIntExtra("id",1);
        Integer t1 = intent.getIntExtra("a",1);
        String t2 = intent.getStringExtra("a1");
        String t3 = intent.getStringExtra("a2");
        String t4 = intent.getStringExtra("a3");


      //  ThoiTiet temp = arrayList.get(id);

        if(t3.compareToIgnoreCase("Rainy") == 0){
            img.setImageResource(R.drawable.img);
        }
        if(t3.compareToIgnoreCase("Sunny") == 0){
            img.setImageResource(R.drawable.img_1);
        }
        if(t3.compareToIgnoreCase("Cloudy") == 0){
            img.setImageResource(R.drawable.img_2);
        }
        txt1.setText(t2);
        txt2.setText(t3);
        txt3.setText(t4);
        //img.setImageResource(t1);

    }

    private void AnhXa() {
        img = findViewById(R.id.img2);
        txt1 = findViewById(R.id.txtTen1);
        txt2 = findViewById(R.id.txtKieu1);
        txt3 = findViewById(R.id.txtNhiet1);
    }
}