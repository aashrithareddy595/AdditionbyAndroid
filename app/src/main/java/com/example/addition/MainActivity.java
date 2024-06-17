package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtFirstNo;
    private EditText txtSecondNo;
    private TextView txtresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtFirstNo=(EditText) findViewById(R.id.txtFirstNo);
        txtSecondNo=(EditText) findViewById(R.id.txtSecondNo);
        txtresult=(TextView) findViewById(R.id.txtresult);
    }

    public void Calculate(View v) {
        Float First= Float.parseFloat(txtFirstNo.getText().toString());
        Float Second= Float.parseFloat(txtSecondNo.getText().toString());
        Float result= First+Second;
        txtresult.setText(result.toString());

    }
}