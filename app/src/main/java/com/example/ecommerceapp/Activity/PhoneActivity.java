package com.example.ecommerceapp.Activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerceapp.Domain.PopularDomain;
import com.example.ecommerceapp.R;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class PhoneActivity extends AppCompatActivity {
    private RecyclerView recyclerViewPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone); // Referência ao XML phone.xml

        recyclerViewPhone = findViewById(R.id.phoneRecyclerView);
        recyclerViewPhone.setLayoutManager(new LinearLayoutManager(this));


            ArrayList<PopularDomain> items = new ArrayList<>();

            // phone
        items.add(new PopularDomain("iPhone 15 Pro", "Chip A17 Pro e câmera avançada.", "iphone_15_pro.png", 12, 4.8, 999));
        items.add(new PopularDomain("Samsung Galaxy S24 Ultra", "Câmera de 200MP e S Pen.", "galaxy_s24_ultra.png", 10, 4.7, 1199));
        items.add(new PopularDomain("Xiaomi 14", "Snapdragon 8 Gen 3 e tela AMOLED.", "xiaomi_14.png", 15, 4.6, 699));
        items.add(new PopularDomain("Motorola Edge 40 Neo", "Resistente à água e carregamento rápido.", "motorola_edge_40_neo.png", 18, 4.5, 399));
        items.add(new PopularDomain("ASUS ROG Phone 7", "Celular gamer com performance extrema.", "rog_phone_7.png", 8, 4.9, 1099));


        // Aqui você deve inicializar seu adapter e associá-lo ao RecyclerView
        // recyclerViewPhone.setAdapter(adapter); // Exemplo de como configurar o adapter
    }
}
