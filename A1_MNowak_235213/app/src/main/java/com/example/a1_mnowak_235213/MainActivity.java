package com.example.a1_mnowak_235213;

import androidx.annotation.NonNull;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    //private Button exitButton = (Button) findViewById(R.id.exitButton);
    private Button exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitButton = findViewById(R.id.exitButtonId);

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.i("info", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        Log.i("info", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        Log.i("info", "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        Log.i("info", "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        Log.i("info", "onDestroy");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        Toast.makeText(this, "onSaveInstanceState", Toast.LENGTH_SHORT).show();
        Log.i("info", "onSaveInstanceState");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
        Log.i("info", "onRestart");
    }
}