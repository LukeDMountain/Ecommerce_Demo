package com.example.ecommerceapp.Activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerceapp.Adapter.PopularListAdapter;
import com.example.ecommerceapp.Domain.PopularDomain;
import com.example.ecommerceapp.R;

import java.util.ArrayList;

public class HeadsetsActivity extends AppCompatActivity {
    private RecyclerView recyclerViewHeadsets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_headsets);

        recyclerViewHeadsets = findViewById(R.id.headsetsRecyclerView);
        recyclerViewHeadsets.setLayoutManager(new LinearLayoutManager(this));

        // Cria a lista de headsets
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("Logitech G Pro X", "Microfone removível.", "headset-logitech.png", 4.6, "$179.0", "4", 12));
        items.add(new PopularDomain("HyperX Cloud II", "Conforto e áudio top.", "pic9", 4.8, "$149.0", "6", 19));

        // Cria o adapter com os dados
        PopularListAdapter adapter = new PopularListAdapter(items);

        // Associa o adapter ao RecyclerView
        recyclerViewHeadsets.setAdapter(adapter);
    }
}
