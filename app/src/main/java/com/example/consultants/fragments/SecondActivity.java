package com.example.consultants.fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.consultants.fragments.controller.MainController;
import com.example.consultants.fragments.fragment.BottomFragment;

public class SecondActivity extends AppCompatActivity {

    EditText etName;
    EditText etAge;
    EditText etGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        etGender = findViewById(R.id.etGender);

    }

    public void onAddPerson(View view) {
        MainController.getInstance().addPersonToList(etName.getText().toString(),
                etAge.getText().toString(),etGender.getText().toString());
        BottomFragment bottomFragment = (BottomFragment) getSupportFragmentManager().findFragmentById(R.id.bottomFrag);
        bottomFragment.refreshList();
        Toast.makeText(this,"Person Added",Toast.LENGTH_SHORT).show();

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
