package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    MySharedPreference mySharedPreference2;
    TextView textView2;
    String nom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView2 = findViewById(R.id.textView2);
        mySharedPreference2 = new MySharedPreference(this);
        String sortie= mySharedPreference2.getValue();
        textView2.setText(sortie);

        Intent i = getIntent();
        String sortieIntent = i.getStringExtra("nom");
        Toast.makeText(this, sortieIntent, Toast.LENGTH_SHORT).show();

    }
}
