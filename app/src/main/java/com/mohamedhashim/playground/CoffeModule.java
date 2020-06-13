package com.mohamedhashim.playground;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mohamed Hashim on 6/13/2020.
 */
@Module
class CoffeModule {
    int sugar;

    public CoffeModule(int sugar) {
        this.sugar = sugar;
    }

    @Provides
    River makeRiver(){
        return new River();
    }

    @Provides
    int getSugar(){
        return sugar;
    }
}
