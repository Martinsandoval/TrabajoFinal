package com.ejemplo.sandoval.trabajofinal;

import android.content.ClipData;
import android.content.ClipDescription;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ejercicio4 extends MainActivity{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        img4 = (ImageView) findViewById(R.id.img4);
        img5 = (ImageView) findViewById(R.id.img5);
        img6 = (ImageView) findViewById(R.id.img6);

        llenarMap();
        elegirNumeros();

        img1.setImageResource(elegidos.get(0));
        img2.setImageResource(elegidos.get(1));
        img3.setImageResource(elegidos.get(2));
        img4.setImageResource(elegidos.get(3));
        img5.setImageResource(elegidos.get(4));
        img6.setImageResource(elegidos.get(5));

        img1.setTag(IMG_TAG1);
        img2.setTag(IMG_TAG2);
        img3.setTag(IMG_TAG3);
        img4.setTag(IMG_TAG4);
        img5.setTag(IMG_TAG5);
        img6.setTag(IMG_TAG6);

        img1.setOnTouchListener(new MyTouchListener());
        img2.setOnTouchListener(new MyTouchListener());
        img3.setOnTouchListener(new MyTouchListener());
        img4.setOnTouchListener(new MyTouchListener());
        img5.setOnTouchListener(new MyTouchListener());
        img6.setOnTouchListener(new MyTouchListener());


        findViewById(R.id.linear1).setOnDragListener(new MyDragListener(1));
        findViewById(R.id.linear2).setOnDragListener(new MyDragListener(2));
        findViewById(R.id.linear3).setOnDragListener(new MyDragListener(3));
        findViewById(R.id.linear4).setOnDragListener(new MyDragListener(4));
        findViewById(R.id.linear5).setOnDragListener(new MyDragListener(5));
        findViewById(R.id.linear6).setOnDragListener(new MyDragListener(6));

        bien=MediaPlayer.create(this,R.raw.bien);
        error=MediaPlayer.create(this, R.raw.error);

    }


    class MyTouchListener implements View.OnTouchListener{

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            ClipData data = ClipData.newPlainText("simple_text", "text");
            View.DragShadowBuilder sb = new View.DragShadowBuilder(v);
            v.startDrag(data, sb, v, 0);
//            v.setVisibility(View.VISIBLE);
            return true;
        }
    }

    class MyDragListener implements View.OnDragListener{
        private int num;

        public MyDragListener(int num){
            super();
            this.num = num;
        }

        @Override
        public boolean onDrag(View v, DragEvent event) {
            int action = event.getAction();
            switch (action){
                case DragEvent.ACTION_DRAG_STARTED:
                    Log.i("Script", num+"- ACTION_DRAG_STARTED");
                    if(event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)){
                        return true;
                    }
                    return false;
                case DragEvent.ACTION_DRAG_ENTERED:
                    Log.i("Script", num+"- ACTION_DRAG_ENTERED");

                    break;
                case DragEvent.ACTION_DRAG_LOCATION:
                    Log.i("Script", num+"- ACTION_DRAG_LOCATION");
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    Log.i("Script", num+"- ACTION_DRAG_EXITED");

                    break;
                case DragEvent.ACTION_DROP:
                    Integer valor;
                    if(layout==num){
                        View view =(View) event.getLocalState();
                        ViewGroup owner = (ViewGroup) view.getParent();
                        String tag = (String) view.getTag();
                        switch (tag) {
                            case "IMAGE_TAG1":
                                valor = selec.get(1);
                                if(esElMenor(valor)) {
                                    clavesElegidos.remove(valor);
                                    owner.removeView(view);
                                    LinearLayout container = (LinearLayout) v;
                                    container.addView(view);
                                    container.setBackgroundResource(R.drawable.bordes);
                                    view.setVisibility(View.VISIBLE);
                                    layout+=1;
                                    bien.start();
                                }else{
                                    error.start();
                                    View vw =(View) event.getLocalState();
                                    vw.setVisibility(View.VISIBLE);
                                }
                                break;
                            case "IMAGE_TAG2":
                                valor = selec.get(2);
                                if(esElMenor(valor)) {
                                    clavesElegidos.remove(valor);
                                    owner.removeView(view);
                                    LinearLayout container = (LinearLayout) v;
                                    container.addView(view);
                                    container.setBackgroundResource(R.drawable.bordes);
                                    view.setVisibility(View.VISIBLE);
                                    layout+=1;
                                    bien.start();
                                }else{
                                    error.start();
                                    View vw =(View) event.getLocalState();
                                    vw.setVisibility(View.VISIBLE);
                                }
                                break;
                            case "IMAGE_TAG3":
                                valor = selec.get(3);
                                if(esElMenor(valor)) {
                                    clavesElegidos.remove(valor);
                                    owner.removeView(view);
                                    LinearLayout container = (LinearLayout) v;
                                    container.addView(view);
                                    container.setBackgroundResource(R.drawable.bordes);
                                    view.setVisibility(View.VISIBLE);
                                    layout+=1;
                                    bien.start();
                                }else{
                                    error.start();
                                    View vw =(View) event.getLocalState();
                                    vw.setVisibility(View.VISIBLE);
                                }
                                break;
                            case "IMAGE_TAG4":
                                valor = selec.get(4);
                                if(esElMenor(valor)) {
                                    clavesElegidos.remove(valor);
                                    owner.removeView(view);
                                    LinearLayout container = (LinearLayout) v;
                                    container.addView(view);
                                    container.setBackgroundResource(R.drawable.bordes);
                                    view.setVisibility(View.VISIBLE);
                                    layout+=1;
                                    bien.start();
                                }else{
                                    error.start();
                                    View vw =(View) event.getLocalState();
                                    vw.setVisibility(View.VISIBLE);
                                }
                                break;
                            case "IMAGE_TAG5":
                                valor = selec.get(5);
                                if(esElMenor(valor)) {
                                    clavesElegidos.remove(valor);
                                    owner.removeView(view);
                                    LinearLayout container = (LinearLayout) v;
                                    container.addView(view);
                                    container.setBackgroundResource(R.drawable.bordes);
                                    view.setVisibility(View.VISIBLE);
                                    layout+=1;
                                    bien.start();

                                }else{
                                    error.start();
                                    View vw =(View) event.getLocalState();
                                    vw.setVisibility(View.VISIBLE);
                                }
                                break;
                            case "IMAGE_TAG6":
                                valor = selec.get(6);
                                if(esElMenor(valor)) {
                                    clavesElegidos.remove(valor);
                                    owner.removeView(view);
                                    LinearLayout container = (LinearLayout) v;
                                    container.addView(view);
                                    container.setBackgroundResource(R.drawable.bordes);
                                    view.setVisibility(View.VISIBLE);
                                    layout+=1;
                                    bien.start();

                                }else{
                                    error.start();
                                    View vw =(View) event.getLocalState();
                                    vw.setVisibility(View.VISIBLE);
                                }
                                break;
                        }

                    }else{
                        error.start();
                        View view =(View) event.getLocalState();
                        view.setVisibility(View.VISIBLE);
                    }

                case DragEvent.ACTION_DRAG_ENDED:
                    Log.i("Script", num+"- ACTION_DRAG_ENDED");

                    break;

            }

            return false;
        }
    }

//

}

