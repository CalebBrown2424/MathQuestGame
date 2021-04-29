package com.example.mathquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        configureSavesButton();
        configureStartGameButton();

    }
    private void configureSavesButton()
    {
        ImageButton LoadGamebutton = findViewById(R.id.LoadGameButton);
        LoadGamebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //String data = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this, savesactivity.class);
                //intent.putExtra("data", data);
                startActivity(intent);

            }
        });
    }
    private void configureStartGameButton()
    {
        ImageButton StartGameButton = findViewById(R.id.StartGameButton);
        StartGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, WorldsActivity.class);
                startActivity(intent);

            }
        });
    }
}