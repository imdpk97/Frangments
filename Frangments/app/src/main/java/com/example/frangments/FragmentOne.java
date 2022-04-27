package com.example.frangments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentOne extends Fragment {

    String value;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


//        value = (String) getArguments().getString("YourKey");
        //Toast.makeText(getContext(),value,Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_one, container, false);
    }
}