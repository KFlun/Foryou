package com.example.foryou;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.SuperscriptSpan;

public class MainActivity extends AppCompatActivity {

    private Handler mHandler=new Handler(){
        @Override
        public void handleMessage(Message msg){
            super.handleMessage(msg);
            if (msg.what==1){
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,Homepage.class);
                startActivity(intent);
                MainActivity.this.finish();
                //finish方法的作用为销毁当前活动
            }
        }
    };
    //接收handler传递的信息，并且进行if语句判断是否执行Intent语句

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHandler.sendEmptyMessageDelayed(1,3000);
        //通过Handler来进行线程的信息传递，并且达到延时的效果

        ActionBar actionBar=getSupportActionBar();
        //调用getSuppoActionBar来调用actionbar实例
        if (actionBar!=null){
            actionBar.hide();
            //隐藏系统自带toolbar
        }
    }
}
