package com.vijay.library.finddistanceandtime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.vijay.library.distimelibrary.LocationCalculator;


public class MainActivity extends AppCompatActivity {


    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LocationCalculator calculate = new LocationCalculator();

        double distance = calculate.calculateDistance(13.049203, 77.505779, 13.013005, 77.579918);
        Log.w(TAG, "distance : " + distance);

        TextView txtDistance = (TextView) findViewById(R.id.txtDistance);

        txtDistance.setText("Distance between the location is " + distance + "kms");

        TextView txtTime = (TextView) findViewById(R.id.txtTime);

        String time = calculate.calculateTime(distance, 30.0F);

        txtTime.setText("Time : " + time);


    }
}
