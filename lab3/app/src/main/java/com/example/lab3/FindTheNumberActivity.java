package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class FindTheNumberActivity extends AppCompatActivity {

    public static final int MAX_NUMBER=10;
    public static final Random RANDOM = new Random();
    private TextView textView2;
    private EditText editText3;
    private Button button2;
    private int nr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_the_number);

        textView2=(TextView) findViewById(R.id.textView2);
        editText3=(EditText) findViewById(R.id.editText3);
        button2=(Button) findViewById(R.id.button2);
        newGame();
    }

    public void guessNo(View view){
        int y=Integer.parseInt(editText3.getText().toString());

        if (y==nr){
            textView2.setText("you won");
        }
        else if (y>nr){
            textView2.setText("lower, try again");
        }
        else if (y<nr){
            textView2.setText("higher, try again");
        }
    }

    private void newGame(){
        nr=RANDOM.nextInt(MAX_NUMBER)+1;
        textView2.setText("");
    }
}
