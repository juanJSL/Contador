package com.hlc.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    private double contador = 1;
    private TextView texto;

    @Override
    protected void onCreate(Bundle estado) {
        super.onCreate(estado);
        setContentView(R.layout.activity_main);
        texto = (TextView) findViewById (R.id.text);
        texto.setText (String.valueOf (contador));
    }

    // duplica el valor del contador y lo guarda en la etiqueta texto
    public void duplica (View view) {
        contador = contador * 2;
        texto.setText(String.valueOf(contador));
    }
}
