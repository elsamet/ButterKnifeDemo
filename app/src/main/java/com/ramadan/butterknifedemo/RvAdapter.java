package com.ramadan.butterknifedemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Mahmoud Ramadan on 10/18/16.
 */
public class RvAdapter extends RecyclerView.Adapter<viewHolder> {

    private Data[]data;
    public RvAdapter(Data[]data){
        this.data=data;
    }
    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView=LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);

        return new viewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(viewHolder holder, int position) {

        Data d=data[position];
        holder.text.setText(d.getTitle());
        holder.img.setImageResource(d.getResId());

    }

    @Override
    public int getItemCount() {
        return data.length;
    }
}
