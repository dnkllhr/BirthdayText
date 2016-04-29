package com.example.aidan.emergencytext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

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
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        if(dateFormat.format(date).charAt(6) == '4' && dateFormat.format(date).charAt(8) == '1' && dateFormat.format(date).charAt(8) == '6'){
            smsManager.sendTextMessage("8133355782", null, "Happy Birthday mom!!! I love you so much.", null, null);
        }
        else if(dateFormat.format(date).charAt(6) == '2' && dateFormat.format(date).charAt(8) == '0' && dateFormat.format(date).charAt(8) == '4'){
                smsManager.sendTextMessage("8136000561", null, "Happy Birthday Jessa!!! I love you so much.", null, null);

            }
        else if(dateFormat.format(date).charAt(6) == '8' && dateFormat.format(date).charAt(8) == '1' && dateFormat.format(date).charAt(8) == '6'){
            smsManager.sendTextMessage("8135081676", null, "Happy Birthday dad!!! I love you so much.", null, null);
        }

        else{
            smsManager.sendTextMessage("8132302188", null, "It's nobody's birthday dummy", null, null);
        }
    }
}
