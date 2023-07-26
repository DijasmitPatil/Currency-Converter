package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void click(View view){

        EditText anseditText = (EditText)findViewById(R.id.anseditText);

        String amountindollar = anseditText.getText().toString();

        double amountindollardouble = Double.parseDouble(amountindollar);

        double amountinrupee = amountindollardouble * 75.95;

        String amountinrupeestring = Double.toString(amountinrupee);


        Toast.makeText(this, anseditText.getText().toString()+"$ Converted into ="+ amountinrupeestring + "Rs", Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}