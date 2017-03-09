package com.example.android.takehomeassignment06_lindsayb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubmitScreen extends AppCompatActivity
{

    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_screen);

        displayText = (TextView) findViewById(R.id.display_text);

        Intent i = getIntent();
        String amount = i.getStringExtra("Amount");
        double a = Double.parseDouble(amount);
        String taxPercentage = i.getStringExtra("Tax Percentage");
        double taxP = Double.parseDouble(taxPercentage);
        String tipPercentage = i.getStringExtra("Tip Percentage");
        double tipP = Double.parseDouble(tipPercentage);

        double total = (taxP * a) + (tipP * a) + a;

        setTitle("Your Receipt");
        displayText.setText("Total: $" + a + "\nSales Tax: " + (taxP * 100) + "%" + "\nTip: " + (tipP * 100) + "%" + "\nTotal: $" + total);
    }
}
