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
        items.add(new PopularDomain("Logitech G Pro X", "Design leve com iluminação RGB.", "logitech_g_pro", 17, 4.3, 519));
        items.add(new PopularDomain("HyperX Cloud II", "Design leve com iluminação RGB.", "hyperx_cloud", 186, 4.8, 179));
        items.add(new PopularDomain("Logitech G733", "Design leve com iluminação RGB.", "logitech_g733", 18, 4.6, 119));
        items.add(new PopularDomain("Razer BlackShark V2", "Áudio nítido e cancelamento de ruído.", "razer_blackshark_v2", 22, 4.5, 135));
        items.add(new PopularDomain("Corsair HS80 RGB", "Som surround e conforto premium.", "corsair_hs80_rgb", 15, 4.4, 149));
        items.add(new PopularDomain("SteelSeries Arctis 7", "Wireless com ótima autonomia.", "steelseries_arctis_7", 30, 4.8, 159));
        items.add(new PopularDomain("Astro A50", "Som Dolby e base de carregamento.", "astro_a50", 12, 4.6, 299));

        // Cria o adapter com os dados
        PopularListAdapter adapter = new PopularListAdapter(items);

        // Associa o adapter ao RecyclerView
        recyclerViewHeadsets.setAdapter(adapter);
    }
}
