package com.example.f19.fuadmzapps;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.f19.fuadmzapps.R;

public class FragmentGallery extends Fragment {

    View v;
    public FragmentGallery() {
    }


    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater, @Nullable ViewGroup container,  Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.gallery_fragment,container,false);
        return v;
    }
}

