package com.mohamedhashim.playground;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject
    Coffe coffe, coffe2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppComponent appComponent = ((MyApplication) getApplication()).getAppComponent();
        CoffeComponent coffeComponent = DaggerCoffeComponent.builder().sugar(4).milk(5).appComponent(appComponent).build();
        coffeComponent.inject(this);

        Log.d(TAG, "onCreate: " + coffe.makeCoffe() +
                "\ncoffe river 1 no:" + coffe.river + "\ncoffe2 no:" + coffe2.river +
                "\ncoffe river 2 no:" + coffe + "\n coffe2 no:" + coffe2);
    }
}