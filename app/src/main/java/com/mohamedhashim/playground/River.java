package com.mohamedhashim.playground;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Mohamed Hashim on 6/13/2020.
 */
class River {
    private static final String TAG = "River";

    @Inject
    public River() {
        Log.d(TAG, "River: ");
    }

    String getWater() {
        return "Water";
    }
}
