package com.example.organizationapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class RecetteEditionActivity extends AppCompatActivity {
    private static final String LOG_TAG = RecetteEditionActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG, "Page beeing created...");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edition_recette);
        Log.d(LOG_TAG, "Page created");
    }
}
