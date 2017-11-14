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

public class Alarm extends AppCompatActivity {

    Button btnadd, btn_alarm_can;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm);
        setTitle("알람");

        btnadd = (Button) findViewById(R.id.btnadd);
        btn_alarm_can = (Button) findViewById(R.id.btn_alaram_can);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alarm.this,Alarm_add.class);
                startActivity(intent);
            }
        });
        btn_alarm_can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alarm.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
