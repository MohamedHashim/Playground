package com.mohamedhashim.playground;

import android.app.Application;

/**
 * Created by Mohamed Hashim on 6/14/2020.
 */
public class MyApplication extends Application {
    private CoffeComponent coffeComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        coffeComponent = DaggerCoffeComponent.builder().sugar(4).milk(5).build();

    }

    public CoffeComponent getCoffeComponent() {
        return coffeComponent;
    }
}
