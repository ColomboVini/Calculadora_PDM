package com.example.app1form3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import static java.lang.Math.log;
import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {

    private EditText edvlr1;
    private EditText edvlr2;
    private EditText edvlr3;
    private Button btSoma;
    private Button btSub;
    private Button btRaiz;
    private Button btPot;
    private Button btLog;
    private Button btGra;
    private Button btRec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edvlr1 = (EditText) findViewById(R.id.edtvlr1);
        edvlr2 = (EditText) findViewById(R.id.edtvlr2);
        edvlr3 = (EditText) findViewById(R.id.edtvlr3);
        btSoma = (Button) findViewById(R.id.btsoma);
        btSub = (Button) findViewById(R.id.btsub);
        btRaiz = (Button) findViewById(R.id.btraiz);
        btPot = (Button) findViewById(R.id.btpot);
        btLog = (Button) findViewById(R.id.btlog);
        btGra = (Button) findViewById(R.id.btgra);
        btRec = (Button) findViewById(R.id.btrec);

        final double[] valor_guardado = new double[1];

        btSoma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double vlr1 = Double.parseDouble(edvlr1.getText().toString());
                double vlr2 = Double.parseDouble(edvlr2.getText().toString());
                double resultado = vlr1 + vlr2;
                edvlr3.setText("" + resultado);
            }
        });
        btSub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double vlr1 = Double.parseDouble(edvlr1.getText().toString());
                double vlr2 = Double.parseDouble(edvlr2.getText().toString());
                double resultado = vlr1 - vlr2;
                edvlr3.setText("" + resultado);
            }
        });
        btRaiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double vlr1 = Double.parseDouble(edvlr1.getText().toString());
                double resultado = sqrt(vlr1);
                edvlr3.setText("" + resultado);
            }
        });
        btPot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double vlr1 = Double.parseDouble(edvlr1.getText().toString());
                double vlr2 = Double.parseDouble(edvlr2.getText().toString());
                double resultado = Math.pow(vlr1, vlr2);
                edvlr3.setText("" + resultado);
            }
        });
        btLog.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double vlr1 = Double.parseDouble(edvlr1.getText().toString());
                double resultado = log(vlr1);
                edvlr3.setText("" + resultado);
            }
        });
        btGra.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                valor_guardado[0] = Double.parseDouble(edvlr3.getText().toString());
            }
        });
        btRec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double recupera_valor = valor_guardado[0];
                edvlr3.setText("" + recupera_valor);
            }
        });
    }
}