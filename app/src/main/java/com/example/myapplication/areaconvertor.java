package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class areaconvertor extends AppCompatActivity {
Button btn_areaconvert;
EditText et_area;
TextView tv_area;
Spinner sp1,sp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areaconvertor);
        btn_areaconvert=findViewById(R.id.btn_areconvert);
        tv_area=findViewById(R.id.areaconvert_tv);
        et_area=findViewById(R.id.areaconvert_et);
        sp1=findViewById(R.id.areasp1);
        sp2=findViewById(R.id.areasp2);
        btn_areaconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    //meter square to centimeter square
                    if (sp1.getSelectedItem().equals("Square Meter") && sp2.getSelectedItem().equals("Square Centimeter"))

                    {
                        Float area = Float.parseFloat(et_area.getText().toString());
                        tv_area.setText(""+area*10000);
                    }
                    // meter square to kilometer square
                    if (sp1.getSelectedItem().equals("Square Meter") && sp2.getSelectedItem().equals("Square Kilometer"))

                    {
                        Float area = Float.parseFloat(et_area.getText().toString());
                        tv_area.setText(""+area*0.000001);
                    }
                    //centimer square to meter square
                    if (sp1.getSelectedItem().equals("Square Centimeter") && sp2.getSelectedItem().equals("Square Meter"))

                    {
                        Float area = Float.parseFloat(et_area.getText().toString());
                        tv_area.setText(""+area/10000);
                    }
                //centimer square to Kilometer square
                    if (sp1.getSelectedItem().equals("Square Centimeter") && sp2.getSelectedItem().equals("Square Kilometer"))

                    {
                        Toast.makeText(areaconvertor.this, "CODE BAKI H BHAI LIKHNA ", Toast.LENGTH_LONG).show();
                    }
                    //kILOMETER TO METER SQUARE
                    if (sp1.getSelectedItem().equals("Square Kilometer") && sp2.getSelectedItem().equals("Square Meter"))

                    {
                        Float area = Float.parseFloat(et_area.getText().toString());
                        tv_area.setText(""+area*1000000);
                    }
                    //kILOMETER TO CENTIMETER SQUARE
                    if (sp1.getSelectedItem().equals("Square Kilometer") && sp2.getSelectedItem().equals("Square Centimeter"))

                    {
                        Toast.makeText(areaconvertor.this, "CODE BAKI H BHAI LIKHNA ", Toast.LENGTH_LONG).show();
                    }
                    //units are same
                    if (sp1.getSelectedItem().toString().equals(sp2.getSelectedItem().toString())) {
                        Toast.makeText(areaconvertor.this, "UNITS CANNOT BE SAME", Toast.LENGTH_LONG).show();
                    }

                } catch (Exception e)
                {

                    Toast.makeText(areaconvertor.this, "ENTER AREA ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}