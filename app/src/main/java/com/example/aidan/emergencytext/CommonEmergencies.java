package com.example.aidan.emergencytext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CommonEmergencies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_emergencies);
    }

    private void test(){
        System.out.println("this is a test");
    }
}
