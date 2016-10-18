package com.ramadan.butterknifedemo;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.img)
    ImageView imgPhoto;
    @BindView(R.id.title)
    TextView tvTitle;
    @BindView(R.id.desc)
    TextView tvDesc;
    @BindView(R.id.displaylist)
    Button btnDisplayList;
    @BindView(R.id.recyclerview)
    RecyclerView rvList;

    @BindDrawable(R.mipmap.ic_launcher)
    Drawable drawable;
    @BindString(R.string.title)
    String title;
    @BindString(R.string.desc)
    String desc;

@BindView(R.id.container)LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


        imgPhoto.setImageDrawable(drawable);
        tvTitle.setText(title);
        tvDesc.setText(desc);


        Data[] array = new Data[5];

        for (int i = 0; i < 5; i++) {

            array[i]=new Data();
            array[i].setTitle("Demo");
            array[i].setResId(R.mipmap.ic_launcher);
        }

        RvAdapter rvAdapter = new RvAdapter(array);
        rvList.setAdapter(rvAdapter);

        rvList.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


    }

    @OnClick(R.id.displaylist)
    public void displayList() {
        Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();
        getSupportFragmentManager().beginTransaction().add(R.id.container,new FragmentA()).commit();
    }
}
