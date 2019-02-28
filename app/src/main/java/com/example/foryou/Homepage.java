package com.example.foryou;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.Inet4Address;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null)
            actionBar.hide();

        Button search=findViewById(R.id.search);//得到button实例
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homepage.this,Search.class);
                startActivity(intent);
            }
        });

        Button time_table=findViewById(R.id.time_table);
        time_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homepage.this,Timetable.class);
                startActivity(intent);

            }
        });

        Button Diarybook=findViewById(R.id.diarybook);
        Diarybook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homepage.this, com.example.foryou.Diarybook.class);
                startActivity(intent);
            }
        });

        Button setting=findViewById(R.id.setting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homepage.this,Setting.class);
                startActivity(intent);
            }
        });

        Button important_day=findViewById(R.id.important_day);
        important_day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homepage.this,Importantday.class);
                startActivity(intent);
            }
        });

        Button diary=findViewById(R.id.diary);
        diary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homepage.this,Diary.class);
                startActivity(intent);
            }
        });
    }
}
