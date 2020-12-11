package com.example.a4_mnowak_235213;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;

public class AdditionalActivity extends AppCompatActivity {
    EditText inputEditText;
    Button okButton;
    TextView outputTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional);

        inputEditText = findViewById(R.id.inputEditText);
        okButton = findViewById(R.id.okButton);
        outputTextView = findViewById(R.id.outputTextView);

        okButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String var1 = inputEditText.getText().toString();

                Bundle myDataBundle = new Bundle();
                myDataBundle.putString("data1", var1);
                Intent intent = new Intent(AdditionalActivity.this, AdditionalActivity2.class);
                intent.putExtras(myDataBundle);
                startActivityForResult(intent, 0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        try {
            if ((requestCode == 0 ) && (resultCode == Activity.RESULT_OK)) {
                Bundle myResultBundle = data.getExtras();
                String result = myResultBundle.getString("result");
                outputTextView.setText(result);
            }
        }
        catch (Exception e) {
            outputTextView.setText("Błąd: " + requestCode + " " + resultCode);
        }
    }
}