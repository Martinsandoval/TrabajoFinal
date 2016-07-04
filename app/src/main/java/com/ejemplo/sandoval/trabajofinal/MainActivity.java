package com.ejemplo.sandoval.trabajofinal;

import android.app.Fragment;
import android.media.MediaPlayer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public abstract class MainActivity extends AppCompatActivity{
    HashMap<Integer, Integer> mapNumeros=new HashMap<Integer, Integer>();
    HashMap<Integer, Integer> selec=new HashMap<Integer, Integer>();
    ArrayList<Integer>elegidos=new ArrayList<>();
    ArrayList<Integer>clavesElegidos=new ArrayList<>();
    Integer max = 20;
    Random random;
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;

    MediaPlayer bien;
    MediaPlayer error;

    static String IMG_TAG1 = "IMAGE_TAG1";
    static String IMG_TAG2 = "IMAGE_TAG2";
    static String IMG_TAG3 = "IMAGE_TAG3";
    static String IMG_TAG4 = "IMAGE_TAG4";
    static String IMG_TAG5 = "IMAGE_TAG5";
    static String IMG_TAG6 = "IMAGE_TAG6";

    int layout = 1;

    public void llenarMap(){
        mapNumeros.put(1, R.drawable.ic_numero1);
        mapNumeros.put(2, R.drawable.ic_numero2);
        mapNumeros.put(3, R.drawable.ic_numero3);
        mapNumeros.put(4, R.drawable.ic_numero4);
        mapNumeros.put(5, R.drawable.ic_numero5);
        mapNumeros.put(6, R.drawable.ic_numero6);
        mapNumeros.put(7, R.drawable.ic_numero7);
        mapNumeros.put(8, R.drawable.ic_numero8);
        mapNumeros.put(9, R.drawable.ic_numero9);
        mapNumeros.put(10, R.drawable.ic_numero10);
    }

    public void elegirNumeros(){
        random = new Random();
        int i = 1;
        while(i<7){
            int n = random.nextInt(10)+1; //Numero aleatorio entre 1 y 10
            if(!elegidos.contains(mapNumeros.get(n))){
                elegidos.add(mapNumeros.get(n));
                clavesElegidos.add(n);
                selec.put(i, n);
                i+=1;
            }
        }
    }

    public boolean esElMenor(int numero){
        boolean menor = true;
        for(int n: clavesElegidos){
            if(n<numero){
                menor = false;
            }
        }
        return menor;
    }



}
