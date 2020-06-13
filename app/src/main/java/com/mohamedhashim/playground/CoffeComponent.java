package com.mohamedhashim.playground;

import dagger.Component;

/**
 * Created by Mohamed Hashim on 6/13/2020.
 */
@Component (modules = CoffeModule.class)
interface CoffeComponent {
    Coffe getCoffe();

    void inject(MainActivity mainActivity);
}
