package com.mohamedhashim.playground;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CoffeComponent coffeComponent = DaggerCoffeComponent.create();
        coffeComponent.getCoffe();
    }
}