package com.mohamedhashim.playground;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Mohamed Hashim on 6/13/2020.
 */
@ActivityScopeSingleton
class Farm {
    private static final String TAG = "Farm";
    @Inject
    public Farm() {
        Log.d(TAG, "Farm: ");
    }

    public String getBeans() {
        return "Beans";
    }
}
