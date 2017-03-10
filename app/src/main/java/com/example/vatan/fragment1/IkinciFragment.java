package com.example.vatan.fragment1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by vatan on 10.03.2017.
 */

public class IkinciFragment extends Fragment {
    private static TextView textView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.ikincifragment, container, false);
         textView = (TextView) view.findViewById(R.id.ikincifragmenttext);
        return view;
    }

    public void changeTextProperties(int fontsize, String text)
    {
        textView.setTextSize(fontsize);
        textView.setText(text); //Renk ve Font değişimi girdilerini oluşturuyoruz.(www.cagrikacmaz.com)
    }
}
