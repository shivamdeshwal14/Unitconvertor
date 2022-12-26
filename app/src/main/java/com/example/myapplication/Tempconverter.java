package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Tempconverter extends AppCompatActivity {
EditText et_temp;
TextView tv_temp;
Spinner sp1,sp2;
Button btn_tempconvert_convert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempconverter);
        et_temp=findViewById(R.id.tempcovert_et);
        tv_temp=findViewById(R.id.tv_tempconvert);
        sp1=findViewById(R.id.tempsp1);
        sp2=findViewById(R.id.tempsp2);

        btn_tempconvert_convert=findViewById(R.id.btn_tempconvert_convert);
        btn_tempconvert_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    //CELSIUS TO FAHRENHEIT
                    if (sp1.getSelectedItem().toString().equals("CELSIUS") && sp2.getSelectedItem().toString().equals("FAHRENHEIT"))
                    {
                        float temp=Float.parseFloat(et_temp.getText().toString());
                        Float newtemp=((temp)*9/5)+32;
                        tv_temp.setText(""+newtemp.toString());
                        Toast.makeText(Tempconverter.this,"TEMPERATURE CONVERTED",Toast.LENGTH_LONG).show();
                    }

                    //CELSIUS TO KELVIN
                    if (sp1.getSelectedItem().toString().equals("CELSIUS") && sp2.getSelectedItem().toString().equals("KELVIN"))
                    {
                        float temp=Float.parseFloat(et_temp.getText().toString());
                        double newtemp=temp+273.15;
                        tv_temp.setText(""+newtemp);
                        Toast.makeText(Tempconverter.this,"TEMPERATURE CONVERTED",Toast.LENGTH_LONG).show();
                    }
                    //KELVIN TO CELSIUS
                     if (sp1.getSelectedItem().toString().equals("KELVIN") && sp2.getSelectedItem().toString().equals("CELSIUS"))
                        {
                            double temp=Double.parseDouble(et_temp.getText().toString());

                            tv_temp.setText(""+(temp-273.15));
                            Toast.makeText(Tempconverter.this,"TEMPERATURE CONVERTED",Toast.LENGTH_LONG).show();
                    }
                     //KELVIN TO FAHRENHEIT
                    if (sp1.getSelectedItem().toString().equals("KELVIN") && sp2.getSelectedItem().toString().equals("FAHRENHEIT"))
                    {
                        double temp=Double.parseDouble(et_temp.getText().toString());
                        double newtemp=(((temp-273.15)*9/5)+32);
                        tv_temp.setText(newtemp+" F");
                        Toast.makeText(Tempconverter.this,"TEMPERATURE CONVERTED",Toast.LENGTH_LONG).show();
                    }
//                    FAHRENHEIT TO KELVIN
                    if (sp1.getSelectedItem().toString().equals("FAHRENHEIT") && sp2.getSelectedItem().toString().equals("KELVIN"))
                    {
                        Toast.makeText(Tempconverter.this,"TEMPERATURE CONVERTED",Toast.LENGTH_LONG).show();
                        double temp=Double.parseDouble(et_temp.getText().toString());
                        double newtemp=(((temp-32)*5)/9)+273.15;
                        tv_temp.setText(newtemp+" ");
                        Toast.makeText(Tempconverter.this,"TEMPERATURE CONVERTED",Toast.LENGTH_LONG).show();
                    }
                    //FAHRENHEIT TO CELSIUS
                    if (sp1.getSelectedItem().toString().equals("FAHRENHEIT") && sp2.getSelectedItem().toString().equals("CELSIUS"))
                    {
                        Toast.makeText(Tempconverter.this,"TEMPERATURE CONVERTED",Toast.LENGTH_LONG).show();
                        double temp=Double.parseDouble(et_temp.getText().toString());
                        double newtemp=((temp-32)*5)/9;
                        tv_temp.setText(newtemp+" ");
                        Toast.makeText(Tempconverter.this,"TEMPERATURE CONVERTED",Toast.LENGTH_LONG).show();
                    }
                    //IF BOTH THE UNITS ARE SAME
                    if(sp1.getSelectedItem().toString().equals(sp2.getSelectedItem().toString()))
                    {
                        Toast.makeText(Tempconverter.this,"UNITS CANNOT BE SAME",Toast.LENGTH_LONG).show();
                    }



                }
                // IF THE EDIT TEXT IS EMPTY
                catch (Exception e)
                {
                    Toast.makeText(Tempconverter.this,"ENTER TEMPERATURE ",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}