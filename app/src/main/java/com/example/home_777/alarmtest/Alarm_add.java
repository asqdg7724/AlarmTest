package com.example.home_777.alarmtest;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;

/**
 * Created by home-777 on 2017-11-14.
 */

public class Alarm_add extends AppCompatActivity {

    TextView textDate;
    Button btnOk, btnCan, btn_add_name, btn_term;
    TimePicker timePicker;
    DatePicker datePicker;
    CheckBox chk_mon, chk_tue, chk_wen, chk_thu, chk_fri, chk_sat, chk_sun;
    Switch swterm;

    int year, month, day, hour, minute, sec;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_add);
        setTitle("알람 추가");

        textDate = (TextView) findViewById(R.id.textDate);
        btnOk = (Button) findViewById(R.id.btn_name_ok);
        btnCan = (Button) findViewById(R.id.btncan);
        btn_add_name = (Button) findViewById(R.id.btnname);
        btn_term = (Button) findViewById(R.id.btntrem);

        timePicker = (TimePicker) findViewById(R.id.timePicker);
        datePicker = (DatePicker) findViewById(R.id.datePicker);

        chk_mon = (CheckBox) findViewById(R.id.chk_mon);
        chk_tue = (CheckBox) findViewById(R.id.chk_tue);
        chk_wen = (CheckBox) findViewById(R.id.chk_wen);
        chk_thu = (CheckBox) findViewById(R.id.chk_thu);
        chk_fri = (CheckBox) findViewById(R.id.chk_fri);
        chk_sat = (CheckBox) findViewById(R.id.chk_sat);
        chk_sun = (CheckBox) findViewById(R.id.chk_sun);

        swterm = (Switch) findViewById(R.id.swterm);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                year = datePicker.getYear();
                month = datePicker.getMonth();
                day = datePicker.getDayOfMonth();
                hour = timePicker.getHour();
                minute = timePicker.getMinute();

                Intent intent = new Intent(Alarm_add.this,Alarm.class);
                startActivity(intent);
            }
        });

        btnCan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alarm_add.this,Alarm.class);
                startActivity(intent);
            }
        });

        btn_add_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alarm_add.this,Alarm_name.class);
                startActivity(intent);
            }
        });
        btn_term.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alarm_add.this,Alarm_term.class);
                startActivity(intent);
            }
        });

    }
}
