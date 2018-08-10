package com.example.kalpeshsoni.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28;
    double a,b,c;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText2);

        b1 = findViewById(R.id.button7);
        b2 = findViewById(R.id.button8);
        b3 = findViewById(R.id.button9);
        b4 = findViewById(R.id.button10);
        b5 = findViewById(R.id.button11);
        b6 = findViewById(R.id.button12);
        b7 = findViewById(R.id.button13);
        b8 = findViewById(R.id.button14);
        b9 = findViewById(R.id.button16);
        b10 = findViewById(R.id.button17);
        b11 = findViewById(R.id.button18);
        b12 = findViewById(R.id.button19);
        b13 = findViewById(R.id.button20);
        b14 = findViewById(R.id.button21);
        b15 = findViewById(R.id.button22);
        b16 = findViewById(R.id.button23);
        b17 = findViewById(R.id.button24);
        b18 = findViewById(R.id.button25);
        b19 = findViewById(R.id.button26);
        b20 = findViewById(R.id.button27);
        b21 = findViewById(R.id.button28);
        b22 = findViewById(R.id.button29);
        b23 = findViewById(R.id.button38);
        b24 = findViewById(R.id.button33);
        b25 = findViewById(R.id.button34);
        b26 = findViewById(R.id.button35);
        b27 = findViewById(R.id.button36);
        b28 = findViewById(R.id.button37);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(e1.getText().length()==0 && e2.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter values",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    b = Double.parseDouble(e2.getText().toString());
                    c = a + b;
                    Toast.makeText(getApplicationContext(), "Addition is:" +c, Toast.LENGTH_SHORT).show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(e1.getText().length()==0 && e2.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter values",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    b = Double.parseDouble(e2.getText().toString());
                    c = a - b;
                    Toast.makeText(getApplicationContext(), "Subtraction is:" +c, Toast.LENGTH_SHORT).show();
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (e1.getText().length()==0 && e2.getText().length()==0) {
                    Toast.makeText(getApplicationContext(), "Please Enter values", Toast.LENGTH_SHORT).show();
                } else {
                    a = Double.parseDouble(e1.getText().toString());
                    b = Double.parseDouble(e2.getText().toString());
                    c = a * b;
                    Toast.makeText(getApplicationContext(), "Multiplication is:" +c, Toast.LENGTH_SHORT).show();
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(e1.getText().length()==0 && e2.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter values",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    b = Double.parseDouble(e2.getText().toString());
                    c = a / b;
                    Toast.makeText(getApplicationContext(), "Division is:" +c, Toast.LENGTH_SHORT).show();
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    double f = 1;
                    int i;
                    for (i = 1; i < a; i++) {
                        f = f * i;
                    }
                    Toast.makeText(getApplicationContext(), "Factorial is:"+f, Toast.LENGTH_SHORT).show();
                }
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double sin;
                double d;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    d = Math.toRadians(a);
                    sin = Math.sin(d);
                    Toast.makeText(getApplicationContext(), "Sin value is:"+sin, Toast.LENGTH_SHORT).show();
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double cos;
                double d;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    d = Math.toRadians(a);
                    cos = Math.cos(d);
                    Toast.makeText(getApplicationContext(), "Cos value is:"+cos, Toast.LENGTH_SHORT).show();
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double tan;
                double d;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    d = Math.toRadians(a);
                    tan = Math.tan(d);
                    Toast.makeText(getApplicationContext(), "Tan value is:" + tan, Toast.LENGTH_SHORT).show();
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double pow;
                if(e1.getText().length()==0 && e2.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    b = Double.parseDouble(e2.getText().toString());
                    pow = Math.pow(a, b);
                    Toast.makeText(getApplicationContext(), "Power is:"+pow, Toast.LENGTH_SHORT).show();
                }
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double log;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    log = Math.log(a);
                    Toast.makeText(getApplicationContext(), "Log value is:"+log, Toast.LENGTH_SHORT).show();
                }
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double ceil;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    ceil = Math.ceil(a);
                    Toast.makeText(getApplicationContext(), "Ceil value is:" + ceil, Toast.LENGTH_SHORT).show();
                }
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double abs;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    abs = Math.abs(a);
                    Toast.makeText(getApplicationContext(), "Absolute value is:" + abs, Toast.LENGTH_SHORT).show();
                }
            }
        });


        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double round;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    round = Math.round(a);
                    Toast.makeText(getApplicationContext(), "Round value is:" + round, Toast.LENGTH_SHORT).show();
                }

            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double sqrt;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    sqrt = Math.sqrt(a);
                    Toast.makeText(getApplicationContext(), "Square root is:" + sqrt, Toast.LENGTH_SHORT).show();
                }

            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double cbrt;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    cbrt = Math.cbrt(a);
                    Toast.makeText(getApplicationContext(), "Cube root is:" + cbrt, Toast.LENGTH_SHORT).show();
                }
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double exp;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    exp = Math.exp(a);
                    Toast.makeText(getApplicationContext(), "Exponant is:" + exp, Toast.LENGTH_SHORT).show();
                }

            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double expm;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    expm = Math.expm1(a);
                    Toast.makeText(getApplicationContext(), "Exponant to raise e is:" + expm, Toast.LENGTH_SHORT).show();
                }

            }
        });

        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double floor;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    floor = Math.floor(a);
                    Toast.makeText(getApplicationContext(), "Floor value is:" + floor, Toast.LENGTH_SHORT).show();
                }

            }
        });

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double log10;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    log10 = Math.log10(a);
                    Toast.makeText(getApplicationContext(), "Log value in base 10 is:" + log10, Toast.LENGTH_SHORT).show();
                }

            }
        });

        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double hypot;
                if(e1.getText().length()==0 && e2.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter values",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    b = Double.parseDouble(e2.getText().toString());
                    hypot = Math.hypot(a, b);
                    Toast.makeText(getApplicationContext(), "Hypot value is:" + hypot, Toast.LENGTH_SHORT).show();
                }

            }
        });

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double sqr;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    sqr = a * a;
                    Toast.makeText(getApplicationContext(), "Square is:" + sqr, Toast.LENGTH_SHORT).show();
                }

            }
        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double cub,cub1;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    cub = a * a;
                    cub1 = cub * a;
                    Toast.makeText(getApplicationContext(), "Cube is:" + cub1, Toast.LENGTH_SHORT).show();
                }

            }
        });

        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double atan2;
                if(e1.getText().length()==0 && e2.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    b = Double.parseDouble(e2.getText().toString());
                    atan2 = Math.atan2(a, b);
                    Toast.makeText(getApplicationContext(), "Theta is:" + atan2, Toast.LENGTH_SHORT).show();
                }
            }
        });

        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double asin;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    asin = Math.asin(a);
                    Toast.makeText(getApplicationContext(), "Sin Inverse is:"+asin, Toast.LENGTH_SHORT).show();
                }
            }
        });

        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double rad;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    rad = Math.toRadians(a);
                    Toast.makeText(getApplicationContext(), "Value in Radius is:" +rad, Toast.LENGTH_SHORT).show();
                }
            }
        });

        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double deg;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    deg = Math.toDegrees(a);
                    Toast.makeText(getApplicationContext(), "Value in Degree is:" +deg, Toast.LENGTH_SHORT).show();
                }
            }
        });

        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double acos;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    acos = Math.acos(a);
                    Toast.makeText(getApplicationContext(), "Cos Inverse is:"+acos, Toast.LENGTH_SHORT).show();
                }
            }
        });

        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double atan;
                if(e1.getText().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter value",Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(e1.getText().toString());
                    atan = Math.atan(a);
                    Toast.makeText(getApplicationContext(), "Tan Inverse is" +atan, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}




