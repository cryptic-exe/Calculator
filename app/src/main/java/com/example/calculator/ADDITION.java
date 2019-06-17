package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ADDITION extends AppCompatActivity {

    Button btn;
    TextView txt;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additon);
        btn = findViewById(R.id.addBtn);
        et1 = findViewById(R.id.editText1);
        et2 = findViewById(R.id.editText2);
        txt = findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(et1.getText().toString());
                int num2 = Integer.parseInt(et2.getText().toString());
                int sum = num1+num2;
                txt.setText(""+sum);
                Toast.makeText(ADDITION.this, "Added", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
