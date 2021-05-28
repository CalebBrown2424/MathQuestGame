package com.example.mathquest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MultiplicationLevelsActivity extends AppCompatActivity {
    int levels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_selection);
        ConstraintLayout layout =(ConstraintLayout)findViewById(R.id.backgroundlevels);
        layout.setBackgroundResource(R.drawable.multiplicationbgz);

        levels = 3;
        loadLevel23();
        loadLevel24();
        loadLevel25();
        loadLevel26();
        loadLevel27();
        loadLevel28();
        loadLevel29();
        loadLevel30();
        loadLevel31();
        loadLevel32();
        loadLevel33();

    }


    public void loadLevel23()
    {
        ImageButton level1button = findViewById(R.id.levelOneButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 23;
                Intent intent = new Intent(MultiplicationLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel24()
    {
        ImageButton level1button = findViewById(R.id.levelTwoButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 24;
                Intent intent = new Intent(MultiplicationLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel25()
    {
        ImageButton level1button = findViewById(R.id.levelThreeButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 25;
                Intent intent = new Intent(MultiplicationLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel26()
    {
        ImageButton level1button = findViewById(R.id.levelFourButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 26;
                Intent intent = new Intent(MultiplicationLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel27()
    {
        ImageButton level1button = findViewById(R.id.levelFiveButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 27;
                Intent intent = new Intent(MultiplicationLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);

                startActivity(intent);
            }
        });

    }
    public void loadLevel28()
    {
        ImageButton level1button = findViewById(R.id.levelSixButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 28;
                Intent intent = new Intent(MultiplicationLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
    public void loadLevel29()
    {
        ImageButton level1button = findViewById(R.id.levelSevenButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 29;
                Intent intent = new Intent(MultiplicationLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
    public void loadLevel30()
    {
        ImageButton level1button = findViewById(R.id.levelEightButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 30;
                Intent intent = new Intent(MultiplicationLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel31()
    {
        ImageButton level1button = findViewById(R.id.levelNineButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 31;
                Intent intent = new Intent(MultiplicationLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
    public void loadLevel32()
    {
        ImageButton level1button = findViewById(R.id.levelTenButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 32;
                Intent intent = new Intent(MultiplicationLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
    public void loadLevel33()
    {
        ImageButton level1button = findViewById(R.id.bossLevelButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 33;
                Intent intent = new Intent(MultiplicationLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
}