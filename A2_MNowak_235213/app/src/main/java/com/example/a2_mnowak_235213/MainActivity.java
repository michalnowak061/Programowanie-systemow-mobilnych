package com.example.a2_mnowak_235213;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText orderCostEditTextNumber;
    EditText tipValueEditTextNumber;
    TextView sumOrderValue;
    TextView endTipTextView;
    Button calculateButton;
    RatingBar ratingBar;
    SeekBar seekBar;
    TextView foodRating;

    double starNumber = 0;
    double foodRatingNumber = 0;

    Double orderCost = 0.00;
    Double tipValue = 0.00;
    Double orderTip = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        orderCostEditTextNumber = findViewById(R.id.orderCostEditTextNumber);
        tipValueEditTextNumber = findViewById(R.id.tipValueEditTextNumber);
        calculateButton = findViewById(R.id.calculateButton);
        sumOrderValue = findViewById(R.id.sumOrderValueTextView);
        endTipTextView = findViewById(R.id.endTipTextView);
        ratingBar = findViewById(R.id.ratingBar);
        seekBar = findViewById(R.id.seekBar);
        foodRating = findViewById(R.id.foodRatingTextView);

        seekBar.setMax(5);
        tipValueEditTextNumber.setText("5");
        tipValue = 5.00;

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!orderCostEditTextNumber.getText().toString().isEmpty() &&
                   !tipValueEditTextNumber.getText().toString().isEmpty()) {

                    starNumber = ratingBar.getRating();
                    foodRatingNumber = seekBar.getProgress();

                    orderCost = Double.parseDouble(orderCostEditTextNumber.getText().toString());
                    tipValue = Double.parseDouble(tipValueEditTextNumber.getText().toString());
                    double tipValuePenalty = (((10-(starNumber+foodRatingNumber)) / 10) * tipValue);
                    tipValue = tipValue - tipValuePenalty;

                    orderTip = orderCost * (tipValue / 100);
                    endTipTextView.setText(orderTip.toString());
                    sumOrderValue.setText(orderCost.toString());
                }
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
                foodRating.setText(Integer.toString(progressChangedValue));
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
}