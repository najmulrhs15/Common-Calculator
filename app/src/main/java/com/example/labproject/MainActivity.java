package com.example.labproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    EditText n2;
    TextView Tv;
    Button r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.Edt);
        n2=findViewById(R.id.Edt1);
        Tv=findViewById(R.id.tv);
        r1=findViewById(R.id.btn);
        r2=findViewById(R.id.btn1);
        r3=findViewById(R.id.btn2);
        r4=findViewById(R.id.btn3);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double value1 =  new Double(n1.getText().toString());
                Double value2 = new Double (n2.getText().toString());

                Double add=value1+value2;
                Tv.setText(add.toString());
            }

        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double value1 =  new Double(n1.getText().toString());
                Double value2 = new Double(n2.getText().toString());

                Double add=value1-value2;
                Tv.setText(add.toString());
            }

        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double value1 = new Double(n1.getText().toString());
                Double value2 = new Double(n2.getText().toString());

                Double add=value1*value2;
                Tv.setText(add.toString());
            }

        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double value1 =  new Double(n1.getText().toString());
                Double value2 = new Double(n2.getText().toString());

                Double add=value1/value2;
                Tv.setText(add.toString());
            }

        });
}
}
