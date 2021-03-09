package com.example.fragment1;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class myfragmentc extends Fragment
{
    @Nullable
    @Override  //inflater is file ko ap ki main xml file k upr show kr dy ga
    //viewGroup edittext wgra wgra
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

         View view= inflater.inflate(R.layout.my_activity,container,false);
         return view;
    }
}
