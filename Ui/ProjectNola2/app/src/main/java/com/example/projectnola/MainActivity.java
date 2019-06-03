package com.example.projectnola;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.example.ProjectNola2.R;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {




    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState ){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val toolbar: Toolbar=findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)


        DrawerLayout drlay = findViewById(R.id.content_main);
        tog = ActionBarDrawerToggle(this, drlay, toolbar,  R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drlay.addDrawerListener(tog)


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        }
        NavigationView navv = findViewById(R.id.nav_header);
                navv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        return true;
                    }
                });

                }

   @Override


}

