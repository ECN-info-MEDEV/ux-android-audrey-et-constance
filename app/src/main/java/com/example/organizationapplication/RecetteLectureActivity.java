package com.example.organizationapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecetteLectureActivity extends AppCompatActivity {
    private static final String LOG_TAG = RecetteLectureActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG, "Page beeing created...");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture_recette);
        Log.d(LOG_TAG, "Page created");
    }
}
