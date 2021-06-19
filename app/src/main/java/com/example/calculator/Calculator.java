package com.example.calculator;

        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.Editable;
        import android.text.TextWatcher;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class Calculator extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, multiply,
            divide, equals, clear, decimal;
    EditText duckEditText;

    float valueOne, valueTwo;

    boolean duckAddition, duckSubtract, duckMultiplication, duckDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        equals = (Button) findViewById(R.id.equals);
        clear = (Button) findViewById(R.id.clear);
        decimal = (Button) findViewById(R.id.decimal);
        duckEditText = (EditText) findViewById(R.id.edt1);

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