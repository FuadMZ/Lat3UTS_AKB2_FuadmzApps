package com.example.f19.fuadmzapps;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.f19.fuadmzapps.Model.ModelHome;
import com.example.f19.fuadmzapps.Presenter.PresesnterHomeImplement;
import com.example.f19.fuadmzapps.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentHome extends android.support.v4.app.Fragment {

    View v;


    public FragmentHome() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.home_fragment,container,false);
        return v;
    }
}
