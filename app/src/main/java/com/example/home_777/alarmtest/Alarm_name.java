package com.example.home_777.alarmtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by home-777 on 2017-11-14.
 */

public class Alarm_name extends AppCompatActivity{

    Button btn_name_ok,btn_name_can;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_name);
        btn_name_can = (Button)findViewById(R.id.btn_name_can);
        btn_name_ok = (Button)findViewById(R.id.btn_name_ok);

        btn_name_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alarm_name.this,Alarm_add.class);
                startActivity(intent);
            }
        });
        btn_name_can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alarm_name.this,Alarm_add.class);
                startActivity(intent);
            }
        });

    }
}
