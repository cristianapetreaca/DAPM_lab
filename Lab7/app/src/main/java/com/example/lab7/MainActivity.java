package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button SpeechText;
    Button TextSpeech;
    TextToSpeech text;
    TextView convert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convert=findViewById(R.id.TextView);
        SpeechText=findViewById(R.id.button1);
        SpeechText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display();
            }
        });
        text=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    text.setLanguage(Locale.UK);
                }
            }
        });
        TextSpeech=findViewById(R.id.button);
        TextSpeech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }
        });
    }
    private static final int REQ_CODE_SPEECH_INPUT = 100;

    // Create an intent that can start the Speech Recognizer activity
    private void display() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
// Start the activity, the intent will be populated with the speech text
        startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);
    }

    // This callback is invoked when the Speech Recognizer returns.
// This is where you process the intent and extract the speech text from the intent.
    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        if (requestCode == REQ_CODE_SPEECH_INPUT && resultCode == RESULT_OK) {
            List<String> results = data.getStringArrayListExtra(
                    RecognizerIntent.EXTRA_RESULTS);
            String spokenText = results.get(0);
            // Do something with spokenText
            convert.setText(spokenText);

        }
        super.onActivityResult(requestCode, resultCode, data);
    }
    protected void speak(){
        String Speak;
        if(convert.getText()!=" "){
            Speak=convert.getText().toString();
        }
        else
            Speak = "Lab 7 is awesome because it is our las lab!";
        Toast.makeText(getApplicationContext(), Speak,Toast.LENGTH_SHORT).show();
        text.speak(Speak, TextToSpeech.QUEUE_FLUSH, null);
    }



}