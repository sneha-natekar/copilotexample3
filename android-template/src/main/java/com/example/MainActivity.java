package com.example;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

// MainActivity class that extends AppCompatActivity
public class MainActivity extends AppCompatActivity {

    // Called when the activity is first created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content view to the activity_main layout
        setContentView(R.layout.activity_main);
    }
}
