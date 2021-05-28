package com.example.mathquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class LevelResultsActivity extends AppCompatActivity {
Bundle bundle;
int score;
int stars;
ImageView star1;
TextView levelViewTV;
ImageButton next;
ImageView star2;
ImageView star3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_completion);
        star1 = findViewById(R.id.firstStarButton);
        star2 = findViewById(R.id.secondStarButton);
        star3 = findViewById(R.id.thirdStarButton);
        star1.setVisibility(View.INVISIBLE);
        star2.setVisibility(View.INVISIBLE);
        star3.setVisibility(View.INVISIBLE);
        bundle = getIntent().getExtras();

        int scoredata = bundle.getInt("score");
        score = scoredata;
        results();
        returnToLevel();
    }
    public void results()
    {
        bundle = getIntent().getExtras();
        int complete1 = bundle.getInt("data");
        if(score < 1)
        {
            score = 0;
        }
        if(score == 3)
        {
            levelViewTV = findViewById(R.id.levelView);
            levelViewTV.setText("Level Complete!");
            star1.setVisibility(View.VISIBLE);
            star2.setVisibility(View.VISIBLE);
            star3.setVisibility(View.VISIBLE);
        }
        if(score == 2)
        {
            levelViewTV = findViewById(R.id.levelView);
            levelViewTV.setText("Level Complete!");
            star1.setVisibility(View.VISIBLE);
            star2.setVisibility(View.VISIBLE);
        }
        if(score == 1)
        {
            levelViewTV = findViewById(R.id.levelView);
            levelViewTV.setText("Level Complete!");
            star1.setVisibility(View.VISIBLE);
        }
        if(score == 0)
        {
            levelViewTV = findViewById(R.id.levelView);
            levelViewTV.setText("Level Failed");
        }
    }
    public void returnToLevel()
    {
        next = findViewById(R.id.nextLevelButton);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LevelResultsActivity.this, WorldsActivity.class);
                startActivity(intent);
            }
        });
    }
}
