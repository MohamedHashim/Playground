package com.mohamedhashim.playground;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Mohamed Hashim on 6/13/2020.
 */
class Coffe {
    private static final String TAG = "Coffe";
    @Inject
    Farm farm;

    River river;

    @Inject
    public Coffe(River river) {
        this.river = river;
    }

    public String makeCoffe() {
        return farm.getBeans() + " + " + river.getWater();
    }

    @Inject
    public void connectElect() {
        Log.d(TAG, "connectElect: connecting ....");
    }
}
