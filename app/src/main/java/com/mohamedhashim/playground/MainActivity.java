package com.mohamedhashim.playground;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject
    Coffe coffe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CoffeComponent coffeComponent = DaggerCoffeComponent.builder().sugar(4).build();
        coffeComponent.inject(this);
        Log.d(TAG, "onCreate: " + coffe.makeCoffe());
    }
}