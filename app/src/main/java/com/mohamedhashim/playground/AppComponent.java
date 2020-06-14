package com.mohamedhashim.playground;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Mohamed Hashim on 6/14/2020.
 */
@Singleton
@Component(modules = CoffeModule.class)
interface AppComponent {

    //Remove getRiver method and implement coffeComponent builder as subComponent
    CoffeComponent.Builder coffeComponentBuilder();
}
