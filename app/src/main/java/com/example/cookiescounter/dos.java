package com.example.cookiescounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class dos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        WebView miNavegador = findViewById(R.id.navegador);  //Enlazamos variable con elemento xml
        miNavegador.getSettings().setJavaScriptEnabled(true); //Habilitamos uso de JavaScript
        miNavegador.getSettings().setBuiltInZoomControls(true); //Habilitamos propiedad de zoom

        miNavegador.loadUrl("https://animeflv.net/"); //Introducimos la url que deseamos cargar

        miNavegador.setWebViewClient(new WebViewClient() {  //Se establece como cliente webview para abrir las proximas url sobre el mismo vizor
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
    }
}
