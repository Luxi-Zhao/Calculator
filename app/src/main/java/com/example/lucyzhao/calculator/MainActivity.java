package com.example.lucyzhao.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
Calculator features:
- has addition, subtraction, multiplication, division, and percent operators
- accepts only two operands in each calculation
- the result will only be shown on the screen after "=" is clicked
*/

public class MainActivity extends AppCompatActivity {

    TextView screen;
    Button plus;
    Button minus;
    Button multiplication;
    Button division;
    Button percent;
    float screenNum1;
    float screenNum2;
    //if clicked on +, this variable is 1, if clicked on -, this variable is 0, if not clicked, this variable is 2
    //if clicked on *, this variable is 3, if clicked on /, this variable is 4, if clicked on %, this variable is 5
    float operatorTextFlag = 2;
    float operatorUsed = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        screen = (TextView) findViewById(R.id.screen);

        Button num1 = (Button) findViewById(R.id.num1);
        Button num2 = (Button) findViewById(R.id.num2);
        Button num3 = (Button) findViewById(R.id.num3);
        Button num4 = (Button) findViewById(R.id.num4);
        Button num5 = (Button) findViewById(R.id.num5);
        Button num6 = (Button) findViewById(R.id.num6);
        Button num7 = (Button) findViewById(R.id.num7);
        Button num8 = (Button) findViewById(R.id.num8);
        Button num9 = (Button) findViewById(R.id.num9);
        Button num0 = (Button) findViewById(R.id.num0);
        Button clear =(Button) findViewById(R.id.C);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiplication = (Button) findViewById(R.id.multiplication);
        division = (Button) findViewById(R.id.division);
        percent = (Button) findViewById(R.id.percent);
        Button equals = (Button) findViewById(R.id.equals);


        //when click on a button, read the number on the screen
        //time it by 10, and add the number clicked
        num1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float outputNum;
                float screenNum = Float.parseFloat(screen.getText().toString());
                if( operatorUsed == 0 ) {
                    outputNum = screenNum * 10 + 1;
                }
                else{
                    outputNum = 1;
                    operatorUsed = 0;
                }
                screen.setText(Float.toString(outputNum));
            }
        });
        num2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float outputNum;
                float screenNum = Float.parseFloat(screen.getText().toString());
                if( operatorUsed == 0 ) {
                    outputNum = screenNum * 10 +2;
                }
                else{
                    outputNum = 2;
                    operatorUsed = 0;
                }
                screen.setText(Float.toString(outputNum));
            }
        });
        num3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float outputNum;
                float screenNum = Float.parseFloat(screen.getText().toString());
                if( operatorUsed == 0 ) {
                    outputNum = screenNum * 10 + 3;
                }
                else{
                    outputNum = 3;
                    operatorUsed = 0;
                }
                screen.setText(Float.toString(outputNum));
            }
        });
        num4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float outputNum;
                float screenNum = Float.parseFloat(screen.getText().toString());
                if( operatorUsed == 0 ) {
                    outputNum = screenNum * 10 + 4;
                }
                else{
                    outputNum = 4;
                    operatorUsed = 0;
                }
                screen.setText(Float.toString(outputNum));
            }
        });
        num5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float outputNum;
                float screenNum = Float.parseFloat(screen.getText().toString());
                if( operatorUsed == 0 ) {
                    outputNum = screenNum * 10 + 5;
                }
                else{
                    outputNum = 5;
                    operatorUsed = 0;
                }
                screen.setText(Float.toString(outputNum));
            }
        });
        num6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float outputNum;
                float screenNum = Float.parseFloat(screen.getText().toString());
                if( operatorUsed == 0 ) {
                    outputNum = screenNum * 10 + 6;
                }
                else{
                    outputNum = 6;
                    operatorUsed = 0;
                }
                screen.setText(Float.toString(outputNum));
            }
        });
        num7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float outputNum;
                float screenNum = Float.parseFloat(screen.getText().toString());
                if( operatorUsed == 0 ) {
                    outputNum = screenNum * 10 + 7;
                }
                else{
                    outputNum = 7;
                    operatorUsed = 0;
                }
                screen.setText(Float.toString(outputNum));
            }
        });
        num8.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float outputNum;
                float screenNum = Float.parseFloat(screen.getText().toString());
                if( operatorUsed == 0 ) {
                    outputNum = screenNum * 10 + 8;
                }
                else{
                    outputNum = 8;
                    operatorUsed = 0;
                }
                screen.setText(Float.toString(outputNum));
            }
        });
        num9.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float outputNum;
                float screenNum = Float.parseFloat(screen.getText().toString());
                if( operatorUsed == 0 ) {
                    outputNum = screenNum * 10 + 9;
                }
                else{
                    outputNum = 9;
                    operatorUsed = 0;
                }
                screen.setText(Float.toString(outputNum));
            }
        });
        num0.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float outputNum;
                float screenNum = Float.parseFloat(screen.getText().toString());
                if( operatorUsed == 0 ) {
                    outputNum = screenNum * 10 + 0;
                }
                else{
                    outputNum = 0;
                    operatorUsed = 0;
                }
                screen.setText(Float.toString(outputNum));
            }
        });

        clear.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText("0.0");
            }
        });

        plus.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screenNum1 = Float.parseFloat(screen.getText().toString());
                plus.setTextSize(40);
                plus.setEnabled(false);
                operatorTextFlag = 1;
                operatorUsed = 1;
            }
        });
        minus.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screenNum1 = Float.parseFloat(screen.getText().toString());
                minus.setTextSize(40);
                minus.setEnabled(false);
                operatorTextFlag = 0;
                operatorUsed = 1;
            }
        });
        multiplication.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screenNum1 = Float.parseFloat(screen.getText().toString());
                multiplication.setTextSize(30);
                multiplication.setEnabled(false);
                operatorTextFlag = 3;
                operatorUsed = 1;
            }
        });
        division.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screenNum1 = Float.parseFloat(screen.getText().toString());
                division.setTextSize(40);
                division.setEnabled(false);
                operatorTextFlag = 4;
                operatorUsed = 1;
            }
        });
        percent.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screenNum1 = Float.parseFloat(screen.getText().toString());
                percent.setTextSize(40);
                percent.setEnabled(false);
                operatorTextFlag = 5;
                operatorUsed = 1;
            }
        });

        equals.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float outputNum;
                screenNum2 = Float.parseFloat(screen.getText().toString());
                if( operatorTextFlag == 1){
                    outputNum = screenNum1 + screenNum2;
                    plus.setTextSize(25);
                    plus.setEnabled(true);
                    screen.setText(Float.toString(outputNum));
                }
                else if( operatorTextFlag == 0) {
                    outputNum = screenNum1 - screenNum2;
                    minus.setTextSize(25);
                    minus.setEnabled(true);
                    screen.setText(Float.toString(outputNum));
                }
                else if( operatorTextFlag == 3) {
                    outputNum = screenNum1 * screenNum2;
                    multiplication.setTextSize(18);
                    multiplication.setEnabled(true);
                    screen.setText(Float.toString(outputNum));
                }
                else if( operatorTextFlag == 4) {
                    outputNum = screenNum1 / screenNum2;
                    division.setTextSize(25);
                    division.setEnabled(true);
                    screen.setText(Float.toString(outputNum));
                }
                else if( operatorTextFlag == 5) {
                    outputNum = screenNum2 /100;
                    percent.setTextSize(25);
                    percent.setEnabled(true);
                    screen.setText(Float.toString(outputNum));
                }
                else{
                    screen.setText(Float.toString(screenNum2));
                }


            }
        });
    }
}
