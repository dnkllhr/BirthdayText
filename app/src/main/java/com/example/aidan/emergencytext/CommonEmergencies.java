package com.example.aidan.emergencytext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Toast;

public class CommonEmergencies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_emergencies);
    }

    public void sendText(View view){

        //This is the code for making a simple toast with a message of "Test"
        //Toast.makeText(this,"Test", Toast.LENGTH_SHORT).show();

        //now we can make the code for sending a message
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage("8132302188",null, "Hello, this is a test.", null, null);

    }
}
