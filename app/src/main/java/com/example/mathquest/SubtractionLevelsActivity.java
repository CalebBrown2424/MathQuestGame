package com.example.mathquest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class SubtractionLevelsActivity extends AppCompatActivity {
    int levels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_selection);
        ConstraintLayout layout =(ConstraintLayout)findViewById(R.id.backgroundlevels);
        layout.setBackgroundResource(R.drawable.subtractionbackground);
        levels = 2;
        loadLevel12();
        loadLevel13();
        loadLevel14();
        loadLevel15();
        loadLevel16();
        loadLevel17();
        loadLevel18();
        loadLevel19();
        loadLevel20();
        loadLevel21();
        loadLevel22();

    }


    public void loadLevel12()
    {
        ImageButton level1button = findViewById(R.id.levelOneButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 12;
                Intent intent = new Intent(SubtractionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel13()
    {
        ImageButton level1button = findViewById(R.id.levelTwoButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 13;
                Intent intent = new Intent(SubtractionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel14()
    {
        ImageButton level1button = findViewById(R.id.levelThreeButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 14;
                Intent intent = new Intent(SubtractionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel15()
    {
        ImageButton level1button = findViewById(R.id.levelFourButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 15;
                Intent intent = new Intent(SubtractionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel16()
    {
        ImageButton level1button = findViewById(R.id.levelFiveButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 16;
                Intent intent = new Intent(SubtractionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);

                startActivity(intent);
            }
        });

    }
    public void loadLevel17()
    {
        ImageButton level1button = findViewById(R.id.levelSixButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 17;
                Intent intent = new Intent(SubtractionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
    public void loadLevel18()
    {
        ImageButton level1button = findViewById(R.id.levelSevenButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 18;
                Intent intent = new Intent(SubtractionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
    public void loadLevel19()
    {
        ImageButton level1button = findViewById(R.id.levelEightButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 19;
                Intent intent = new Intent(SubtractionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel20()
    {
        ImageButton level1button = findViewById(R.id.levelNineButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 20;
                Intent intent = new Intent(SubtractionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
    public void loadLevel21()
    {
        ImageButton level1button = findViewById(R.id.levelTenButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 21;
                Intent intent = new Intent(SubtractionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
    public void loadLevel22()
    {
        ImageButton level1button = findViewById(R.id.bossLevelButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 22;
                Intent intent = new Intent(SubtractionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
}