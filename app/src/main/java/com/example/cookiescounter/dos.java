package com.example.cookiescounter;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

public class dos extends AppCompatActivity implements View.OnClickListener {

    int movil;
    ImageView seleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        ImageView r1 = findViewById(R.id.r1);
        ImageView r2 = findViewById(R.id.r2);
        ImageView r3 = findViewById(R.id.r3);
        ImageView r4 = findViewById(R.id.r4);
        ImageView r5 = findViewById(R.id.r5);
        seleccion = findViewById(R.id.imageView);
        Button wallpaper = findViewById(R.id.wallpaper);

        r1.setOnClickListener(this);
        r2.setOnClickListener(this);
        r3.setOnClickListener(this);
        r4.setOnClickListener(this);
        r5.setOnClickListener(this);
        wallpaper.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.r1:
                seleccion.setImageResource(R.drawable.r1);
                movil = R.drawable.r1;
                break;
            case R.id.r2:
                seleccion.setImageResource(R.drawable.r2);
                movil = R.drawable.r2;
                break;
            case R.id.r3:
                seleccion.setImageResource(R.drawable.r3);
                movil = R.drawable.r3;
                break;
            case R.id.r4:
                seleccion.setImageResource(R.drawable.r4);
                movil = R.drawable.r4;
                break;
            case R.id.r5:
                seleccion.setImageResource(R.drawable.r5);
                movil = R.drawable.r5;
                break;
            case R.id.wallpaper:
                Bitmap fondo = BitmapFactory.decodeStream(getResources().openRawResource(movil));
                WallpaperManager myWallpaperManager = WallpaperManager.getInstance(getApplicationContext());
                try {
                    myWallpaperManager.setBitmap(fondo);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            default:
                break;


        }

    }
}
