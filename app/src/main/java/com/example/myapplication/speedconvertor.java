package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class speedconvertor extends AppCompatActivity {
Button btn_speedconvert;
EditText et_speed;
TextView tv_speed;
Spinner sp1,sp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speedconvertor);
        btn_speedconvert=findViewById(R.id.btn_speedconvert);
        et_speed=findViewById(R.id.speedconvert_et);
        sp1=findViewById(R.id.speedsp1);
        sp2=findViewById(R.id.speedsp2);
        tv_speed=findViewById(R.id.speedconvert_tv);
        btn_speedconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    //km/h to m/s
                    if (sp1.getSelectedItem().equals("Km/h" )&& sp2.getSelectedItem().equals("m/s"))
                    {
                        Float speed=Float.parseFloat(et_speed.getText().toString());
                        tv_speed.setText(""+(speed)*5/18);
                    }
                    //m/s to km /h
                    if (sp1.getSelectedItem().equals("m/s" )&& sp2.getSelectedItem().equals("Km/h"))
                    {
                        Float speed=Float.parseFloat(et_speed.getText().toString());
                        tv_speed.setText(""+(speed)*18/5);
                    }
                    if (sp1.getSelectedItem().equals(sp2.getSelectedItem() ))
                    {
                        Toast.makeText(speedconvertor.this,"Units Cannot Be same",Toast.LENGTH_LONG).show();
                    }

                }
               catch(Exception e)
               {
                   Toast.makeText(speedconvertor.this,"ENTER SPEED",Toast.LENGTH_LONG).show();
               }
            }
        });
    }
}