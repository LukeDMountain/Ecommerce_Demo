package com.example.ecommerceapp.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecommerceapp.R;

public class ProfileActivity extends AppCompatActivity {

    private Button logoutButton;
    private TextView userName, userLocation, userFaculty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Referências aos elementos da interface
        userName = findViewById(R.id.userName);
        userLocation = findViewById(R.id.userLocation);
        userFaculty = findViewById(R.id.userFaculty);
        logoutButton = findViewById(R.id.logoutButton);

        // Recupera os dados salvos nas preferências
        SharedPreferences sharedPreferences = getSharedPreferences("user_data", MODE_PRIVATE);
        String nome = sharedPreferences.getString("username", "Lucas Montenegro");
        String localizacao = sharedPreferences.getString("user_location", "São Paulo, SP");
        String faculdade = sharedPreferences.getString("user_faculty", "Faculdade CCI");

        // Exibe os dados na tela
        userName.setText(nome);
        userLocation.setText(localizacao);
        userFaculty.setText(faculdade);

        // Ação do botão de logout
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Limpa os dados do usuário
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();

                // Redireciona para a tela de login
                Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // Finaliza a ProfileActivity
            }
        });
    }
}
