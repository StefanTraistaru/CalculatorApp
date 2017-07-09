package com.example.stefan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int number1;
    int number2;
    int stage = 1, operation = 0;
    boolean twoNumbers = false;
    private TextView firstNumber;
    private TextView secondNumber;

    private Button num7;
    private Button num8;
    private Button num9;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num0;
    private Button delete;
    private Button division;
    private Button subtraction;
    private Button multiplication;
    private Button equal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = (TextView) findViewById(R.id.firstNumber);
        secondNumber = (TextView) findViewById(R.id.secondNumber);
        num7 = (Button) findViewById(R.id.number7);
        num8 = (Button) findViewById(R.id.number8);
        num9 = (Button) findViewById(R.id.number9);
        num4 = (Button) findViewById(R.id.number4);
        num5 = (Button) findViewById(R.id.number5);
        num6 = (Button) findViewById(R.id.number6);
        num1 = (Button) findViewById(R.id.number1);
        num2 = (Button) findViewById(R.id.number2);
        num3 = (Button) findViewById(R.id.number3);
        num0 = (Button) findViewById(R.id.number0);
        delete = (Button) findViewById(R.id.delete);
        division = (Button) findViewById(R.id.division);
        subtraction = (Button) findViewById(R.id.subtraction);
        multiplication = (Button) findViewById(R.id.multiplication);
        equal = (Button) findViewById(R.id.equal);
    }

    public void pressSeven(View view) {
        switch(stage) {
            case 1:
                firstNumber.setText(firstNumber.getText().toString() + "7");
                break;
            case 2:
                secondNumber.setText(secondNumber.getText().toString() + "7");
                twoNumbers = true;
                break;
        }
    }

    public void pressEight(View view) {
        switch(stage) {
            case 1:
                firstNumber.setText(firstNumber.getText().toString() + "8");
                break;
            case 2:
                secondNumber.setText(secondNumber.getText().toString() + "8");
                twoNumbers = true;
                break;
        }
    }

    public void pressNine(View view) {
        switch(stage) {
            case 1:
                firstNumber.setText(firstNumber.getText().toString() + "9");
                break;
            case 2:
                secondNumber.setText(secondNumber.getText().toString() + "9");
                twoNumbers = true;
                break;
        }
    }

    public void pressFour(View view) {
        switch(stage) {
            case 1:
                firstNumber.setText(firstNumber.getText().toString() + "4");
                break;
            case 2:
                secondNumber.setText(secondNumber.getText().toString() + "4");
                twoNumbers = true;
                break;
        }
    }

    public void pressFive(View view) {
        switch(stage) {
            case 1:
                firstNumber.setText(firstNumber.getText().toString() + "5");
                break;
            case 2:
                secondNumber.setText(secondNumber.getText().toString() + "5");
                twoNumbers = true;
                break;
        }
    }

    public void pressSix(View view) {
        switch(stage) {
            case 1:
                firstNumber.setText(firstNumber.getText().toString() + "6");
                break;
            case 2:
                secondNumber.setText(secondNumber.getText().toString() + "6");
                twoNumbers = true;
                break;
        }
    }

    public void pressOne(View view) {
        switch(stage) {
            case 1:
                firstNumber.setText(firstNumber.getText().toString() + "1");
                break;
            case 2:
                secondNumber.setText(secondNumber.getText().toString() + "1");
                twoNumbers = true;
                break;
        }
    }

    public void pressTwo(View view) {
        switch(stage) {
            case 1:
                firstNumber.setText(firstNumber.getText().toString() + "2");
                break;
            case 2:
                secondNumber.setText(secondNumber.getText().toString() + "2");
                twoNumbers = true;
                break;
        }
    }

    public void pressThree(View view) {
        switch(stage) {
            case 1:
                firstNumber.setText(firstNumber.getText().toString() + "3");
                break;
            case 2:
                secondNumber.setText(secondNumber.getText().toString() + "3");
                twoNumbers = true;
                break;
        }
    }

    public void pressZero(View view) {
        switch(stage) {
            case 1:
                firstNumber.setText(firstNumber.getText().toString() + "0");
                break;
            case 2:
                secondNumber.setText(secondNumber.getText().toString() + "0");
                break;
        }
    }

    // Operations
    public void add(View view) {
        switch (stage) {
            case 1:
                if (!firstNumber.getText().toString().equals("")) {
                    number1 = Integer.parseInt(firstNumber.getText().toString());
                    firstNumber.setText(firstNumber.getText().toString() + " + ");
                    stage = 2;
                    operation = 1;
                }
                break;
            case 2:
                if (secondNumber.getText().toString().equals("")) {
                    firstNumber.setText("" + number1 + " + ");
                    operation = 1;
                    stage = 2;
                } else {
                    number2 = Integer.parseInt(secondNumber.getText().toString());
                    number1 = doMath(number1, number2, operation);
                    firstNumber.setText("" + number1 + " + ");
                    secondNumber.setText("");
                    stage = 2;
                    operation = 1;
                }
                break;
        }
        twoNumbers = false;
    }

    public void subtract(View view) {
        switch (stage) {
            case 1:
                if (!firstNumber.getText().toString().equals("")) {
                    number1 = Integer.parseInt(firstNumber.getText().toString());
                    firstNumber.setText(firstNumber.getText().toString() + " - ");
                    stage = 2;
                    operation = 2;
                }
                break;
            case 2:
                if (secondNumber.getText().toString().equals("")) {
                    firstNumber.setText("" + number1 + " - ");
                    operation = 2;
                    stage = 2;
                } else {
                    number2 = Integer.parseInt(secondNumber.getText().toString());
                    number1 = doMath(number1, number2, operation);
                    firstNumber.setText("" + number1 + " - ");
                    secondNumber.setText("");
                    stage = 2;
                    operation = 2;
                }
                break;
        }
        twoNumbers = false;
    }

    public void multiply(View view) {
        switch (stage) {
            case 1:
                if (!firstNumber.getText().toString().equals("")) {
                    number1 = Integer.parseInt(firstNumber.getText().toString());
                    firstNumber.setText(firstNumber.getText().toString() + " x ");
                    stage = 2;
                    operation = 3;
                }
                break;
            case 2:
                if (secondNumber.getText().toString().equals("")) {
                    firstNumber.setText("" + number1 + " x ");
                    operation = 3;
                    stage = 2;
                } else {
                    number2 = Integer.parseInt(secondNumber.getText().toString());
                    number1 = doMath(number1, number2, operation);
                    firstNumber.setText("" + number1 + " x ");
                    secondNumber.setText("");
                    stage = 2;
                    operation = 3;
                }
                break;
        }
        twoNumbers = false;
    }

    public void divide(View view) {
        switch (stage) {
            case 1:
                if (!firstNumber.getText().toString().equals("")) {
                    number1 = Integer.parseInt(firstNumber.getText().toString());
                    firstNumber.setText(firstNumber.getText().toString() + " / ");
                    stage = 2;
                    operation = 4;
                }
                break;
            case 2:
                if (secondNumber.getText().toString().equals("")) {
                    firstNumber.setText("" + number1 + " / ");
                    operation = 4;
                    stage = 2;
                } else {
                    number2 = Integer.parseInt(secondNumber.getText().toString());
                    number1 = doMath(number1, number2, operation);
                    firstNumber.setText("" + number1 + " / ");
                    secondNumber.setText("");
                    stage = 2;
                    operation = 4;
                }
                break;
        }
        twoNumbers = false;
    }

    public void equal(View view) {
        if (stage != 1) {
            if (twoNumbers) {
                number2 = Integer.parseInt(secondNumber.getText().toString());
                number1 = doMath(number1, number2, operation);
                firstNumber.setText("" + number1);
                secondNumber.setText("");
                operation = 0;
                stage = 1;
            } else {
                Toast.makeText(this, "Invalid operation!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void delete(View view) {
        firstNumber.setText("");
        secondNumber.setText("");
        stage = 1;
        operation = 0;
        twoNumbers = false;
    }


    int doMath(int x, int y, int op) {
        switch (op) {
            case 1:
                x = x + y;
                break;
            case 2:
                x = x - y;
                break;
            case 3:
                x = x * y;
                break;
            case 4:
                x = x / y;
                break;
        }
        return x;
    }
}
