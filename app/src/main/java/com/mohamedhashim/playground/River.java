package com.mohamedhashim.playground;

import android.util.Log;

/**
 * Created by Mohamed Hashim on 6/13/2020.
 */
class River {
    private static final String TAG = "River";

    //Remove @inject to make River class as a blocked class (just for view)
    public River() {
        Log.d(TAG, "River: ");
    }

    String getWater() {
        return "Water";
    }
}
