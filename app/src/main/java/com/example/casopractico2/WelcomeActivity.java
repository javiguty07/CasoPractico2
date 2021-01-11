package com.example.casopractico2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    TextView textWelcome;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        getSupportActionBar().hide();

        textWelcome = findViewById(R.id.textViewWelcome);

        Bundle arg = getIntent().getExtras();
        name = arg.getString("name");

        textWelcome.setText("Hola "+ name);
    }
}