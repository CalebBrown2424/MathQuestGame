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
}