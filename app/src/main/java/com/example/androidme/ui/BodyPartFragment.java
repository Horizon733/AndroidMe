package com.example.androidme.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.androidme.data.AndroidImageAssets;


public class BodyPartFragment extends Fragment {
    public BodyPartFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_body_part,container,false);
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));
        return rootView;
    }
}
