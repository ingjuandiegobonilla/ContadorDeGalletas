package com.example.cookiescounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private  int conteo = 0;
    private TextView Tcontar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tcontar = findViewById(R.id.Tcontar);
        Tcontar.setText(String.valueOf(conteo));

        Button Bcontar = findViewById(R.id.Bcontar);
        Bcontar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        conteo ++;
        Tcontar.setText(String.valueOf((conteo)));
        Toast.makeText(this, "Galletas!!!", Toast.LENGTH_SHORT).show();

    }

}
