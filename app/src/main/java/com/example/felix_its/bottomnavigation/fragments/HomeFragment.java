package com.example.felix_its.bottomnavigation.fragments;


import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.felix_its.bottomnavigation.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    Button btnStart;

    TextView txtMessage;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        btnStart = view.findViewById(R.id.btnStart);
        txtMessage = view.findViewById(R.id.txtMessage);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Some message", Toast.LENGTH_LONG).show();
                new MyFilesTask().execute();
            }
        });

        return view;
    }

    private  class MyFilesTask extends AsyncTask<String, Integer, String>{

        ProgressDialog dialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            dialog = new ProgressDialog(getActivity());
            dialog.setMessage("Doing something, please wait.");
            dialog.show();
        }

        @Override
        protected String doInBackground(String... strings) {
            for(int i =0; i<3000;i++){
                System.out.println("Number print "+i);
            }

            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
        }
    }



}
