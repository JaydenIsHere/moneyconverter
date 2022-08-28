package com.firstapp.jayden.moneyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertMoney(View view){  //we create the onclick function
        EditText editText = (EditText) findViewById(R.id.amountInput);//target the input field value
        String inputAmount = editText.getText().toString();//assign input value to variable

        double inputAmountDouble = Double.parseDouble(inputAmount); //convert string to double

        double convertNT = (inputAmountDouble * 29.07);//assign calculated double value to variable

        String outputAmount = Double.toString(convertNT);//convert calculated double value to string
        Toast.makeText(this,"After converted is " + outputAmount,Toast.LENGTH_SHORT).show();
        //display string by using pupop message Toast
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
