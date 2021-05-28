package com.example.mathquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AdditionLevelsActivity extends AppCompatActivity {
int levels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_selection);
        levels = 1;
        loadLevel1();
        loadLevel2();
        loadLevel3();
        loadLevel4();
        loadLevel5();
        loadLevel6();
        loadLevel7();
        loadLevel8();
        loadLevel9();
        loadLevel10();
        loadLevel11();

    }


               public void loadLevel1()
               {
                   ImageButton level1button = findViewById(R.id.levelOneButton);

                       level1button.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View view) {
                               int data  = 1;
                               Intent intent = new Intent(AdditionLevelsActivity.this, FightActivity.class);
                               intent.putExtra("data", data);
                               startActivity(intent);

                           }
                       });

               }
                public void loadLevel2()
                {
                    ImageButton level1button = findViewById(R.id.levelTwoButton);

                    level1button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            int data  = 2;
                            Intent intent = new Intent(AdditionLevelsActivity.this, FightActivity.class);
                            intent.putExtra("data", data);
                            startActivity(intent);

                        }
                    });

                }
                public void loadLevel3()
                {
                    ImageButton level1button = findViewById(R.id.levelThreeButton);

                    level1button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            int data  = 3;
                            Intent intent = new Intent(AdditionLevelsActivity.this, FightActivity.class);
                            intent.putExtra("data", data);
                            startActivity(intent);

                        }
                    });

                }
                public void loadLevel4()
                {
                    ImageButton level1button = findViewById(R.id.levelFourButton);

                    level1button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            int data  = 4;
                            Intent intent = new Intent(AdditionLevelsActivity.this, FightActivity.class);
                            intent.putExtra("data", data);
                            startActivity(intent);

                        }
                    });

                }
                public void loadLevel5()
                {
                    ImageButton level1button = findViewById(R.id.levelFiveButton);

                    level1button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            int data  = 5;
                            Intent intent = new Intent(AdditionLevelsActivity.this, FightActivity.class);
                            intent.putExtra("data", data);

                            startActivity(intent);
                        }
                    });

                }
               public void loadLevel6()
               {
                   ImageButton level1button = findViewById(R.id.levelSixButton);

                   level1button.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           int data  = 6;
                           Intent intent = new Intent(AdditionLevelsActivity.this, FightActivity.class);
                           intent.putExtra("data", data);
                           startActivity(intent);
                       }
                   });

               }
               public void loadLevel7()
               {
                   ImageButton level1button = findViewById(R.id.levelSevenButton);

                   level1button.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           int data  = 7;
                           Intent intent = new Intent(AdditionLevelsActivity.this, FightActivity.class);
                           intent.putExtra("data", data);
                           startActivity(intent);
                       }
                   });

               }
               public void loadLevel8()
               {
                   ImageButton level1button = findViewById(R.id.levelEightButton);

                   level1button.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           int data  = 8;
                           Intent intent = new Intent(AdditionLevelsActivity.this, FightActivity.class);
                           intent.putExtra("data", data);
                           startActivity(intent);

                       }
                   });

               }
               public void loadLevel9()
               {
                   ImageButton level1button = findViewById(R.id.levelNineButton);

                   level1button.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           int data  = 9;
                           Intent intent = new Intent(AdditionLevelsActivity.this, FightActivity.class);
                           intent.putExtra("data", data);
                           startActivity(intent);
                       }
                   });

               }
               public void loadLevel10()
               {
                   ImageButton level1button = findViewById(R.id.levelTenButton);

                   level1button.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           int data  = 10;
                           Intent intent = new Intent(AdditionLevelsActivity.this, FightActivity.class);
                           intent.putExtra("data", data);
                           startActivity(intent);
                       }
                   });

               }
    public void loadLevel11()
    {
        ImageButton level1button = findViewById(R.id.bossLevelButton);

        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data  = 11;
                Intent intent = new Intent(AdditionLevelsActivity.this, FightActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }
}