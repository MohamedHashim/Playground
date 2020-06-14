package com.mohamedhashim.playground;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by Mohamed Hashim on 6/13/2020.
 */
@Component(modules = CoffeModule.class)
interface CoffeComponent {
    Coffe getCoffe();

    void inject(MainActivity mainActivity);

    @Component.Builder  //to make it the default builder of the CloffeComponent
    interface Builder {
        //Here we create two instances from same prototypes
        //Use qualifier named to distinguished between them
        //to create custom builder in activity

        @BindsInstance  //to let it know that sugar is a dependency can be taken
        Builder sugar(@Named("suger") int sugar);

        @BindsInstance  //to let it know that sugar is a dependency can be taken
        Builder milk(@Named("milk") int milk);

        CoffeComponent build();

    }
}
