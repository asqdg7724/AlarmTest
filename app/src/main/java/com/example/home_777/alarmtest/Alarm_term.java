package com.example.home_777.alarmtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

/**
 * Created by home-777 on 2017-11-14.
 */

public class Alarm_term extends AppCompatActivity {

    Button btn_term_ok, btn_term_can;
    RadioButton radio_5min, radio_10min, radio_15min, radio_30min;
    RadioButton radio_3bun, radio_5bun, radio_continue;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_term);

        btn_term_ok = (Button) findViewById(R.id.btn_term_ok);
        btn_term_can = (Button) findViewById(R.id.btn_term_can);

        radio_5min = (RadioButton) findViewById(R.id.radio_5min);
        radio_10min = (RadioButton) findViewById(R.id.radio_10min);
        radio_15min = (RadioButton) findViewById(R.id.radio_15min);
        radio_30min = (RadioButton) findViewById(R.id.radio_30min);

        radio_3bun = (RadioButton) findViewById(R.id.radio_3bun);
        radio_5bun = (RadioButton) findViewById(R.id.radio_5bun);
        radio_continue = (RadioButton) findViewById(R.id.radio_continue);

        btn_term_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alarm_term.this,Alarm_add.class);
                startActivity(intent);
            }
        });

        btn_term_can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alarm_term.this,Alarm_add.class);
                startActivity(intent);
            }
        });
    }
}
