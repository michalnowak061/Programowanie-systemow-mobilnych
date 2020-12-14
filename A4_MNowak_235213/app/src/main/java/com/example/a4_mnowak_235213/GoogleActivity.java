package com.example.a4_mnowak_235213;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class GoogleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);

        final EditText searchEditText = findViewById(R.id.searchEditText);
        final Button readyButton = findViewById(R.id.readyButton);

        readyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String phrase = searchEditText.getText().toString();
                Intent intent = new Intent( Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, phrase);
                startActivity(intent);
            }
        });
    }
}