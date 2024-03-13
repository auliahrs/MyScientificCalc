package com.example.myscientificcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, ACBtn, CBtn, opnBracBtn, clsBracBtn, sinBtn, cosBtn, tanBtn, logBtn, lnBtn, facbtn, squareBtn, powFuncBtn, expBtn, ePowNBtn, sqrtBtn, cbrtBtn, NRootBtn, invBtn, divBtn, multiplyBtn, minusBtn, plusBtn, equalbtn, piBtn, dotBtn;
    TextView tvmain, tvsec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        ACBtn = findViewById(R.id.ACBtn);
        CBtn = findViewById(R.id.CBtn);
        opnBracBtn = findViewById(R.id.opnBracBtn);
        clsBracBtn = findViewById(R.id.clsBracBtn);
        sinBtn = findViewById(R.id.sinBtn);
        cosBtn = findViewById(R.id.cosBtn);
        tanBtn = findViewById(R.id.tanBtn);
        logBtn = findViewById(R.id.logBtn);
        lnBtn = findViewById(R.id.lnBtn);
        facbtn = findViewById(R.id.facbtn);
        squareBtn = findViewById(R.id.squareBtn);
        powFuncBtn = findViewById(R.id.powFuncBtn);
        expBtn = findViewById(R.id.expBtn);
        ePowNBtn = findViewById(R.id.ePowNBtn);
        sqrtBtn = findViewById(R.id.sqrtBtn);
        cbrtBtn = findViewById(R.id.cbrtBtn);
        NRootBtn = findViewById(R.id.NRootBtn);
        invBtn = findViewById(R.id.invBtn);
        divBtn = findViewById(R.id.divBtn);
        multiplyBtn = findViewById(R.id.multiplyBtn);
        minusBtn = findViewById(R.id.minusBtn);
        plusBtn = findViewById(R.id.plusBtn);
        equalbtn = findViewById(R.id.equalbtn);
        piBtn = findViewById(R.id.piBtn);
        dotBtn = findViewById(R.id.dotBtn);

        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

    }
}