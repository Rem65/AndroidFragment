package com.example.vatan.fragment1;

import android.app.Activity;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;


/**
 * Created by vatan on 10.03.2017.
 */

public class BirinciFragment extends Fragment implements SeekBar.OnSeekBarChangeListener {


    private static int seekvalue = 10; //Seekbar değerini 10 olarak belirliyoruz.
    private static EditText edittext;
    ToolbarListener activityCallBack;

    public interface ToolbarListener {
        public void onButtonClick(int position, String text);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCallBack = (ToolbarListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " ToolbarListener'a implement edilmeli!");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Fragment içi düzenin oluşturulduğu alan

        View view = inflater.inflate(R.layout.birincifragment, container, false);

        edittext = (EditText) view.findViewById(R.id.fragmentedittext);
        final SeekBar seekbar =
                (SeekBar) view.findViewById(R.id.fragmentseekbar);

        seekbar.setOnSeekBarChangeListener(this);

        final Button button =
                (Button) view.findViewById(R.id.fragmentbutton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonClicked(v);
            }
        });

        return view;
    }

    //Oluşturduğumuz butona tıklandığında edittext'teki yazıyı çağırıyor ve seekvalue değerini callback ediyoruz.
    public void buttonClicked(View view) {
        activityCallBack.onButtonClick(seekvalue,
                edittext.getText().toString());

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress,
                                  boolean fromUser) {
        seekvalue = progress;
    }

    @Override
    public void onStartTrackingTouch(SeekBar arg0) {
// Seekbar işlem başı görevleri(www.cagrikacmaz.com)
    }

    @Override
    public void onStopTrackingTouch(SeekBar arg0) {
// Seekbar işlem sonu görevleri(www.cagrikacmaz.com) } }


    }
}
