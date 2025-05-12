package com.example.ecommerceapp.Activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ecommerceapp.R;

public class HeadsetsActivity extends AppCompatActivity {
    private RecyclerView recyclerViewHeadsets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_headsets); // Referência ao XML headsets.xml

        recyclerViewHeadsets = findViewById(R.id.headsetsRecyclerView);
        recyclerViewHeadsets.setLayoutManager(new LinearLayoutManager(this));

        // Aqui você deve inicializar seu adapter e associá-lo ao RecyclerView
        // recyclerViewHeadsets.setAdapter(adapter); // Exemplo de como configurar o adapter
    }
}
