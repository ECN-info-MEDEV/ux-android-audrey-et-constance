package com.example.organizationapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final int TEXT_REQUEST = 1;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectQuiche(View view) {
        Log.d(LOG_TAG, "Quiche selected");
        Intent intent = new Intent(this, RecetteLectureActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    public void createNewRecette(View view) {
        Log.d(LOG_TAG, "Plus selected");
        Intent intent = new Intent(this, RecetteEditionActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }
}