package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    MySharedPreference mySharedPreference;
    EditText editText;
    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySharedPreference = new MySharedPreference(MainActivity.this);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                String preference = editText.getText().toString();
                mySharedPreference.save(preference);
            }
        });
    }

        public void voirAct2(View view){
        Intent intent = new Intent (this, SecondActivity.class);
        intent.putExtra("nom", "Passage vers la deuxieme activite");
        startActivity(intent);
        }
}
