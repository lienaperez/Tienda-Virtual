package com.example.tiendavirtual;


import android.content.Context;


import com.example.tiendavirtual.data.remote.NetworkModule;
import com.example.tiendavirtual.views.CategoryFragment;
import com.example.tiendavirtual.views.CategoryProductsFragment;
import com.example.tiendavirtual.views.ShoppingUserHistoryFragment;
import com.example.tiendavirtual.views.UserAddressFragment;
import com.example.tiendavirtual.views.UserProfileFragment;

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
    void inject (CategoryFragment categoryFragment);
    void inject (CategoryProductsFragment categoryProductsFragment);
    void inject (ShoppingUserHistoryFragment shoppingUserHistoryFragment);
    void inject (UserAddressFragment userAddressFragment);
    void inject (UserProfileFragment userProfileFragment);


}
