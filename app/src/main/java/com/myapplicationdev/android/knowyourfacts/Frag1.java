package com.myapplicationdev.android.knowyourfacts;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag1 extends Fragment {
    Button btnColor;
    LinearLayout bg;

    public Frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_1, container, false);
       btnColor = view.findViewById(R.id.btnColor);
       bg = view.findViewById(R.id.bg);

       btnColor.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Random rnd = new Random();
               int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
               bg.setBackgroundColor(color);
           }
       });
        return view;
    }


}
