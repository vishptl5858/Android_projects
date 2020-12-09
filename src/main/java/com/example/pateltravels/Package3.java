package com.example.pateltravels;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import static com.example.pateltravels.ListViewFix.setListViewHeightBasedOnChildren;


public class Package3 extends Fragment {

    private ListView listView;
    private TextView animatedText;
    private String x = ">         ";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.package3, container, false);

        animatedText = (TextView) view.findViewById(R.id.animatedText);
        listView = (ListView) view.findViewById(R.id.listView);
        setListViewHeightBasedOnChildren(listView);

        final Handler handler = new Handler();

        final Runnable r = new Runnable() {
            public void run() {
                animatedText.setText(x);
                x = x.substring(9) + x.substring(0,9);
                handler.postDelayed(this, 100);
            }
        };

        handler.postDelayed(r, 100);

        return view;
    }
}