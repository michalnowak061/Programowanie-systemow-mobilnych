package com.example.a4_mnowak_235213;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class GoogleMapsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_maps);

        final EditText lengthEditText = findViewById(R.id.lengthEditText);
        final EditText widthEditText = findViewById(R.id.widthEditText);
        final Button readyButton = findViewById(R.id.readyButton);

        readyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String latitude = lengthEditText.getText().toString();
                String longitude = widthEditText.getText().toString();

                Uri gmmIntentUri = Uri.parse("geo:"+latitude+","+longitude);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                startActivity(mapIntent);
            }
        });
    }
}