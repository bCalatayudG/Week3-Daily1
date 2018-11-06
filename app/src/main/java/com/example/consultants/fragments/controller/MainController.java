package com.example.consultants.fragments.controller;

import android.widget.Toast;

import com.example.consultants.fragments.model.Person;

import java.util.ArrayList;

public class MainController {
    public static MainController instance;
    private ArrayList<Person> personArrayList;

    public MainController() {
        this.personArrayList = new ArrayList<>();
    }

    public static MainController getInstance() {
        if (instance == null) {
            instance = new MainController();
        }
        return instance;
    }

    public void addPersonToList(String name, String age, String gender) {
        Person person = new Person(name, age, gender);
        personArrayList.add(person);
    }

    public ArrayList<Person> getPersonArrayList() {
        return personArrayList;
    }
}
