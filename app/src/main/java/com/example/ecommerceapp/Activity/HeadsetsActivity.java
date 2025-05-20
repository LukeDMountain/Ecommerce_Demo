package com.example.ecommerceapp.Activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerceapp.Domain.PopularDomain;
import com.example.ecommerceapp.R;

import java.util.ArrayList;

public class HeadsetsActivity extends AppCompatActivity {
    private RecyclerView recyclerViewHeadsets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_headsets); // Referência ao XML headsets.xml

        // Adicionando dados fictícios
        ArrayList<PopularDomain> items = new ArrayList<>();

        items.add(new PopularDomain("Jogo de Ação Y", "Descrição do produto", "imagem_url", 5, 4.7, 60));


        recyclerViewHeadsets = findViewById(R.id.headsetsRecyclerView);
        recyclerViewHeadsets.setLayoutManager(new LinearLayoutManager(this));

        // Aqui você deve inicializar seu adapter e associá-lo ao RecyclerView
        // recyclerViewHeadsets.setAdapter(adapter); // Exemplo de como configurar o adapter
    }
}
