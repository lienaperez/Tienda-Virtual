package com.example.tiendavirtual;

import android.app.Application;

public class TiendaVirtual extends Application {
    public ApplicationComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerApplicationComponent.factory().create(this);
    }
}

