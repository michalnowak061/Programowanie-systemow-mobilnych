package com.example.a3_b_mnowak235213;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int calculatorState = 0;
    float firstArgument = 0;
    String operator = "";
    String operationsHistoryString = "";
    float secondArgument = 0;
    float result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.textView);
        final TextView operationsHistoryTextView = findViewById(R.id.operationsHistoryTextView);
        final Button nullButton = findViewById(R.id.nullButton);
        final Button oneButton = findViewById(R.id.oneButton);
        final Button twoButton = findViewById(R.id.twoButton);
        final Button threeButton = findViewById(R.id.threeButton);
        final Button fourButton = findViewById(R.id.fourButton);
        final Button fiveButton = findViewById(R.id.fiveButton);
        final Button sixButton = findViewById(R.id.sixButton);
        final Button sevenButton = findViewById(R.id.sevenButton);
        final Button eightButton = findViewById(R.id.eightButton);
        final Button nineButton = findViewById(R.id.nineButton);
        final Button backButton = findViewById(R.id.backButton);
        final Button clearButton = findViewById(R.id.clearButton);
        final Button plusButton = findViewById(R.id.plusButton);
        final Button minusButton = findViewById(R.id.minusButton);
        final Button divButton = findViewById(R.id.divButton);
        final Button multiButton = findViewById(R.id.multiButton);
        final Button dotButton = findViewById(R.id.dotButton);
        final Button resultButton = findViewById(R.id.resultButton);
        final Button x2Button = findViewById(R.id.x2Button);
        final Button x3Button = findViewById(R.id.x3Button);
        final Button sqrtButton = findViewById(R.id.sqrtButton);

        int screenSize = getResources().getConfiguration().screenLayout & android.content.res.Configuration.SCREENLAYOUT_SIZE_MASK;

        nullButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String actualText = textView.getText().toString();
                String newText = actualText + "0";
                textView.setText(newText);
                operationsHistoryString += 0;
                switch(calculatorState) {
                    case 0:
                        firstArgument = Float.parseFloat(newText);
                        break;
                    case 1:
                        secondArgument = Float.parseFloat(newText);
                        break;
                    case 2:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "0";
                        textView.setText(newText);
                        secondArgument = Float.parseFloat(newText);
                        calculatorState = 1;
                        break;
                    case 3:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "0";
                        textView.setText(newText);
                        firstArgument = Float.parseFloat(newText);
                        calculatorState = 1;
                        break;
                }
            }
        });
        oneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String actualText = textView.getText().toString();
                String newText = actualText + "1";
                textView.setText(newText);
                operationsHistoryString += 1;
                switch(calculatorState) {
                    case 0:
                        firstArgument = Float.parseFloat(newText);
                        break;
                    case 1:
                        secondArgument = Float.parseFloat(newText);
                        break;
                    case 2:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "1";
                        textView.setText(newText);
                        secondArgument = Float.parseFloat(newText);
                        calculatorState = 1;
                        break;
                    case 3:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "1";
                        textView.setText(newText);
                        firstArgument = Float.parseFloat(newText);
                        calculatorState = 0;
                        break;
                }
            }
        });
        twoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String actualText = textView.getText().toString();
                String newText = actualText + "2";
                textView.setText(newText);
                operationsHistoryString += 2;
                switch(calculatorState) {
                    case 0:
                        firstArgument = Float.parseFloat(newText);
                        break;
                    case 1:
                        secondArgument = Float.parseFloat(newText);
                        break;
                    case 2:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "2";
                        textView.setText(newText);
                        secondArgument = Float.parseFloat(newText);
                        calculatorState = 1;
                        break;
                    case 3:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "2";
                        textView.setText(newText);
                        firstArgument = Float.parseFloat(newText);
                        calculatorState = 0;
                        break;
                }
            }
        });
        threeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String actualText = textView.getText().toString();
                String newText = actualText + "3";
                textView.setText(newText);
                operationsHistoryString += 3;
                switch(calculatorState) {
                    case 0:
                        firstArgument = Float.parseFloat(newText);
                        break;
                    case 1:
                        secondArgument = Float.parseFloat(newText);
                        break;
                    case 2:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "3";
                        textView.setText(newText);
                        secondArgument = Float.parseFloat(newText);
                        calculatorState = 1;
                        break;
                    case 3:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "3";
                        textView.setText(newText);
                        firstArgument = Float.parseFloat(newText);
                        calculatorState = 0;
                        break;
                }
            }
        });
        fourButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String actualText = textView.getText().toString();
                String newText = actualText + "4";
                textView.setText(newText);
                operationsHistoryString += 4;
                switch(calculatorState) {
                    case 0:
                        firstArgument = Float.parseFloat(newText);
                        break;
                    case 1:
                        secondArgument = Float.parseFloat(newText);
                        break;
                    case 2:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "4";
                        textView.setText(newText);
                        secondArgument = Float.parseFloat(newText);
                        calculatorState = 1;
                        break;
                    case 3:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "4";
                        textView.setText(newText);
                        firstArgument = Float.parseFloat(newText);
                        calculatorState = 0;
                        break;
                }
            }
        });
        fiveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String actualText = textView.getText().toString();
                String newText = actualText + "5";
                textView.setText(newText);
                operationsHistoryString += 5;
                switch(calculatorState) {
                    case 0:
                        firstArgument = Float.parseFloat(newText);
                        break;
                    case 1:
                        secondArgument = Float.parseFloat(newText);
                        break;
                    case 2:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "5";
                        textView.setText(newText);
                        secondArgument = Float.parseFloat(newText);
                        calculatorState = 1;
                        break;
                    case 3:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "5";
                        textView.setText(newText);
                        firstArgument = Float.parseFloat(newText);
                        calculatorState = 0;
                        break;
                }
            }
        });
        sixButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String actualText = textView.getText().toString();
                String newText = actualText + "6";
                textView.setText(newText);
                operationsHistoryString += 6;
                switch(calculatorState) {
                    case 0:
                        firstArgument = Float.parseFloat(newText);
                        break;
                    case 1:
                        secondArgument = Float.parseFloat(newText);
                        break;
                    case 2:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "6";
                        textView.setText(newText);
                        secondArgument = Float.parseFloat(newText);
                        calculatorState = 1;
                        break;
                    case 3:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "6";
                        textView.setText(newText);
                        firstArgument = Float.parseFloat(newText);
                        calculatorState = 0;
                        break;
                }
            }
        });
        sevenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String actualText = textView.getText().toString();
                String newText = actualText + "7";
                textView.setText(newText);
                operationsHistoryString += 7;
                switch(calculatorState) {
                    case 0:
                        firstArgument = Float.parseFloat(newText);
                        break;
                    case 1:
                        secondArgument = Float.parseFloat(newText);
                        break;
                    case 2:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "7";
                        textView.setText(newText);
                        secondArgument = Float.parseFloat(newText);
                        calculatorState = 1;
                        break;
                    case 3:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "7";
                        textView.setText(newText);
                        firstArgument = Float.parseFloat(newText);
                        calculatorState = 0;
                        break;
                }
            }
        });
        eightButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String actualText = textView.getText().toString();
                String newText = actualText + "8";
                textView.setText(newText);
                operationsHistoryString += 8;
                switch(calculatorState) {
                    case 0:
                        firstArgument = Float.parseFloat(newText);
                        break;
                    case 1:
                        secondArgument = Float.parseFloat(newText);
                        break;
                    case 2:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "8";
                        textView.setText(newText);
                        secondArgument = Float.parseFloat(newText);
                        calculatorState = 1;
                        break;
                    case 3:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "8";
                        textView.setText(newText);
                        firstArgument = Float.parseFloat(newText);
                        calculatorState = 0;
                        break;
                }
            }
        });
        nineButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String actualText = textView.getText().toString();
                String newText = actualText + "9";
                textView.setText(newText);
                operationsHistoryString += 9;
                switch(calculatorState) {
                    case 0:
                        firstArgument = Float.parseFloat(newText);
                        break;
                    case 1:
                        secondArgument = Float.parseFloat(newText);
                        break;
                    case 2:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "9";
                        textView.setText(newText);
                        secondArgument = Float.parseFloat(newText);
                        calculatorState = 1;
                        break;
                    case 3:
                        textView.setText("");
                        actualText = textView.getText().toString();
                        newText = actualText + "9";
                        textView.setText(newText);
                        firstArgument = Float.parseFloat(newText);
                        calculatorState = 0;
                        break;
                }
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String actualText = textView.getText().toString();
                textView.setText( removeLastCharacter(actualText) );
            }
        });
        clearButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText("");
                calculatorState = 0;
            }
        });
        plusButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(calculatorState == 0 || calculatorState == 2 || calculatorState == 3) {
                    operator = "+";
                    calculatorState = 2;
                }
                else if(calculatorState == 1) {
                    //String actualText = textView.getText().toString();
                    firstArgument = getResult(firstArgument, secondArgument, operator);
                    textView.setText(Float.toString(firstArgument));
                    calculatorState = 2;
                    operator = "+";
                }
                operationsHistoryString += "+";
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(calculatorState == 0 || calculatorState == 2 || calculatorState == 3) {
                    operator = "-";
                    calculatorState = 2;
                }
                else if(calculatorState == 1) {
                    String actualText = textView.getText().toString();
                    firstArgument = getResult(firstArgument, secondArgument, operator);
                    textView.setText(Float.toString(firstArgument));
                    calculatorState = 2;
                    operator = "-";
                }
                operationsHistoryString += "-";
            }
        });
        divButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(calculatorState == 0 || calculatorState == 2 || calculatorState == 3) {
                    operator = "/";
                    calculatorState = 2;
                }
                else if(calculatorState == 1) {
                    String actualText = textView.getText().toString();
                    firstArgument = getResult(firstArgument, secondArgument, operator);
                    textView.setText(Float.toString(firstArgument));
                    calculatorState = 2;
                    operator = "/";
                }
                operationsHistoryString += "/";
            }
        });
        multiButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(calculatorState == 0 || calculatorState == 2 || calculatorState == 3) {
                    operator = "*";
                    calculatorState = 2;
                }
                else if(calculatorState == 1) {
                    String actualText = textView.getText().toString();
                    firstArgument = getResult(firstArgument, secondArgument, operator);
                    textView.setText(Float.toString(firstArgument));
                    calculatorState = 2;
                    operator = "*";
                }
                operationsHistoryString += "*";
            }
        });
        dotButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String actualText = textView.getText().toString();
                String newText = actualText + ".";
                textView.setText(newText);
                operationsHistoryString += newText;
            }
        });
        resultButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(calculatorState == 1) {
                    result = getResult(firstArgument, secondArgument, operator);
                    textView.setText(Float.toString(result));
                    int orientation = getResources().getConfiguration().orientation;
                    operationsHistoryString += "=" + Float.toString(result) + "\n";
                    if (orientation == android.content.res.Configuration.ORIENTATION_LANDSCAPE) {
                        operationsHistoryTextView.setText(operationsHistoryString);
                    }
                    firstArgument = result;
                    calculatorState = 3;
                }
            }
        });
        if(screenSize == Configuration.SCREENLAYOUT_SIZE_XLARGE) {
            x2Button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String actualText = textView.getText().toString();
                    if(actualText.isEmpty() == true) return;
                    float actualValue = Float.parseFloat(actualText);
                    if(Float.isNaN(actualValue) == false) {
                        operator = "^2";
                        result = getResult(actualValue, actualValue, operator);
                        textView.setText(Float.toString(result));
                        operationsHistoryString += "^2";
                    }
                }
            });
            x3Button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String actualText = textView.getText().toString();
                    if(actualText.isEmpty() == true) return;
                    float actualValue = Float.parseFloat(actualText);
                    if(Float.isNaN(actualValue) == false && actualText.isEmpty() == false) {
                        operator = "^3";
                        result = getResult(actualValue, actualValue, operator);
                        textView.setText(Float.toString(result));
                        operationsHistoryString += "^3";
                    }
                }
            });
            sqrtButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String actualText = textView.getText().toString();
                    if(actualText.isEmpty() == true) return;
                    float actualValue = Float.parseFloat(actualText);
                    if(Float.isNaN(actualValue) == false && actualText.isEmpty() == false) {
                        operator = "sqrt";
                        result = getResult(actualValue, actualValue, operator);
                        textView.setText(Float.toString(result));
                        operationsHistoryString += "sqrt";
                    }
                }
            });
        }
    }

    public static float getResult(float firstArgument, float secondArgument, @org.jetbrains.annotations.NotNull String operator) {
        float result = 0;
        if(operator.equals("+")) {
            result = firstArgument + secondArgument;
        }
        else if(operator.equals("-")) {
            result = firstArgument - secondArgument;
        }
        else if(operator.equals("/")) {
            result = firstArgument / secondArgument;
        }
        else if(operator.equals("*")) {
            result = firstArgument * secondArgument;
        }
        else if(operator.equals("^2")) {
            result = firstArgument * firstArgument;
        }
        else if(operator.equals("^3")) {
            result = firstArgument * firstArgument * firstArgument;
        }
        else if(operator.equals("sqrt")) {
            result =  (float)Math.sqrt((double)firstArgument);
        }
        return result;
    }
    public static String removeLastCharacter(String str) {
        String result = null;
        if ((str != null) && (str.length() > 0)) {
            result = str.substring(0, str.length() - 1);
        }
        return result;
    }
}