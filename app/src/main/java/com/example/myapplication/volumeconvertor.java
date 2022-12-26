package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class volumeconvertor extends AppCompatActivity {
EditText volume_et;
TextView volume_tv;
Spinner sp1,sp2;
Button btn_volumeconvert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumeconvertor);
        volume_et=findViewById(R.id.volumeconvert_et);
        volume_tv=findViewById(R.id.tv_volumeconvert);
        btn_volumeconvert=findViewById(R.id.btn_volume_convert);
        sp1=findViewById(R.id.volumesp1);
        sp2=findViewById(R.id.volumesp2);
        btn_volumeconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Toast.makeText(volumeconvertor.this, "CLICKED", Toast.LENGTH_LONG).show();


                    //Litre to Mililiter
                    if (sp1.getSelectedItem().equals("Liter") && sp2.getSelectedItem().equals("Milliliter")) {
                        Float volume = Float.parseFloat(volume_et.getText().toString());
                        volume_tv.setText("" + volume * 1000);
                    }
                    //Milliliter to liter
                    if (sp1.getSelectedItem().equals("Milliliter") && sp2.getSelectedItem().equals("Liter")) {
                        Float volume = Float.parseFloat(volume_et.getText().toString());
                        volume_tv.setText("" + volume / 1000);
                    }
                    //both units are same
                    if (sp1.getSelectedItem().equals(sp2.getSelectedItem())) {
                        Toast.makeText(volumeconvertor.this, "Units Cannot Be same", Toast.LENGTH_LONG).show();
                    }
                }
                catch(Exception e)
                {
                    Toast.makeText(volumeconvertor.this, "ENTER VOLUME", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}