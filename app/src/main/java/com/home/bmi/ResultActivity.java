package com.home.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {
    TextView tx_result ;
    double bmi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        findview();

        bmi=getIntent().getDoubleExtra("BMI",0);
        tx_result.setText("BMI="+bmi);
    }

    private void findview(){
        tx_result=findViewById(R.id.tx_result);
    }
}
