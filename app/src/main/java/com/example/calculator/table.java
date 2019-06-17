package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class table extends AppCompatActivity{
    Button btn;
    EditText et;
    TextView num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,res1,res2,res3,res4,res5,res6,res7,res8,res9,res10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        btn = findViewById(R.id.button);
        et = findViewById(R.id.edittext);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        num10 = findViewById(R.id.num10);
        m1 = findViewById(R.id.m1);
        m2 = findViewById(R.id.m2);
        m3 = findViewById(R.id.m3);
        m4 = findViewById(R.id.m4);
        m5 = findViewById(R.id.m5);
        m6 = findViewById(R.id.m6);
        m7 = findViewById(R.id.m7);
        m8 = findViewById(R.id.m8);
        m9 = findViewById(R.id.m9);
        m10 = findViewById(R.id.m10);
        res1 = findViewById(R.id.res1);
        res2 = findViewById(R.id.res2);
        res3 = findViewById(R.id.res3);
        res4 = findViewById(R.id.res4);
        res5 = findViewById(R.id.res5);
        res6 = findViewById(R.id.res6);
        res7 = findViewById(R.id.res7);
        res8 = findViewById(R.id.res8);
        res9 = findViewById(R.id.res9);
        res10 = findViewById(R.id.res10);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num =Integer.parseInt(et.getText().toString());
                num1.setText(""+num);
                num2.setText(""+num);
                num3.setText(""+num);
                num4.setText(""+num);
                num5.setText(""+num);
                num6.setText(""+num);
                num7.setText(""+num);
                num8.setText(""+num);
                num9.setText(""+num);
                num10.setText(""+num);
                m1.setText("1");
                m2.setText("2");
                m3.setText("3");
                m4.setText("4");
                m5.setText("5");
                m6.setText("6");
                m7.setText("7");
                m8.setText("8");
                m9.setText("9");
                m10.setText("10");
                res1.setText(""+num*1);
                res2.setText(""+num*2);
                res3.setText(""+num*3);
                res4.setText(""+num*4);
                res5.setText(""+num*5);
                res6.setText(""+num*6);
                res7.setText(""+num*7);
                res8.setText(""+num*8);
                res9.setText(""+num*9);
                res10.setText(""+num*10);
                Toast.makeText(table.this, "Tabele of "+num, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
