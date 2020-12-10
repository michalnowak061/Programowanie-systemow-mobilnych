package com.example.a3_a_mnowak_235213;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    Button colorButton;
    Button fontSizeButton;
    Button backgroundColorButton;
    EditText editText;
    ConstraintLayout constraintLayout;

    int colorState = 0;
    int backgroundColorState = 0;
    float fontSize = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorButton = findViewById(R.id.colorButton);
        fontSizeButton = findViewById(R.id.fontSizeButton);
        backgroundColorButton = findViewById(R.id.backgroundColorButton);
        editText = findViewById(R.id.editText);
        constraintLayout = findViewById(R.id.constraintLayout);

        editText.setTextColor(Color.parseColor("#000000"));
        colorButton.setText("Kolor tekstu: czarny");

        editText.setTextSize(fontSize);
        fontSizeButton.setText("Rozmiar czcionki: " + Float.toString(fontSize));

        constraintLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));

        colorButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                colorState += 1;
                if(colorState > 3) {
                    colorState = 0;
                }

                switch(colorState) {
                    case 0:
                        editText.setTextColor(Color.parseColor("#000000"));
                        colorButton.setText("Kolor tekstu: czarny");
                        break;
                    case 1:
                        editText.setTextColor(Color.parseColor("#FF0000"));
                        colorButton.setText("Kolor tekstu: czerwony");
                        break;
                    case 2:
                        editText.setTextColor(Color.parseColor("#00FF00"));
                        colorButton.setText("Kolor tekstu: zielony");
                        break;
                    case 3:
                        editText.setTextColor(Color.parseColor("#0000FF"));
                        colorButton.setText("Kolor tekstu: niebieski");
                        break;
                }
            }
        });

        backgroundColorButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                backgroundColorState += 1;
                if(backgroundColorState > 3) {
                    backgroundColorState = 0;
                }

                switch(backgroundColorState) {
                    case 0:
                        constraintLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        backgroundColorButton.setText("Kolor tła: biały");
                        break;
                    case 1:
                        constraintLayout.setBackgroundColor(Color.parseColor("#FF0000"));
                        backgroundColorButton.setText("Kolor tła: czerwony");
                        break;
                    case 2:
                        constraintLayout.setBackgroundColor(Color.parseColor("#00FF00"));
                        backgroundColorButton.setText("Kolor tła: zielony");
                        break;
                    case 3:
                        constraintLayout.setBackgroundColor(Color.parseColor("#0000FF"));
                        backgroundColorButton.setText("Kolor tła: niebieski");
                        break;
                }
            }
        });

        fontSizeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fontSize += 1;
                if(fontSize > 70) {
                    fontSize = 10;
                }
                editText.setTextSize(fontSize);
                fontSizeButton.setText("Rozmiar czcionki: " + Float.toString(fontSize));
            }
        });
    }
}