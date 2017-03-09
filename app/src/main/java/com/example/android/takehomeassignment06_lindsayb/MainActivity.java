package com.example.android.takehomeassignment06_lindsayb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText amount;
    EditText taxPercentage;
    EditText tipPercentage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = (EditText) findViewById(R.id.amount);
        taxPercentage = (EditText) findViewById(R.id.tax);
        tipPercentage  = (EditText) findViewById(R.id.tip);

    }

    public void SubmitScreen(View view)
    {

        String a = amount.getText().toString();

        String taxP = taxPercentage.getText().toString();

        String tipP = tipPercentage.getText().toString();


        Intent i = new Intent(this, SubmitScreen.class);
        i.putExtra("Amount", a);
        i.putExtra("Tax Percentage", taxP);
        i.putExtra("Tip Percentage", tipP);
        startActivity(i);

    }
}




