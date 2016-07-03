package com.ejemplo.sandova.trabajofinal.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ejemplo.sandoval.trabajofinal.R;

/**
 * Created by Sandoval on 02/07/2016.
 */
public class Configuracion extends Fragment {
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView= inflater.inflate(R.layout.configuracion, container, false);
        return myView;
    }
}
