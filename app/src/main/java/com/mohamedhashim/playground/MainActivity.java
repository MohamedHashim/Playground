package com.mohamedhashim.playground;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CoffeComponent coffeComponent = DaggerCoffeComponent.create();
        coffeComponent.getCoffe().makeCoffe();
        Log.d(TAG, "onCreate: " + coffeComponent.getCoffe().makeCoffe());
    }
}