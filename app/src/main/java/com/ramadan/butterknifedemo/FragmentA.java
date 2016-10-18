package com.ramadan.butterknifedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Mahmoud Ramadan on 10/18/16.
 */
public class FragmentA extends Fragment {
    @BindView(R.id.iphoto)
    ImageView img;
    @BindView(R.id.iText)
    TextView text;

    private Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

      View view=  inflater.inflate(R.layout.fragmenta,container,false);

      unbinder=  ButterKnife.bind(this,view);

       img.setImageResource(R.mipmap.ic_launcher);
        text.setText("Fragment");

        return view;


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        unbinder.unbind();
    }
}
