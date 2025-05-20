package com.example.ecommerceapp.Activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ecommerceapp.R;

public class PhoneActivity extends AppCompatActivity {
    private RecyclerView recyclerViewPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone); // Referência ao XML phone.xml

        recyclerViewPhone = findViewById(R.id.phoneRecyclerView);
        recyclerViewPhone.setLayoutManager(new LinearLayoutManager(this));

        // Aqui você deve inicializar seu adapter e associá-lo ao RecyclerView
        // recyclerViewPhone.setAdapter(adapter); // Exemplo de como configurar o adapter
    }
}
