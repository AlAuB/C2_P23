package com.example.c2_p23;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.panel);
        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            if (text.getBackground() instanceof ColorDrawable) {
                ColorDrawable cd = (ColorDrawable) text.getBackground();
                int color = cd.getColor();
                String hexColor = String.format("#%06X", (0xFFFFFF & color));
                if (hexColor.equals("#FF0000"))
                    text.setBackgroundColor(Color.parseColor("#A7FC00"));
                else if (hexColor.equals("#A7FC00"))
                    text.setBackgroundColor(Color.parseColor("#FFD800"));
                else
                    text.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
    }
}