package com.mohamedhashim.playground;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Mohamed Hashim on 6/13/2020.
 */
class Coffe {
    private static final String TAG = "Coffe";
    @Inject
    Farm farm;

    River river;

    int sugar;
    int milk;

    @Inject
    public Coffe(River river, @Named("suger") int sugar,@Named("milk") int milk) {
        this.river = river;
        this.sugar = sugar;
        this.milk = milk;
    }

    public String makeCoffe() {
        return farm.getBeans() + " + " + river.getWater() + "Sugar: " + sugar + " Milk: " + milk;
    }

    @Inject
    public void connectElect() {
        Log.d(TAG, "connectElect: connecting ....");
    }
}
