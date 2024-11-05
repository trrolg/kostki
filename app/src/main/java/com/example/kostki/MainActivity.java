package com.example.kostki;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;



import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

    private TextView banner;
    private Button roll;
    private TextView num1;
    private TextView num2;
    private TextView num3;
    private TextView num4;
    private TextView num5;
    private TextView wynikl;
    private TextView wynikg;
    private Button reset;
    private TextView rolls;
    Random random = new Random();
    private int rand1;
    private int rand2;
    private int rand3;
    private int rand4;
    private int rand5;
    private int wynik1;
    private int wynik2;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        banner = findViewById(R.id.banner);
        roll = findViewById(R.id.roll);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        wynikl = findViewById(R.id.wynikl);
        wynikg = findViewById(R.id.wynikg);
        reset = findViewById(R.id.reset);
        rolls = findViewById(R.id.rolls);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rand1 = random.nextInt(5) + 1;
                rand2 = random.nextInt(5) + 1;
                rand3 = random.nextInt(5) + 1;
                rand4 = random.nextInt(5) + 1;
                rand5 = random.nextInt(5) + 1;
                wynik1 = rand1 + rand2 + rand3 + rand4 + rand5;
                wynik2 = wynik2 + wynik1;
                num++;
                updatew();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rand1 = 0;
                rand2 = 0;
                rand3 = 0;
                rand4 = 0;
                rand5 = 0;
                wynik1 = 0;
                wynik2 = 0;
                num = 0;
                updatew();
            }
        });

    }
    private void updatew(){
        num1.setText("" + rand1);
        num2.setText("" + rand2);
        num3.setText("" + rand3);
        num4.setText("" + rand4);
        num5.setText("" + rand5);
        wynikl.setText("wynik losowania: " + wynik1);
        wynikg.setText("wynik gry: " + wynik2);
        rolls.setText("liczba rzutów: " + num);

    }


}