package com.example.tiendavirtual;


import android.content.Context;


import com.example.tiendavirtual.data.remote.NetworkModule;
import com.example.tiendavirtual.views.CategoryFragment;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = NetworkModule.class)

public interface ApplicationComponent {

    @Component.Factory
    interface Factory{
       ApplicationComponent create(@BindsInstance Context context);
    }
    void inject (MainActivity mainActivity);
    void inject (CategoryFragment mainFragment);


}
