package com.example.mayank.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textMiles = findViewById(R.id.editText);
                EditText textKM = findViewById(R.id.editText2);
                double vmiles = Double.valueOf(textMiles.getText().toString());
                double vKM = vmiles/0.62137;
                DecimalFormat formatval = new DecimalFormat("##.##");
                textKM.setText(formatval.format(vKM));


            }
        });
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textMiles = findViewById(R.id.editText);
                EditText textKM = findViewById(R.id.editText2);
                double vKM = Double.valueOf(textKM.getText().toString());
                double vMiles = vKM*0.62137;
                DecimalFormat formatval = new DecimalFormat("##.##");
                textMiles.setText(formatval.format(vMiles));


            }
        });

    }
}
