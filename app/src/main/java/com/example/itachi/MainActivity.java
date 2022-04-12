package com.example.itachi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnClear, btnPlusMinus;
    TextView tv_san;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnClear = findViewById(R.id.btnClear);
        btnPlusMinus = findViewById(R.id.btnPlusMinus);

        tv_san = findViewById(R.id.tv_san);

        View.OnClickListener buttonSandar = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aldingiSan = tv_san.getText().toString();
                String baasilganSan = "";
                String songiResult = "";

                switch (view.getId()){
                    case R.id.btn0:
                        baasilganSan = "0";
                        break;
                    case R.id.btn1:
                        baasilganSan = "1";
                        break;
                    case R.id.btn2:
                        baasilganSan = "2";
                        break;
                    case R.id.btn3:
                        baasilganSan = "3";
                        break;
                    case R.id.btn4:
                        baasilganSan = "4";
                        break;
                    case R.id.btn5:
                        baasilganSan = "5";
                        break;
                    case R.id.btn6:
                        baasilganSan = "6";
                        break;
                    case R.id.btn7:
                        baasilganSan = "7";
                        break;
                    case R.id.btn8:
                        baasilganSan = "8";
                        break;
                    case R.id.btn9:
                        baasilganSan = "9";
                        break;
                }
                if(!aldingiSan.equals("0")) songiResult = aldingiSan + baasilganSan;
                else songiResult = baasilganSan;
                tv_san.setText(songiResult);
            }
        };
        btn0.setOnClickListener(buttonSandar);
        btn1.setOnClickListener(buttonSandar);
        btn2.setOnClickListener(buttonSandar);
        btn3.setOnClickListener(buttonSandar);
        btn4.setOnClickListener(buttonSandar);
        btn5.setOnClickListener(buttonSandar);
        btn6.setOnClickListener(buttonSandar);
        btn7.setOnClickListener(buttonSandar);
        btn8.setOnClickListener(buttonSandar);
        btn9.setOnClickListener(buttonSandar);

        View.OnClickListener buttonOshiruPlusMinus = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_san.setText("0");
                switch (view.getId()){
                    case R.id.btnClear:
                        tv_san.setText("0");
                        break;
                    case R.id.btnPlusMinus:
                        String sanText = tv_san.getText().toString();
                        int san = Integer.parseInt(sanText);

                        if(san > 0) tv_san.setText("-"+sanText);
                        else {
                            san = san * (-1);
                            tv_san.setText("" + san);
                        };
                        break;
                }
            }
        };
        btnClear.setOnClickListener(buttonOshiruPlusMinus);
        btnPlusMinus.setOnClickListener(buttonOshiruPlusMinus);
    }
}