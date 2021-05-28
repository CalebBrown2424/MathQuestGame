package com.example.mathquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class WorldsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world_selection);
        configureLoadAdditionWorldButton();
        configureLoadSubtractionWorldButton();
        configureLoadMultiplicationWorldButton();
        configureLoadDivisionWorldButton();
        configureLoadBossWorldButton();
    }
    private void configureLoadAdditionWorldButton()
    {
        ImageButton LoadAdditionWorldButton = findViewById(R.id.imageButtonAddition);
        LoadAdditionWorldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldsActivity.this, AdditionLevelsActivity.class);
                startActivity(intent);

            }
        });

    }
    private void configureLoadSubtractionWorldButton() {
        ImageButton LoadSubtractionWorldButton = findViewById(R.id.imageButtonSubtraction);
        LoadSubtractionWorldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldsActivity.this, SubtractionLevelsActivity.class);
                startActivity(intent);

            }
        });
    }
    private void configureLoadMultiplicationWorldButton() {
        ImageButton LoadMultiplicationWorldButton = findViewById(R.id.imageButtonMultiplication);
        LoadMultiplicationWorldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldsActivity.this, MultiplicationLevelsActivity.class);
                startActivity(intent);

            }
        });
    }
    private void configureLoadDivisionWorldButton() {
        ImageButton LoadDivisionWorldButton = findViewById(R.id.imageButtonDivision);
        LoadDivisionWorldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldsActivity.this, DivisionLevelsActivity.class);
                startActivity(intent);

            }
        });
    }private void configureLoadBossWorldButton() {
        ImageButton LoadBossWorldButton = findViewById(R.id.imageButtonBoss);
        LoadBossWorldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldsActivity.this, BossLevelsActivity.class);
                startActivity(intent);

            }
        });
    }
}