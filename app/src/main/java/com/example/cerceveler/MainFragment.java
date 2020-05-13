package com.example.cerceveler;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    private Button btn_ilk_cgit;



    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view=inflater.inflate(R.layout.fragment_main, container, false);
         btn_ilk_cgit=view.findViewById(R.id.button_main_cerceve);

         btn_ilk_cgit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_cerceve,
                                   new BirinciFragment(),null).commit();
             }
         });

         return view;
    }

}
