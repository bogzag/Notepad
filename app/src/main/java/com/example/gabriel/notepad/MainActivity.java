package com.example.gabriel.notepad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    String TAG = MainActivity.class.getSimpleName();
    Button button = findViewById(R.id.SaveButton);



// Testing git integration
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"Log, the app has started ");

    }

}

