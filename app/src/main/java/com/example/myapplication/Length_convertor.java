package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
public class Length_convertor extends AppCompatActivity {
Spinner sp;
EditText et_length;
TextView tv_length;
Button btn_lengthcpnvert;
Spinner sp1,sp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_convertor);
        sp1=findViewById(R.id.lengthsp1);
        sp2=findViewById(R.id.lengthsp2);
        et_length=findViewById(R.id.lenghtconvert_et);
        tv_length=findViewById(R.id.tv_lengthconvert);
        btn_lengthcpnvert=findViewById(R.id.btn_length_convert);
        btn_lengthcpnvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    //Meter to CentiMeter
                    if (sp1.getSelectedItem().equals("Meter") && sp2.getSelectedItem().equals("Centimeter")) {
                        Float length = Float.parseFloat(et_length.getText().toString());
                        tv_length.setText(" " + length * 100);
                    }
                    //Meter to Kilometer
                    if (sp1.getSelectedItem().equals("Meter") && sp2.getSelectedItem().equals("Kilometer")) {
                        Float length = Float.parseFloat(et_length.getText().toString());
                        tv_length.setText(" " + length / 1000);
                    }
                    //Meter to Micrometer
                    if (sp1.getSelectedItem().equals("Meter") && sp2.getSelectedItem().equals("Micrometer")) {
                        Float length = Float.parseFloat(et_length.getText().toString());
                        tv_length.setText(" " + length * 1000000);
                    }
                    //centimeter to meter
                    if (sp1.getSelectedItem().equals("Centimeter") && sp2.getSelectedItem().equals("Meter")) {
                        Float length = Float.parseFloat(et_length.getText().toString());
                        tv_length.setText(" " + length / 100);
                    }
                    //cm to Kilometer
                    if (sp1.getSelectedItem().equals("Centimeter") && sp2.getSelectedItem().equals("Kilometer")) {
                        Float length = Float.parseFloat(et_length.getText().toString());
                        tv_length.setText(" " + length / 100000);
                    }
                    //cm to Micrometer

                    if (sp1.getSelectedItem().equals("Centimeter") && sp2.getSelectedItem().equals("Micrometer")) {
                        Float length = Float.parseFloat(et_length.getText().toString());
                        tv_length.setText(" " + length / 10000);
                    }
                    //Micrometer to Meter
                    if (sp1.getSelectedItem().equals("Micrometer") && sp2.getSelectedItem().equals("Meter")) {
                        Float length = Float.parseFloat(et_length.getText().toString());
                        tv_length.setText(" " + length / 1000000);
                    }
                    //Micrometer to centimeter
                    if (sp1.getSelectedItem().equals("Micrometer") && sp2.getSelectedItem().equals("Centimeter")) {
                        Float length = Float.parseFloat(et_length.getText().toString());
                        tv_length.setText(" " + length /10000);
                    }
                    //Micrometer to Km
                    if (sp1.getSelectedItem().equals("Micrometer") && sp2.getSelectedItem().equals("Kilometer")) {
                        Float length = Float.parseFloat(et_length.getText().toString());
                        tv_length.setText(" " + length / 1000000000);
                    }
                    //Kilometer to centimeter
                    if (sp1.getSelectedItem().equals("Kilometer") && sp2.getSelectedItem().equals("Centimeter")) {
                        Float length = Float.parseFloat(et_length.getText().toString());
                        tv_length.setText(" " + length / 100000);
                    }
                    //Kilometer to meter
                    if (sp1.getSelectedItem().equals("Kilometer") && sp2.getSelectedItem().equals("Meter")) {
                        Float length = Float.parseFloat(et_length.getText().toString());
                        tv_length.setText(" " + length * 1000);

                    }
                    //Kilometer to Micrometer
                    if (sp1.getSelectedItem().equals("Kilometer") && sp2.getSelectedItem().equals("Micrometer")) {
                        Float length = Float.parseFloat(et_length.getText().toString());
                        tv_length.setText(" " + length * 1000000000);

                    }
                    //if both are  same
                    if (sp1.getSelectedItem().toString().equals(sp2.getSelectedItem().toString())) {
                        Toast.makeText(Length_convertor.this, "UNITS CANNOT BE SAME", Toast.LENGTH_LONG).show();
                    }


                } catch (Exception e) {
                    Toast.makeText(Length_convertor.this, "ENTER LENGTH", Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}