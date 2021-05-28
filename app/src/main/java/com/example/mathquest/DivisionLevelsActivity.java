package com.example.mathquest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DivisionLevelsActivity extends AppCompatActivity {
    int levels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_selection);
        ConstraintLayout layout =(ConstraintLayout)findViewById(R.id.backgroundlevels);
        layout.setBackgroundResource(R.drawable.divisionbg);
        levels = 4;
        loadLevel34();
        loadLevel35();
        loadLevel36();
        loadLevel37();
        loadLevel38();
        loadLevel39();
        loadLevel40();
        loadLevel41();
        loadLevel42();
        loadLevel43();
        loadLevel44();

    }


    public void loadLevel34()
    {
        ImageButton level1button = findViewById(R.id.levelOneButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 34;
                Intent intent = new Intent(DivisionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel35()
    {
        ImageButton level1button = findViewById(R.id.levelTwoButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 35;
                Intent intent = new Intent(DivisionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel36()
    {
        ImageButton level1button = findViewById(R.id.levelThreeButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 36;
                Intent intent = new Intent(DivisionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel37()
    {
        ImageButton level1button = findViewById(R.id.levelFourButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 37;
                Intent intent = new Intent(DivisionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel38()
    {
        ImageButton level1button = findViewById(R.id.levelFiveButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 38;
                Intent intent = new Intent(DivisionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);

                startActivity(intent);
            }
        });

    }
    public void loadLevel39()
    {
        ImageButton level1button = findViewById(R.id.levelSixButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 39;
                Intent intent = new Intent(DivisionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
    public void loadLevel40()
    {
        ImageButton level1button = findViewById(R.id.levelSevenButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 40;
                Intent intent = new Intent(DivisionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
    public void loadLevel41()
    {
        ImageButton level1button = findViewById(R.id.levelEightButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 41;
                Intent intent = new Intent(DivisionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });

    }
    public void loadLevel42()
    {
        ImageButton level1button = findViewById(R.id.levelNineButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 42;
                Intent intent = new Intent(DivisionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
    public void loadLevel43()
    {
        ImageButton level1button = findViewById(R.id.levelTenButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 43;
                Intent intent = new Intent(DivisionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
    public void loadLevel44()
    {
        ImageButton level1button = findViewById(R.id.bossLevelButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 44;
                Intent intent = new Intent(DivisionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
}