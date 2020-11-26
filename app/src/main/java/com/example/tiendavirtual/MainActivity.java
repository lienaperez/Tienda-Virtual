package com.example.tiendavirtual;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
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

public class MainActivity extends AppCompatActivity {

    public ApplicationComponent appComponent;
    NavController navController ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        appComponent = ((TiendaVirtual)getApplicationContext()).appComponent;
        appComponent.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navController = ((NavHostFragment)getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)).getNavController();
        DrawerLayout drawerLayout = findViewById(R.id.drawer);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph())
                .setOpenableLayout(drawerLayout)
                .build();

        MaterialToolbar toolbar = findViewById(R.id.topAppBar);
        NavigationUI.setupWithNavController(toolbar,navController,appBarConfiguration);
        setSupportActionBar(toolbar);




    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.top_app_bar,menu);
        navController.addOnDestinationChangedListener((controller, destination, arguments) -> {
            if(destination.getId() == R.id.shoppingUserHistoryFragment || (destination.getId() == R.id.userAddressFragment)
                    || (destination.getId() == R.id.userProfileFragment)){
                menu.getItem(0).setVisible(false);
            }
            else{
                menu.getItem(0).setVisible(true);
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder().build();
        NavigationUI.navigateUp(navController,appBarConfiguration);
        switch (item.getItemId()){
            case R.id.profile:
                navController.navigate(R.id.userProfileFragment);
                break;
            case R.id.my_directions:
                navController.navigate(R.id.userAddressFragment);
                break;
            case R.id.history:
                navController.navigate(R.id.shoppingUserHistoryFragment);
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}