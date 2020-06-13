package com.mohamedhashim.playground;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by Mohamed Hashim on 6/13/2020.
 */
@Component (modules = CoffeModule.class)
interface CoffeComponent {
    Coffe getCoffe();

    void inject(MainActivity mainActivity);

    @Component.Builder  //to make it the default builder of the CloffeComponent
    interface Builder{

        //to create custom builder in activity
        @BindsInstance  //to let it know that sugar is a dependency can be taken
        Builder sugar(int sugar);
        CoffeComponent build();

    }
}
