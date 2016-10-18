package com.ramadan.butterknifedemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Mahmoud Ramadan on 10/18/16.
 */
public class viewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.iphoto)
    ImageView img;
    @BindView(R.id.iText)
    TextView text;

    public viewHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this,itemView);


    }
}
