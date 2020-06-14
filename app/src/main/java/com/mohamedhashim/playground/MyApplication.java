package com.mohamedhashim.playground;

/**
 * Created by Mohamed Hashim on 6/14/2020.
 */
public class MyApplication extends android.app.Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();

    }
    // Remove CoffeComponent getter to create different instances in new activities or restarting it
    //Implement AppComponent getter to make it has only one instance in all app activities


    public AppComponent getAppComponent() {
        return appComponent;
    }
}
