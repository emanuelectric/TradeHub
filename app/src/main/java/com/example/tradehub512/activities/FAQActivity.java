package com.example.tradehub512.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tradehub512.R;
import com.example.tradehub512.adaptadores.FAQ;
import com.example.tradehub512.adaptadores.MyAdapter;

import java.util.ArrayList;

public class FAQActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<FAQ> newsArrayList;
    MyAdapter myAdapter;
    String[] newsHeading;
    String [] briefNews;
    int[] imageResourceId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        newsArrayList = new ArrayList<FAQ>();

        newsHeading = new String[]{
                "¿Qué es TradeHub",
                "¿Quién diseñó TradeHub?",
                "¿Cuando fue fundado TradeHub?",
                "¿Porqué fue fundado TradeHub?",
                "¿Qué servicios ofrece la aplicación?",
                "¿Es gratis TradeHub?",
                "¿Ofrecen servicio al cliente?",
                "¿Cómo fue diseñada la aplicación?",
                "¿Cual es el objetivo del app?",
                "¿Cual es la misión de la compañía?"

        };

        briefNews = new String[]{
                getString(R.string.new1),
                getString(R.string.new2),
                getString(R.string.new3),
                getString(R.string.new4),
                getString(R.string.new5),
                getString(R.string.new6),
                getString(R.string.new7),
                getString(R.string.new8),
                getString(R.string.new9),
                getString(R.string.new10)

        };

        imageResourceId = new int[]{
                R.drawable.tradehub,
                R.drawable.tradehub,
                R.drawable.tradehub,
                R.drawable.tradehub,
                R.drawable.tradehub,
                R.drawable.tradehub,
                R.drawable.tradehub,
                R.drawable.tradehub,
                R.drawable.tradehub,
                R.drawable.tradehub

        };

        getData();

    }

    private void getData(){

        for (int i=0;i<newsHeading.length;i++){
            FAQ news = new FAQ(newsHeading[i],briefNews[i],imageResourceId[i]);
            newsArrayList.add(news);
        }

        myAdapter = new MyAdapter(this,newsArrayList);
        recyclerView.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();

    }

}