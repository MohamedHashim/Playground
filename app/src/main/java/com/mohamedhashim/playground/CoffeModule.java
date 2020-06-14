package com.mohamedhashim.playground;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mohamed Hashim on 6/13/2020.
 */
@Module
public class CoffeModule {
    //remove integer sugar and constructor to create component builder

    @Singleton
    @Provides
    River makeRiver() {
        return new River();
    }
}
