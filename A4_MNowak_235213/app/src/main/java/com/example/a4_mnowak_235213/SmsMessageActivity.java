package com.example.a4_mnowak_235213;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SmsMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_message);

        final EditText phoneNumberEditText = findViewById(R.id.phoneNumberEditText);
        final EditText messageEditText = findViewById(R.id.messageEditText);
        final Button doneButton = findViewById(R.id.doneButton);

        doneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String telNumber = phoneNumberEditText.getText().toString();
                String message = messageEditText.getText().toString();

                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + telNumber));
                intent.putExtra("sms_body", message);
                startActivity(intent);
            }
        });
    }
}