package com.example.consultants.fragments;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

import com.example.consultants.fragments.fragment.DialogFragmentExample;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements DialogFragmentExample.OnFragmentInteractionListener{

    Button btnShowDialog;
    FragmentManager fm =  getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowDialog = findViewById(R.id.btnShowDialog);

        btnShowDialog.setOnClickListener(getDialog_fragment());
    }

    @NonNull
    private OnClickListener getDialog_fragment() {
        return new OnClickListener() {
            public void onClick(View arg0) {
                final DialogFragmentExample dFragment = new DialogFragmentExample();
                // Show DialogFragment

                dFragment.show(fm, "Dialog Fragment");

                final Timer t = new Timer();
                t.schedule(new TimerTask() {
                    public void run() {
                        dFragment.dismiss();
                        t.cancel();
                    }
                }, 3000);

            }
        };
    }

    public void onSecondActivity(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.menuPreferences){
            Intent intent = new Intent(getApplicationContext(), Preferences.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
