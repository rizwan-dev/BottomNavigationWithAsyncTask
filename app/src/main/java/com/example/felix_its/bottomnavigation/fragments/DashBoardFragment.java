package com.example.felix_its.bottomnavigation.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.felix_its.bottomnavigation.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DashBoardFragment extends Fragment {


    public DashBoardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dash_board, container, false);
        // Inflate the layout for this fragment
        return view;
    }

}
