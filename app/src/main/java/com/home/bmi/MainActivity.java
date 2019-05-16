package com.home.bmi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView weight,height;
    EditText ed_weight,ed_height;
    Button btn_bmi,btn_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findviews();
        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Information")
                        .setMessage("BMI原來的設計是一個用於公眾健康研究的統計工具")
                        .setPositiveButton("OK",null)
                        .show();
            }
        });
    }
    public void bmi(View view){
        String str_w = ed_weight.getText().toString();
        String str_h = ed_height.getText().toString();
        double w = Double.parseDouble(str_w);
        double h = Double.parseDouble(str_h);
        double bmi = w/(h*h);

        Toast.makeText(this,"BMI="+bmi,Toast.LENGTH_SHORT).show();

        new AlertDialog.Builder(this)
                .setTitle("BMI")
                .setMessage("Your BMI is "+ bmi)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ed_weight.setText("");
                        ed_height.setText("");
                    }
                })
                .show();

    }


    private void findviews(){
        weight=findViewById(R.id.tx_weight);
        height=findViewById(R.id.tx_height);
        ed_weight=findViewById(R.id.ed_weight);
        ed_height=findViewById(R.id.ed_height);
        btn_bmi=findViewById(R.id.btn_bmi);
        btn_info=findViewById(R.id.btn_info);

    }
}
