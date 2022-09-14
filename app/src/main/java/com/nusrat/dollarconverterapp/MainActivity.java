package com.nusrat.dollarconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertNow(View view) {
        EditText editText;
        editText = findViewById(R.id.editText);


        TextView textView= findViewById(R.id.displayText);
        String dollar = editText.getText().toString();
        Double dollarinDouble = Double.parseDouble(dollar);
        Double takainDouble = dollarinDouble * 96.90;
        String takaInString = String.valueOf(takainDouble);
        textView.setText(takaInString);

    }
}