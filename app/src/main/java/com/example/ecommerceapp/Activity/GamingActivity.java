package com.example.ecommerceapp.Activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerceapp.Adapter.PopularListAdapter;
import com.example.ecommerceapp.Domain.PopularDomain;
import com.example.ecommerceapp.R;

import java.util.ArrayList;

public class GamingActivity extends AppCompatActivity {
    private RecyclerView recyclerViewGaming;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaming); // Referência ao XML gaming.xml

        // Inicializando RecyclerView
        recyclerViewGaming = findViewById(R.id.gamingRecyclerView); // Certifique-se de que o ID corresponde ao definido no XML
        recyclerViewGaming.setLayoutManager(new LinearLayoutManager(this));

        // Adicionando dados fictícios
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("Console Gamer X", "Descrição do produto", "imagem_url", 10, 4.5, 300));
        items.add(new PopularDomain("Jogo de Ação Y", "Descrição do produto", "imagem_url", 5, 4.7, 60));

        PopularListAdapter adapter = new PopularListAdapter(items);
        recyclerViewGaming.setAdapter(adapter);
    }
}
