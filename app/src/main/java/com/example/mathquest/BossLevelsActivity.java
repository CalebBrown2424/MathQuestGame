package com.example.mathquest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BossLevelsActivity extends AppCompatActivity {
    int levels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_selection);
        ConstraintLayout layout =(ConstraintLayout)findViewById(R.id.backgroundlevels);
        layout.setBackgroundResource(R.drawable.allmapbg);
        levels = 5;
        loadLevel45();
        loadLevel46();
        loadLevel47();
        loadLevel48();
        loadLevel49();
        loadLevel50();
        loadLevel51();
        loadLevel52();
        loadLevel53();
        loadLevel54();
        loadLevel55();

    }


    public void loadLevel45()
    {
        ImageButton level1button = findViewById(R.id.levelOneButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 45;
                Intent intent = new Intent(BossLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel46()
    {
        ImageButton level1button = findViewById(R.id.levelTwoButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 46;
                Intent intent = new Intent(BossLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel47()
    {
        ImageButton level1button = findViewById(R.id.levelThreeButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 47;
                Intent intent = new Intent(BossLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel48()
    {
        ImageButton level1button = findViewById(R.id.levelFourButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 48;
                Intent intent = new Intent(BossLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel49()
    {
        ImageButton level1button = findViewById(R.id.levelFiveButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 49;
                Intent intent = new Intent(BossLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);

                startActivity(intent);
            }
        });

    }
    public void loadLevel50()
    {
        ImageButton level1button = findViewById(R.id.levelSixButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 50;
                Intent intent = new Intent(BossLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
    public void loadLevel51()
    {
        ImageButton level1button = findViewById(R.id.levelSevenButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 51;
                Intent intent = new Intent(BossLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
    public void loadLevel52()
    {
        ImageButton level1button = findViewById(R.id.levelEightButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 52;
                Intent intent = new Intent(BossLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel53()
    {
        ImageButton level1button = findViewById(R.id.levelNineButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 53;
                Intent intent = new Intent(BossLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
    public void loadLevel54()
    {
        ImageButton level1button = findViewById(R.id.levelTenButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 54;
                Intent intent = new Intent(BossLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
    public void loadLevel55()
    {
        ImageButton level1button = findViewById(R.id.bossLevelButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 55;
                Intent intent = new Intent(BossLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
}