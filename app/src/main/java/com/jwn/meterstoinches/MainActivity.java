package com.jwn.meterstoinches;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

/******* 1m = 39.3701in ********/

    private EditText enterMeters;
    private Button   convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterMeters = (EditText) findViewById(R.id.metersEditText);
        resultTextView = (TextView) findViewById(R.id.resultID);
        convertButton = (Button) findViewById(R.id.convertButtonID);

        convertButton.setOnClickListener(new View.OnClickListener() {// instatiate a new object & listen for button click
            @Override
            public void onClick(View view) {
                //Convert logic
                double multiplier = 39.37;
                double result = 0.0;

                if (enterMeters.getText().toString().equals("")) {
                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                }else {
                    double meterValue =Double.parseDouble(enterMeters.getText().toString());
                    result = meterValue*multiplier;
                    //put the result variable into resultTextView object
                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText(String.format("%.2f", result) + "inches");
                }


            }
        });


    }
}
