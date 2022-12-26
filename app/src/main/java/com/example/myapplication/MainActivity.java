 package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

CardView cv_temp,cv_length,cv_area,cv_height,cv_data,cv_speed,cv_weight,cv_time,cv_volume;
Toolbar tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar(findViewById(R.id.tbmain));
        cv_length=findViewById(R.id.btn_length);
        cv_temp=findViewById(R.id.btn_temp);
        cv_area=findViewById(R.id.cv_area);
        cv_height=findViewById(R.id.cv_HIEGHT);
        cv_speed=findViewById(R.id.cv_speed);
        cv_data=findViewById(R.id.cv_data);
        cv_weight=findViewById(R.id.cv_weight);
        cv_time=findViewById(R.id.cv_time);
        cv_volume=findViewById(R.id.cv_volume);


        cv_temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Tempconverter.class);
                startActivity(intent);
            }
        });
        cv_length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Length_convertor.class);
                startActivity(intent);
            }
        });
        cv_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Weight.class);
                startActivity(intent);
            }
        });
        cv_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Data.class);
                startActivity(intent);
            }
        });
        cv_speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,speedconvertor.class);
                startActivity(intent);
            }
        });
        cv_height.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,height.class);
                startActivity(intent);
            }
        });
        cv_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Timeconvertor.class);
                startActivity(intent);
            }
        });
        cv_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,areaconvertor.class);
                startActivity(intent);
            }
        });
        cv_volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,volumeconvertor.class);
                startActivity(intent);
            }
        });

    }

     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
         MenuInflater mi=this.getMenuInflater();
             mi.inflate(R.menu.optionmenu,menu);
         return super.onCreateOptionsMenu(menu);
     }

     @Override
     public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.opt1)
        {

            Intent intent=new Intent(MainActivity.this,Help.class);
            startActivity(intent);
        }
         if(item.getItemId()==R.id.opt2)
         {
             Intent intent=new Intent(MainActivity.this,About.class);
             startActivity(intent);

         }

         return super.onOptionsItemSelected(item);
     }
 }