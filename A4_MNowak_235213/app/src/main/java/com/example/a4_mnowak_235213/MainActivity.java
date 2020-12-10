package com.example.a4_mnowak_235213;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button contactsListButton = findViewById(R.id.contactsListButton);
        final Button smsMessageButton = findViewById(R.id.smsMessageButton);
        final Button googleMapsButton = findViewById(R.id.googleMapsButton);
        final Button additionalActivityButton = findViewById(R.id.additionalActivityButton);

        contactsListButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String myData = "content://contacts/people/";
                Intent myActivity2 = new Intent(Intent.ACTION_VIEW, Uri.parse(myData));
                startActivity(myActivity2);
            }
        });

        smsMessageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openSmsMessageActivity();
            }
        });
    }

    public void openSmsMessageActivity() {
        Intent intent = new Intent(this, SmsMessageActivity.class);
        startActivity(intent);
    }
}