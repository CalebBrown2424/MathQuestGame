package com.example.mathquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class savesactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saves);
//        configureLoad1Button();
    }
  /*  private void configureLoad1Button()
    {
        ImageButton LoadGamebutton = findViewById(R.id.LoadGameButton);
        LoadGamebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //String data = editText.getText().toString();
                Intent intent = new Intent(savesactivity.this, savesactivity.class);
                //intent.putExtra("data", data);
                startActivity(intent);

            }
        });
    }
    */
}