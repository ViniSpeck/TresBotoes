package com.example.tresbotoes;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    public static final String EXTRA_BUTTON_ID = "com.example.tresbotoes.extra.button_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {
        int id = view.getId();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_BUTTON_ID, id);
        Log.d(TAG, "launchSecondActivity: " + id);
        startActivity(intent);
    }
}