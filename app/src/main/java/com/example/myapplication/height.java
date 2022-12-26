package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class height extends AppCompatActivity {
Button btn_height;
EditText et_ht;
TextView tv_ht;
Spinner sp1,sp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height);
        btn_height=findViewById(R.id.btn_height_convert);
        tv_ht=findViewById(R.id.tv_heightconvert);
        et_ht=findViewById(R.id.heightconvert_et);
        sp1=findViewById(R.id.heightsp1);
        sp2=findViewById(R.id.heightsp2);
        btn_height.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    //cm to foot
                    if (sp1.getSelectedItem().equals("Centimeter") && sp2.getSelectedItem().equals("Foot")) {
                        Float ht = Float.parseFloat(et_ht.getText().toString());
                        tv_ht.setText("" + ht /30.48);
                        Toast.makeText(height.this, "SAME"+ht, Toast.LENGTH_LONG).show();
                    }
                    //FOOT TO CM
                    if (sp1.getSelectedItem().equals("Foot") && sp2.getSelectedItem().equals("Centimeter")) {
                        Float ht = Float.parseFloat(et_ht.getText().toString());
                        tv_ht.setText("" + ht *30.48);
                    }
                    //both are same
                    if (sp1.getSelectedItem().equals( sp2.getSelectedItem()))
                    {
                        Toast.makeText(height.this, "UNITS CANNOT BE SAME", Toast.LENGTH_LONG).show();
                    }
                }
                catch(Exception e)
                {
                   Toast.makeText(height.this,"ENTER HEIGHT",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}