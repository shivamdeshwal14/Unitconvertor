package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Data extends AppCompatActivity {
Button btn_dataconvert;
EditText et_data;
TextView tv_dataconvert;
Spinner sp1,sp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        btn_dataconvert=findViewById(R.id.btn_dataconvert);
        et_data=findViewById(R.id.dataconvert_et);
        tv_dataconvert=findViewById(R.id.dataconvert_tv);
        btn_dataconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    //GB TO MB
                    if (sp1.getSelectedItem().equals("GB") && sp2.getSelectedItem().equals("MB"))
                    {
                        Float data=Float.parseFloat(et_data.getText().toString());
                        tv_dataconvert.setText(""+data*1024);
                    }
                    //GB TO KB
                    if (sp1.getSelectedItem().equals("GB") && sp2.getSelectedItem().equals("KB"))
                    {
                        Float data=Float.parseFloat(et_data.getText().toString());
                        tv_dataconvert.setText(""+data*1024*1024);
                    }
                    //MB TO GB
                    if (sp1.getSelectedItem().equals("MB") && sp2.getSelectedItem().equals("GB"))
                    {
                        Float data=Float.parseFloat(et_data.getText().toString());
                        tv_dataconvert.setText(""+data/1024);
                    }
                   //MB TO KB
                    if (sp1.getSelectedItem().equals("MB") && sp2.getSelectedItem().equals("KB"))
                    {
                        Float data=Float.parseFloat(et_data.getText().toString());
                        tv_dataconvert.setText(""+data*1024);
                    }
                    //KB TO GB
                    if (sp1.getSelectedItem().equals("KB") && sp2.getSelectedItem().equals("GB"))
                    {
                        Float data=Float.parseFloat(et_data.getText().toString());
                        tv_dataconvert.setText(""+data/(1024*1024));
                    }
                    //KB TO GB
                    if (sp1.getSelectedItem().equals("KB") && sp2.getSelectedItem().equals("MB"))
                    {
                        Float data=Float.parseFloat(et_data.getText().toString());
                        tv_dataconvert.setText(""+data/1024);
                    }
                    if (sp1.getSelectedItem().equals(sp2.getSelectedItem()))
                    {
                        Toast.makeText(Data.this,"UNITS CANNOT BE SAME",Toast.LENGTH_LONG).show();
                    }
                }
                catch (Exception e)
                {
                    Toast.makeText(Data.this,"ENTER DATA",Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}