package com.example.gra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ImageView> listaWidokowJablka = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaWidokowJablka.add(findViewById(R.id.imageView));
        listaWidokowJablka.add(findViewById(R.id.imageView2));
        listaWidokowJablka.add(findViewById(R.id.imageView3));
        listaWidokowJablka.add(findViewById(R.id.imageView4));
        listaWidokowJablka.add(findViewById(R.id.imageView5));
        listaWidokowJablka.add(findViewById(R.id.imageView6));
        listaWidokowJablka.add(findViewById(R.id.imageView7));
        listaWidokowJablka.add(findViewById(R.id.imageView8));
        listaWidokowJablka.add(findViewById(R.id.imageView9));
        ukryjJablka();
        pokazLosoweJablkow();
    }

    private void pokazLosoweJablkow(){
        int losowa = (int) (Math.random()*9);
        listaWidokowJablka.get(losowa).setVisibility(View.VISIBLE);
    }

    private void ukryjJablka(){
        for (int i = 0; i < listaWidokowJablka.size(); i++) {
            listaWidokowJablka.get(i).setVisibility(View.INVISIBLE);
        }
    }

}