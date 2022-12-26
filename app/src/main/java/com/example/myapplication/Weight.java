package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Weight extends AppCompatActivity {
EditText weight_et;
TextView weight_tv;
Button btn_convert_weight;
Spinner sp1,sp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        weight_et=findViewById(R.id.weightconvert_et);
        weight_tv=findViewById(R.id.tv_Weightconvert);
        sp1=findViewById(R.id.weightsp1);
        sp2=findViewById(R.id.weightsp2);
        btn_convert_weight=findViewById(R.id.btn_weight_convert);
        btn_convert_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    //Kilogram to gram
                    if (sp1.getSelectedItem().equals("Kilogram kg") && sp2.getSelectedItem().equals("Gram g"))
                    {
                        Float weight=Float.parseFloat(weight_et.getText().toString());
                        weight_tv.setText(""+weight*1000);
                    }
                    //Kilogram to Quintal
                    if (sp1.getSelectedItem().equals("Kilogram kg") && sp2.getSelectedItem().equals("Quintal q"))
                    {
                        Float weight=Float.parseFloat(weight_et.getText().toString());
                        weight_tv.setText(""+weight/100);
                    }
                    //Kilogram to tonne
                    if (sp1.getSelectedItem().equals("Kilogram kg") && sp2.getSelectedItem().equals("Tonne t"))
                    {
                        Float weight=Float.parseFloat(weight_et.getText().toString());
                        weight_tv.setText(""+weight/1000);
                    }
                    //Kilogram to millgram
                    if (sp1.getSelectedItem().equals("Kilogram kg") && sp2.getSelectedItem().equals("Milligram mg"))
                    {
                        Float weight=Float.parseFloat(weight_et.getText().toString());
                        weight_tv.setText(""+weight*1000000);
                    }


                    //Gram to kg
                    if (sp1.getSelectedItem().equals("Gram g") && sp2.getSelectedItem().equals("Kilogram kg"))
                    {
                        Float weight=Float.parseFloat(weight_et.getText().toString());
                        weight_tv.setText(""+weight/1000);
                    }
                    //Gram to quintal
                    if (sp1.getSelectedItem().equals("Gram g") && sp2.getSelectedItem().equals("Quintal q"))
                    {
                        Float weight=Float.parseFloat(weight_et.getText().toString());
                        weight_tv.setText(""+weight/100000);
                    }
                    //Gram to tonee
                    if (sp1.getSelectedItem().equals("Gram g") && sp2.getSelectedItem().equals("Tonne t"))
                    {
                        Float weight=Float.parseFloat(weight_et.getText().toString());
                        weight_tv.setText(""+weight/1000000);

                    }
                    //Gram to milligram
                    if (sp1.getSelectedItem().equals("Gram g") && sp2.getSelectedItem().equals("Milligram mg"))
                    {
                        Float weight=Float.parseFloat(weight_et.getText().toString());
                        weight_tv.setText(""+weight*1000);
                    }
                    //Quintal to kg
                    if (sp1.getSelectedItem().equals("Quintal q") && sp2.getSelectedItem().equals("Kilogram kg"))
                    {
                        Float weight=Float.parseFloat(weight_et.getText().toString());
                        weight_tv.setText(""+weight*100);
                    }
                    //Quintal to tonne
                    if (sp1.getSelectedItem().equals("Quintal q") && sp2.getSelectedItem().equals("Tonne t"))
                    {
                        Float weight=Float.parseFloat(weight_et.getText().toString());
                        weight_tv.setText(""+weight/10);
                    }
                    //Quintal to gram
                    if (sp1.getSelectedItem().equals("Quintal q") && sp2.getSelectedItem().equals("Gram g"))
                    {
                        Float weight=Float.parseFloat(weight_et.getText().toString());
                        weight_tv.setText(""+weight*100000);
                    }

                    //Tonne to Kg
                    if (sp1.getSelectedItem().equals("Tonne t") && sp2.getSelectedItem().equals("Kilogram kg"))
                    {
                        Float weight=Float.parseFloat(weight_et.getText().toString());
                        weight_tv.setText(""+weight*1000);
                    }
                    //Tonne to Quintal
                    if (sp1.getSelectedItem().equals("Tonne t") && sp2.getSelectedItem().equals("Quintal q"))
                    {
                        Float weight=Float.parseFloat(weight_et.getText().toString());
                        weight_tv.setText(""+weight*10);
                    }
                    //Tonne to gram
                    if (sp1.getSelectedItem().equals("Tonne t") && sp2.getSelectedItem().equals("Gram g"))
                    {
                        Float weight=Float.parseFloat(weight_et.getText().toString());
                        weight_tv.setText(""+weight* 1000000);

                    }


                    //IF BOTH THE UNITS ARE SAME
                    if(sp1.getSelectedItem().toString().equals(sp2.getSelectedItem().toString()))
                    {
                        Toast.makeText(Weight.this,"UNITS CANNOT BE SAME",Toast.LENGTH_LONG).show();
                    }
                }
                catch (Exception e)
                {
                    Toast.makeText(Weight.this,"ERROR"+e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}