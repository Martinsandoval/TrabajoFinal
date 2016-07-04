package com.ejemplo.sandova.trabajofinal.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.ejemplo.sandoval.trabajofinal.R;

/**
 * Created by Sandoval on 02/07/2016.
 */
public class Configuracion extends Fragment implements AdapterView.OnItemSelectedListener {
    View myView;
    int maxOrdenar;
    int minOrdenar;
    Spinner spinnerMin;
    Spinner spinnerMax;
    Button guardar;
    ArrayAdapter<Integer> aaOrdenar;
    Integer[] numeros = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.configuracion, container, false);
        guardar = (Button) myView.findViewById(R.id.guardar);
        spinnerMin = (Spinner) myView.findViewById(R.id.spinnerMin);
        spinnerMax = (Spinner) myView.findViewById(R.id.spinnerMax);
        aaOrdenar = new ArrayAdapter<Integer>(getActivity(), android.R.layout.simple_spinner_item, numeros);
        spinnerMax.setAdapter(aaOrdenar);
        spinnerMin.setAdapter(aaOrdenar);

        spinnerMin.setOnItemSelectedListener(this);
        spinnerMax.setOnItemSelectedListener(this);

        return myView;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.spinnerMin:
                minOrdenar = (Integer) spinnerMin.getSelectedItem();
                break;
            case R.id.spinnerMax:
                maxOrdenar = (Integer) spinnerMax.getSelectedItem();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
