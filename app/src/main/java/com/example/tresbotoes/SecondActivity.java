package com.example.tresbotoes;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    public static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        int id = intent.getIntExtra(MainActivity.EXTRA_BUTTON_ID, R.id.texto_um);
        String text="";
        switch(id){
            case R.id.texto_um:
                text = "Texto um pressionado!";
                break;
            case R.id.texto_dois:
                text = "Texto dois pressionado!";
                break;
            case R.id.texto_tres:
                text = "Texto três pressionado!";
                break;
            default:
                text = "Erro!";
                break;
        }

        TextView textView = findViewById(R.id.text_display);
        textView.setText(text);

        Log.d(TAG, "onCreate: Recebido id: " + id);
    }
}