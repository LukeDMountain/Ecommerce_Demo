// Verifique se há uma única classe definida:
package com.example.ecommerceapp.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ecommerceapp.R;
import com.example.ecommerceapp.UserStorage;

public class RegisterActivity extends AppCompatActivity {

    private EditText edtUsername, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtUsername = findViewById(R.id.edtNewUsername);
        edtPassword = findViewById(R.id.edtNewPassword);
        Button btnRegister = findViewById(R.id.btnConfirmRegister);

        btnRegister.setOnClickListener(v -> {
            String username = edtUsername.getText().toString();
            String password = edtPassword.getText().toString();

            // Verificar se os campos estão preenchidos
            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(RegisterActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            } else if (UserStorage.userExists(username)) {
                Toast.makeText(RegisterActivity.this, "Usuário já existe!", Toast.LENGTH_SHORT).show();
            } else {
                UserStorage.addUser(username, password);
                Toast.makeText(RegisterActivity.this, "Usuário registrado!", Toast.LENGTH_SHORT).show();
                finish(); // Retorna para LoginActivity
            }
        });
    }
}
