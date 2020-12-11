package com.example.a4_mnowak_235213;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;

public class AdditionalActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional2);

        final TextView inputTextView = findViewById(R.id.inputTextView);
        final Button returnButton = findViewById(R.id.returnButton);
        final TextView resultTextView = findViewById(R.id.resultTextView);

        Intent myLocalIntent = getIntent();
        Bundle myBundle = myLocalIntent.getExtras();
        String var1 = myBundle.getString("data1");
        String result = var1;

        inputTextView.setText(var1);
        resultTextView.setText(result);

        myBundle.putString("result", result);
        myLocalIntent.putExtras(myBundle);
        setResult(Activity.RESULT_OK, myLocalIntent);

        returnButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finishActivity(Activity.RESULT_OK);
            }
        });
    }
}