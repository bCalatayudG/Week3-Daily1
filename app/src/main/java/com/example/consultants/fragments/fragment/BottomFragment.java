package com.example.consultants.fragments.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

import com.example.consultants.fragments.controller.MainController;
import com.example.consultants.fragments.model.Person;

import java.util.ArrayList;

public class BottomFragment extends ListFragment {
    private ArrayAdapter<Person> personArrayAdapter;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayList<Person> personArrayList = MainController.getInstance().getPersonArrayList();
        personArrayAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, personArrayList);
        setListAdapter(personArrayAdapter);
    }

    public void refreshList(){
        personArrayAdapter.notifyDataSetChanged();
    }
}
