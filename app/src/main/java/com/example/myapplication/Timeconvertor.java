package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Timeconvertor extends AppCompatActivity {
    EditText et_time;
    TextView tv_time;
    Button btn_timeconvert;
    Spinner sp1,sp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeconvertor);
        sp1=findViewById(R.id.timesp1);
        sp2=findViewById(R.id.timesp2);
        et_time=findViewById(R.id.timeconvert_et);
        tv_time=findViewById(R.id.tv_timeconvert);
        btn_timeconvert=findViewById(R.id.btn_length_convert);
        btn_timeconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(sp1.getSelectedItem().equals("Second") && sp2.getSelectedItem().equals("Minute"))
                    {
                        Float time= Float.parseFloat(et_time.getText().toString());
                        tv_time.setText(""+time/60);
                    }
                    //Seconds to Minute
                    if(sp1.getSelectedItem().equals("Second") && sp2.getSelectedItem().equals("Minute"))
                    {
                        Float time= Float.parseFloat(et_time.getText().toString());
                        tv_time.setText(""+time/60);
                    }
                    //Seconds to hour
                    if(sp1.getSelectedItem().equals("Second") && sp2.getSelectedItem().equals("Hour"))
                    {
                        Float time= Float.parseFloat(et_time.getText().toString());
                        tv_time.setText(""+time/3600);
                    }
                    //Minute to second
                    if(sp1.getSelectedItem().equals("Minute") && sp2.getSelectedItem().equals("Second"))
                    {
                        Float time= Float.parseFloat(et_time.getText().toString());
                        tv_time.setText(""+time*60);
                    }
                    //Minute to Hour
                    if(sp1.getSelectedItem().equals("Minute") && sp2.getSelectedItem().equals("Hour"))
                    {
                        Float time= Float.parseFloat(et_time.getText().toString());
                        tv_time.setText(""+time/60);
                    }
                    //Hour to Minute
                    if(sp1.getSelectedItem().equals("Hour") && sp2.getSelectedItem().equals("Minute"))
                    {
                        Float time= Float.parseFloat(et_time.getText().toString());
                        tv_time.setText(""+time*60);
                    }
                        //Hour to Second
                    if(sp1.getSelectedItem().equals("Hour") && sp2.getSelectedItem().equals("Second"))
                    {
                        Float time= Float.parseFloat(et_time.getText().toString());
                        tv_time.setText(""+time*3600);
                    }
                    if (sp1.getSelectedItem().equals(sp2.getSelectedItem().toString()))
                    {
                        Toast.makeText(Timeconvertor.this,"UNITS CANNOT BE SAME",Toast.LENGTH_LONG).show();
                    }

                }
                catch (Exception e)
                {
                    Toast.makeText(Timeconvertor.this,"ENTER TIME ",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}