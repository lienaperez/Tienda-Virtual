package com.example.tiendavirtual;

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
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

import static com.example.tiendavirtual.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {
    NavController navController ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.other_fragment,R.id.main_fragment).build();
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


}