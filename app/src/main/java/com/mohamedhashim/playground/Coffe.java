package com.mohamedhashim.playground;

import javax.inject.Inject;

/**
 * Created by Mohamed Hashim on 6/13/2020.
 */
class Coffe {
    private Farm farm;
    private River river;

    @Inject
    public Coffe(Farm farm, River river) {
        this.farm = farm;
        this.river = river;
    }
}
