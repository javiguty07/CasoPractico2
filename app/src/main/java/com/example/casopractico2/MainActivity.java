package com.example.casopractico2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextInputLayout txtName;
    Button btnSaludar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        findViews();

        btnSaludar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String name = txtName.getEditText().getText().toString();
                if (name.isEmpty()) {
                    txtName.setError("Debes introducir un nombre");
                } else {
                    txtName.setErrorEnabled(false);
                    Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                }

            }
        });
    }

    private void findViews() {
        txtName = findViewById(R.id.textNombre);
        btnSaludar = findViewById(R.id.buttonSaludar);
    }
}