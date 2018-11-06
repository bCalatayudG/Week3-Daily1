package com.example.consultants.fragments.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.consultants.fragments.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DialogFragmentExample extends DialogFragment {

    public static final String TAG = DialogFragmentExample.class.getSimpleName() + "_TAG";

    public DialogFragmentExample() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        getDialog().setTitle("DialogFragment Tutorial");
        View rootView = inflater.inflate(R.layout.fragment_dialog, container,
                false);

        return rootView;

    }

    public void show(DialogFragmentExample fm, String dialog_fragment) {
    }

    public interface OnFragmentInteractionListener {
    }
}
