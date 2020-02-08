package com.gazel.tabview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    CustomAdapter customAdapter;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        customAdapter = new CustomAdapter(getSupportFragmentManager());
        tabLayout = findViewById(R.id.tabLayout);

        viewPager.setAdapter(customAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
