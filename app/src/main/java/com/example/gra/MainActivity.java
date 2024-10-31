package com.example.gra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ImageView> listaWidokowJablka = new ArrayList<>();
    CountDownTimer countDownTimer;
    TextView textView;
    int czas = 1000*10;
    int licznik = 0;
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
        odliczanieCzasu();
    }

    private void odliczanieCzasu(){
        countDownTimer = countDownTimer = new CountDownTimer(czas, 1000) {
            @Override
            public void onTick(long l) {
                ukryjJablka();
                pokazLosoweJablkow();
                czas = (int) l;
            }

            @Override
            public void onFinish() {

            }
        };
        countDownTimer.start();
    }

    private void pokazLosoweJablkow(){
        int losowa = (int) (Math.random()*9);
        listaWidokowJablka.get(losowa).setVisibility(View.VISIBLE);
        textView = findViewById(R.id.TextViewPunkty);
        listaWidokowJablka.get(losowa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                licznik++;
                view.setVisibility(View.INVISIBLE);
                pokazLosoweJablkow();
                textView.setText(licznik+" Trafionych");

            }
        });
    }

    private void ukryjJablka(){
        for (int i = 0; i < listaWidokowJablka.size(); i++) {
            listaWidokowJablka.get(i).setVisibility(View.INVISIBLE);
        }
    }

}