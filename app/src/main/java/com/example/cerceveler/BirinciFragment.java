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
public class BirinciFragment extends Fragment {
    private Button btn_ikinci_cgit;


    public BirinciFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_birinci, container, false);
        btn_ikinci_cgit=view.findViewById(R.id.button_birinci_cerceve);
        btn_ikinci_cgit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_cerceve,
                                     new IkinciFragment(),null).commit();
            }
        });




        return view;
    }

}
