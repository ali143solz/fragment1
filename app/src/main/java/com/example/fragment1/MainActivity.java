package com.example.fragment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myfragmentc myfragmentc=new myfragmentc();
        FragmentManager manager=getSupportFragmentManager();//obj ko support krwa rhy hai
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.fram,myfragmentc,"mi");
        transaction.commit();
    }
}