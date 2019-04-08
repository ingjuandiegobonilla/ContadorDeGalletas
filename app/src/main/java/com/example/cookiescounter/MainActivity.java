package com.example.cookiescounter;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private  int conteo = 0;
    private TextView Tcontar;
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String CONTAR = "conteo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        setContentView(R.layout.activity_main);
        Tcontar = findViewById(R.id.Tcontar);
        Tcontar.setText(String.valueOf(conteo));


        Button Bcontar = findViewById(R.id.Bcontar);
        Bcontar.setOnClickListener(this);

        Button Rcontar = findViewById(R.id.Rcontar);
        Rcontar.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState:");
        outState.putInt(CONTAR, conteo);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {

            case R.id.Bcontar:
                conteo++;
                Tcontar.setText(String.valueOf((conteo)));
                Toast.makeText(this, "Galleta contada", Toast.LENGTH_SHORT).show();
                break;

            case R.id.Rcontar:
                conteo = 0;
                Tcontar.setText(String.valueOf((conteo)));
                Toast.makeText(this, "Reset completado", Toast.LENGTH_SHORT).show();
                break;


        }
    }

}
