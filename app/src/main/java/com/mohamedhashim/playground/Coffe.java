package com.mohamedhashim.playground;

import javax.inject.Inject;

/**
 * Created by Mohamed Hashim on 6/13/2020.
 */
class Coffe {
    @Inject
    Farm farm;
    @Inject
    River river;

    @Inject
    public Coffe() {
    }

    public String makeCoffe() {
        return farm.getBeans() + " + " + river.getWater();
    }
}
