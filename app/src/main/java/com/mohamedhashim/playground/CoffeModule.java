package com.mohamedhashim.playground;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mohamed Hashim on 6/13/2020.
 */
@Module
public class CoffeModule {
    //remove integer sugar and constructor to create component builder

    @Provides
    River makeRiver() {
        return new River();
    }
}
