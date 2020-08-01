package com.example.lovecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button calculate;
TextView percentage;
EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculate = findViewById(R.id.button);
        percentage = findViewById(R.id.percent);
        ed1 = findViewById(R.id.editText1);
        ed2 = findViewById(R.id.editText2);
        final Random r = new Random();
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().length()!= 0 && ed2.getText().toString().length() != 0) {
                    percentage.setText(Integer.toString(r.nextInt(101)) + "%");
                }
                else{
                    Toast.makeText(MainActivity.this, "Enter names", Toast.LENGTH_SHORT).show();
                    ed1.setText(null);
                    ed2.setText(null);
                }
            }
        });
    }
}