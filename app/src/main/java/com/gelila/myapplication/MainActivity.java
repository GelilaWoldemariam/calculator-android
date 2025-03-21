package com.gelila.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity  {
Button buttonAdd,buttonSub,buttonMul,buttonDiv;
EditText editTextN1,editTextN2;
TextView textView;
int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        buttonAdd = findViewById(R.id.btn_add);
        buttonSub = findViewById(R.id.btn_sub);
        buttonMul = findViewById(R.id.btn_mul);
        buttonDiv = findViewById(R.id.btn_mul);
        editTextN1 = findViewById(R.id.number1);
        editTextN2 = findViewById(R.id.number2);
        textView = findViewById(R.id.answer);
    }
    public void add(View view){
        EditText firstNum = findViewById(R.id.number1);
        EditText secondNum = findViewById(R.id.number2);
        int num1 = Integer.parseInt(firstNum.getText().toString());
        int num2 = Integer.parseInt(secondNum.getText().toString());
        int result = num1 + num2;
        Toast.makeText(this, "The result is " + result, Toast.LENGTH_SHORT).show();;
    }
    public void subtract(View view){
        EditText firstNum = findViewById(R.id.number1);
        EditText secondNum = findViewById(R.id.number2);
        int num1 = Integer.parseInt(firstNum.getText().toString());
        int num2 = Integer.parseInt(secondNum.getText().toString());
        int result = num1 - num2;
        Toast.makeText(this, "The result is " + result, Toast.LENGTH_SHORT).show();;
    }
    public void multiply(View view){
        EditText firstNum = findViewById(R.id.number1);
        EditText secondNum = findViewById(R.id.number2);
        int num1 = Integer.parseInt(firstNum.getText().toString());
        int num2 = Integer.parseInt(secondNum.getText().toString());
        int result = num1 * num2;
        Toast.makeText(this, "The result is " + result, Toast.LENGTH_SHORT).show();;
    }
    public void divide(View view){
        EditText firstNum = findViewById(R.id.number1);
        EditText secondNum = findViewById(R.id.number2);
        int num1 = Integer.parseInt(firstNum.getText().toString());
        int num2 = Integer.parseInt(secondNum.getText().toString());
        int result = num1 / num2;
        Toast.makeText(this, "The result is " + result, Toast.LENGTH_SHORT).show();;
    }
}