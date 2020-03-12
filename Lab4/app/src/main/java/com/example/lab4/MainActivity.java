package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    EditText editText2;

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button = (Button) findViewById(R.id.button);

    }

    public void login (View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);

        String username=editText.getText().toString();
        String password=editText2.getText().toString();

        if(username.equals("student") && password.equals("student")){
            openActivity();
        }

    }

    public void openActivity(){
        Intent intent = new Intent (this, XandO.class);
        startActivity(intent);
    }
}
