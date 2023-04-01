package com.sneha.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.number2);
        editText = findViewById(R.id.number1);

        button1 = findViewById(R.id.buttonmtocm);
        button2 = findViewById(R.id.buttoncmtom);
        button3 = findViewById(R.id.buttonkgtog);
        button4 = findViewById(R.id.buttongtokg);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = editText.getText().toString();
                int m1 = Integer.parseInt(s1);
                double cm1 = 100 * m1;
                textView.setText(m1 +" m = " +cm1 +" cm");

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s2 = editText.getText().toString();
                int cm2 = Integer.parseInt(s2);
                double m2 = 0.01 * cm2;
                textView.setText(cm2 +" cm = " +m2 +" m");

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s3 = editText.getText().toString();
                int kg1 = Integer.parseInt(s3);
                double g1 = 1000 * kg1;
                textView.setText(kg1 +" kg = " +g1 +" g");

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s4 = editText.getText().toString();
                int g2 = Integer.parseInt(s4);
                double kg2 = 0.001 * g2;
                textView.setText(g2 +" g = " +kg2 +" kg");

            }
        });

    }
}