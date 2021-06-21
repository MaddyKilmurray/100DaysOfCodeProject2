package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.calculator.R;

public class MainActivity extends AppCompatActivity {
        Button one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, multiply,
                divide, equals, clear, decimal;
        EditText duckEditText;

        float valueOne, valueTwo;

        boolean duckAddition, duckSubtract, duckMultiplication, duckDivision;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            one = findViewById(R.id.one);
            two = findViewById(R.id.two);
            three = findViewById(R.id.three);
            four = findViewById(R.id.four);
            five = findViewById(R.id.five);
            six = findViewById(R.id.six);
            seven = findViewById(R.id.seven);
            eight = findViewById(R.id.eight);
            nine = findViewById(R.id.nine);
            zero = findViewById(R.id.zero);
            plus = findViewById(R.id.plus);
            minus = findViewById(R.id.minus);
            multiply = findViewById(R.id.multiply);
            divide = findViewById(R.id.divide);
            equals = findViewById(R.id.equals);
            clear = findViewById(R.id.clear);
            decimal = findViewById(R.id.decimal);
            duckEditText = findViewById(R.id.edt1);

            one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    duckEditText.setText(duckEditText.getText().append("1"));
                }
            });

            two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    duckEditText.setText(duckEditText.getText() + "2");
                }
            });

            three.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    duckEditText.setText(duckEditText.getText() + "3");
                }
            });

            four.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    duckEditText.setText(duckEditText.getText() + "4");
                }
            });

            five.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    duckEditText.setText(duckEditText.getText() + "5");
                }
            });

            six.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    duckEditText.setText(duckEditText.getText() + "6");
                }
            });

            seven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    duckEditText.setText(duckEditText.getText() + "7");
                }
            });

            eight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    duckEditText.setText(duckEditText.getText() + "8");
                }
            });

            nine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    duckEditText.setText(duckEditText.getText() + "9");
                }
            });

            zero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    duckEditText.setText(duckEditText.getText() + "0");
                }
            });

            plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (duckEditText == null) {
                        duckEditText.setText("");
                    } else {
                        valueOne = Float.parseFloat(duckEditText.getText() + "");
                        duckAddition = true;
                        duckEditText.setText(null);
                    }
                }
            });

            minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    valueOne = Float.parseFloat(duckEditText.getText() + "");
                    duckSubtract = true;
                    duckEditText.setText(null);
                }
            });

            multiply.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    valueOne = Float.parseFloat(duckEditText.getText() + "");
                    duckMultiplication = true;
                    duckEditText.setText(null);
                }
            });

            divide.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    valueOne = Float.parseFloat(duckEditText.getText() + "");
                    duckDivision = true;
                    duckEditText.setText(null);
                }
            });

            equals.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    valueTwo = Float.parseFloat(duckEditText.getText() + "");
                    if (duckAddition) {
                        duckEditText.setText(valueOne + valueTwo + "");
                        duckAddition = false;
                    }
                    if (duckSubtract) {
                        duckEditText.setText(valueOne - valueTwo + "");
                        duckSubtract = false;
                    }
                    if (duckMultiplication) {
                        duckEditText.setText(valueOne * valueTwo +"");
                        duckMultiplication = false;
                    }
                    if (duckDivision) {
                        duckEditText.setText(valueOne / valueTwo + "");
                        duckDivision = false;
                    }
                }
            });

            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    duckEditText.setText("");
                }
            });

            decimal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    duckEditText.setText(duckEditText.getText() + ".");
                }
            });
    }
}