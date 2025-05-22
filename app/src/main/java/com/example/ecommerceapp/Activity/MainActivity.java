package com.example.ecommerceapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ecommerceapp.Adapter.PopularListAdapter;
import com.example.ecommerceapp.Domain.PopularDomain;
import com.example.ecommerceapp.R;

import java.util.ArrayList;

public class  MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPopular;
    private RecyclerView recyclerViewPopular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Exibe o nome salvo no topo
        TextView textViewUser = findViewById(R.id.textView2);
        SharedPreferences sharedPreferences = getSharedPreferences("user_data", MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "Usuário");
        textViewUser.setText(username);

        initRecyclerView();
        bottomNavigation();
    }

    private void bottomNavigation() {
        LinearLayout homeBtn = findViewById(R.id.inicio);
        LinearLayout carrinhoBT = findViewById(R.id.carrinhoBT);
        LinearLayout PerfilBT = findViewById(R.id.PerfilBT);
        Button btnPC = findViewById(R.id.btnPC);
        Button btnPhone = findViewById(R.id.btnPhone);
        Button btnHeadsets = findViewById(R.id.btnHeadsets);
        Button btnGaming = findViewById(R.id.btnGaming);

        homeBtn.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, MainActivity.class)));

        carrinhoBT.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, CartActivity.class)));

        PerfilBT.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ProfileActivity.class)));

        btnPhone.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, PhoneActivity.class)));

        btnPC.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, PhoneActivity.class)));

        btnHeadsets.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, HeadsetsActivity.class)));

        btnGaming.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, GamingActivity.class)));
    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items = new ArrayList<>();

        // Gaming
        items.add(new PopularDomain("MacBook Pro 13 M2 Chip", "Descrição", "pic1", 15, 4, 500));
        items.add(new PopularDomain("PS 5 Digital", "nada", "pic2", 10, 4.5, 450));
        items.add(new PopularDomain("Xbox Series X", "Game Pass incluso.", "xbox_series_x.png", 12, 4.8, 499));
        items.add(new PopularDomain("Nintendo Switch OLED", "Tela OLED vibrante.", "nintendo.png", 15, 4.7, 349));
        items.add(new PopularDomain("Controle DualSense PS5", "Resposta tátil.", "controle_ps5.png", 25, 4.8, 70));
        items.add(new PopularDomain("Controle Xbox Elite", "Altamente personalizável.", "controle_xbox_elite.png", 10, 4.9, 180));
        items.add(new PopularDomain("Steam Deck", "Console portátil.", "steam_deck.png", 8, 4.7, 399));
        items.add(new PopularDomain("Meta Quest 3 VR", "Realidade virtual sem fios.", "meta_quest.png", 6, 4.6, 499));

        // Telefones
        items.add(new PopularDomain("iPhone 14", "Ótima performance.", "iphone_15_pro.png", 13, 4.2, 800));
        items.add(new PopularDomain("Samsung Galaxy S23 Ultra", "Câmera de 200MP.", "galaxy_s24_ultra.png", 15, 4.9, 1299));

        // Headsets
        items.add(new PopularDomain("Logitech G Pro X", "Microfone removível.", "logitech_g_pro", 20, 4.8, 130));
        items.add(new PopularDomain("HyperX Cloud II", "Conforto e áudio top.", "hyperx_cloud.png", 25, 4.7, 100));

        // PCs
        items.add(new PopularDomain("Alienware Aurora R15", "RTX 4090 e Intel i9.", "alienware_aurora.png", 5, 4.9, 3500));
        items.add(new PopularDomain("MSI Raider GE78 HX", "RTX 4080 + 240Hz.", "msi_raider.png", 7, 4.8, 2800));

        recyclerViewPopular = findViewById(R.id.view1);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        adapterPopular = new PopularListAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);
    }
}
