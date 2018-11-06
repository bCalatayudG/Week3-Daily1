package com.example.consultants.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.consultants.fragments.fragment.MyPreferenceFragment;


public class Preferences extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        MyPreferenceFragment myPreferenceFragment = new MyPreferenceFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.actPreferences, myPreferenceFragment)
                .commit();
    }
}
