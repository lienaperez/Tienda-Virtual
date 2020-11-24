package com.example.tiendavirtual;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

import static com.example.tiendavirtual.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    public ApplicationComponent appComponent;
    NavController navController ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        appComponent = ((TiendaVirtual)getApplicationContext()).appComponent;
        appComponent.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.categories_fragment).build();
        navController = Navigation.findNavController(this,R.id.nav_host_fragment);
        MaterialToolbar toolbar = findViewById(R.id.topAppBar);
        NavigationUI.setupWithNavController(toolbar,navController,appBarConfiguration);
        setSupportActionBar(toolbar);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.top_app_bar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder().build();
        NavigationUI.navigateUp(navController,appBarConfiguration);
        return true;
    }
}