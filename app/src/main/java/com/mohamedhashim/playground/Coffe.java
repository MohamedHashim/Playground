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

    int sugar;

    @Inject
    public Coffe(River river, int sugar) {
        this.river = river;
        this.sugar = sugar;
    }

    public String makeCoffe() {
        return farm.getBeans() + " + " + river.getWater() + "Sugar: " + sugar;
    }

    @Inject
    public void connectElect() {
        Log.d(TAG, "connectElect: connecting ....");
    }
}
