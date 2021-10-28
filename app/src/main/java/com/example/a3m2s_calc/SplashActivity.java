package com.example.a3m2s_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread= new Thread(){

            @Override
            public void run() {
                try {
                    sleep(4000);
                }
                catch (Exception e ){
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(SplashActivity.this , MainActivity.class);
                    startActivity(intent);
                }
            }
        }; thread.start();
    }
}