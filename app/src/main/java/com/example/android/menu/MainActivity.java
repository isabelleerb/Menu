package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        Log.i("MainActivity.java", "Mango sorbet" + "\nBlueberry pie" + "\nChocolate lava cake" );
        // Find second menu item TextView and print the text to the logs
        // Find third menu item TextView and print the text to the logs
    }
}