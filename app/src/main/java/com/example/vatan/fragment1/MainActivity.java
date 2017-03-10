package com.example.vatan.fragment1;

import android.support.v4.app.FragmentActivity;

import android.os.Bundle;

public class MainActivity extends FragmentActivity implements BirinciFragment.ToolbarListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(int fontsize, String text) {


           IkinciFragment ikinciFragment = (IkinciFragment) getSupportFragmentManager().findFragmentById(R.id.ikinci_fragment);


        ikinciFragment.changeTextProperties(fontsize, text);
        }
    }


