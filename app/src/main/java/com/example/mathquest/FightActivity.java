package com.example.mathquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class FightActivity extends AppCompatActivity {
    int count = 0;
    TextView Timer;
    int answerTime;
    int initialFightMessageCounter;
    int answer;
    int PlayerHealth;
    int EnemyHealth;
    int clicked;
    int answerTimeCountdown;
    int num1;
    int num2;
    int num3;
    int num4;
    int correctResponse;
    int level;
    CountDownTimer fighttimer;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combat_ui);
        Timer = findViewById(R.id.TimerTV);
        Timer.setText("");
        Button ansbut1 = findViewById(R.id.answerButton1);
        ansbut1.setText("");
        Button ansbut2 = findViewById(R.id.answerButton2);
        ansbut2.setText("");
        Button ansbut3 = findViewById(R.id.answerButton3);
        ansbut3.setText("");
        Button ansbut4 = findViewById(R.id.answerButton4);
        ansbut4.setText("");
        initialFightMessageCounter = 0;
        FightTime();
        FightStats();
    }

    public void FightTime() {
        bundle = getIntent().getExtras();
        int levelLoaded = bundle.getInt("data");
        level = levelLoaded;
        final TextView problemTV = findViewById(R.id.ProblemTextView);
        new CountDownTimer(7000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                //int count = 0;
                count++;
                if (count == 2) {
                    problemTV.setText("Ready...");
                }
                if (count == 4) {
                    problemTV.setText("Set...");
                }
                if (count == 6) {
                    problemTV.setText("Fight!");
                }

            }

            @Override
            public void onFinish() {
                setProblems();
                this.cancel();
            }
        }.start();
    }

    public void setProblems() {
        bundle = getIntent().getExtras();
        int levelLoaded = bundle.getInt("data");
        level = levelLoaded;
        final TextView problemTV = findViewById(R.id.ProblemTextView);
        if (level == 1) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum + 1;

            num1 = (int) ((Math.random() * 10) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 10) + 1);
            num2 = (int) ((Math.random() * 10) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 10) + 1);
            num3 = (int) ((Math.random() * 10) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 10) + 1);
            num4 = (int) ((Math.random() * 10) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 10) + 1);
            int rand = (int) ((Math.random() * 4) + 1);
            if (rand == 1) {
                num1 = answer;
            } else if (rand == 2) {
                num2 = answer;
            } else if (rand == 3) {
                num3 = answer;
            } else {
                num4 = answer;
            }
            problemTV.setText("1 + " + String.valueOf(randomNum));

            FightAction();
        }
        if (level == 2) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum + 2;

            num1 = (int) ((Math.random() * 10) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 10) + 1);
            num2 = (int) ((Math.random() * 10) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 10) + 1);
            num3 = (int) ((Math.random() * 10) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 10) + 1);
            num4 = (int) ((Math.random() * 10) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 10) + 1);
            int rand = (int) ((Math.random() * 4) + 1);
            if (rand == 1) {
                num1 = answer;
            } else if (rand == 2) {
                num2 = answer;
            } else if (rand == 3) {
                num3 = answer;
            } else {
                num4 = answer;
            }
            problemTV.setText("2 + " + String.valueOf(randomNum));

            FightAction();
        }
        if (level == 3) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum + 3;

            num1 = (int) ((Math.random() * 10) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 10) + 1);
            num2 = (int) ((Math.random() * 10) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 10) + 1);
            num3 = (int) ((Math.random() * 10) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 10) + 1);
            num4 = (int) ((Math.random() * 10) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 10) + 1);
            int rand = (int) ((Math.random() * 4) + 1);
            if (rand == 1) {
                num1 = answer;
            } else if (rand == 2) {
                num2 = answer;
            } else if (rand == 3) {
                num3 = answer;
            } else {
                num4 = answer;
            }
            problemTV.setText("3 + " + String.valueOf(randomNum));

            FightAction();
        }
        if (level == 4) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum + 4;

            num1 = (int) ((Math.random() * 10) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 10) + 1);
            num2 = (int) ((Math.random() * 10) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 10) + 1);
            num3 = (int) ((Math.random() * 10) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 10) + 1);
            num4 = (int) ((Math.random() * 10) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 10) + 1);
            int rand = (int) ((Math.random() * 4) + 1);
            if (rand == 1) {
                num1 = answer;
            } else if (rand == 2) {
                num2 = answer;
            } else if (rand == 3) {
                num3 = answer;
            } else {
                num4 = answer;
            }
            problemTV.setText("4 + " + String.valueOf(randomNum));

            FightAction();
        }
        if (level == 5) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum + 5;

            num1 = (int) ((Math.random() * 10) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 10) + 1);
            num2 = (int) ((Math.random() * 10) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 10) + 1);
            num3 = (int) ((Math.random() * 10) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 10) + 1);
            num4 = (int) ((Math.random() * 10) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 10) + 1);
            int rand = (int) ((Math.random() * 4) + 1);
            if (rand == 1) {
                num1 = answer;
            } else if (rand == 2) {
                num2 = answer;
            } else if (rand == 3) {
                num3 = answer;
            } else {
                num4 = answer;
            }
            problemTV.setText("5 + " + String.valueOf(randomNum));

            FightAction();
        }
        if (level == 6) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum + 6;

            num1 = (int) ((Math.random() * 10) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 10) + 1);
            num2 = (int) ((Math.random() * 10) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 10) + 1);
            num3 = (int) ((Math.random() * 10) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 10) + 1);
            num4 = (int) ((Math.random() * 10) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 10) + 1);
            int rand = (int) ((Math.random() * 4) + 1);
            if (rand == 1) {
                num1 = answer;
            } else if (rand == 2) {
                num2 = answer;
            } else if (rand == 3) {
                num3 = answer;
            } else {
                num4 = answer;
            }
            problemTV.setText("6 + " + String.valueOf(randomNum));

            FightAction();
        }
        if (level == 7) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum + 7;

            num1 = (int) ((Math.random() * 10) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 10) + 1);
            num2 = (int) ((Math.random() * 10) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 10) + 1);
            num3 = (int) ((Math.random() * 10) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 10) + 1);
            num4 = (int) ((Math.random() * 10) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 10) + 1);
            int rand = (int) ((Math.random() * 4) + 1);
            if (rand == 1) {
                num1 = answer;
            } else if (rand == 2) {
                num2 = answer;
            } else if (rand == 3) {
                num3 = answer;
            } else {
                num4 = answer;
            }
            problemTV.setText("7 + " + String.valueOf(randomNum));

            FightAction();
        }
        if (level == 8) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum + 8;

            num1 = (int) ((Math.random() * 10) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 10) + 1);
            num2 = (int) ((Math.random() * 10) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 10) + 1);
            num3 = (int) ((Math.random() * 10) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 10) + 1);
            num4 = (int) ((Math.random() * 10) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 10) + 1);
            int rand = (int) ((Math.random() * 4) + 1);
            if (rand == 1) {
                num1 = answer;
            } else if (rand == 2) {
                num2 = answer;
            } else if (rand == 3) {
                num3 = answer;
            } else {
                num4 = answer;
            }
            problemTV.setText("8 + " + String.valueOf(randomNum));

            FightAction();
        }
        if (level == 9) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum + 9;

            num1 = (int) ((Math.random() * 10) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 10) + 1);
            num2 = (int) ((Math.random() * 10) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 10) + 1);
            num3 = (int) ((Math.random() * 10) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 10) + 1);
            num4 = (int) ((Math.random() * 10) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 10) + 1);
            int rand = (int) ((Math.random() * 4) + 1);
            if (rand == 1) {
                num1 = answer;
            } else if (rand == 2) {
                num2 = answer;
            } else if (rand == 3) {
                num3 = answer;
            } else {
                num4 = answer;
            }
            problemTV.setText("9 + " + String.valueOf(randomNum));

            FightAction();
        }
        if (level == 10) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum + 10;

            num1 = (int) ((Math.random() * 10) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 10) + 1);
            num2 = (int) ((Math.random() * 10) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 10) + 1);
            num3 = (int) ((Math.random() * 10) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 10) + 1);
            num4 = (int) ((Math.random() * 10) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 10) + 1);
            int rand = (int) ((Math.random() * 4) + 1);
            if (rand == 1) {
                num1 = answer;
            } else if (rand == 2) {
                num2 = answer;
            } else if (rand == 3) {
                num3 = answer;
            } else {
                num4 = answer;
            }
            problemTV.setText("10 + " + String.valueOf(randomNum));

            FightAction();
        }
        if (level == 11) {
            int randomNum1 = (int) ((Math.random() * 10) + 1);
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum1 + randomNum;

            num1 = (int) ((Math.random() * 10) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 10) + 1);
            num2 = (int) ((Math.random() * 10) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 10) + 1);
            num3 = (int) ((Math.random() * 10) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 10) + 1);
            num4 = (int) ((Math.random() * 10) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 10) + 1);
            int rand = (int) ((Math.random() * 4) + 1);
            if (rand == 1) {
                num1 = answer;
            } else if (rand == 2) {
                num2 = answer;
            } else if (rand == 3) {
                num3 = answer;
            } else {
                num4 = answer;
            }
            problemTV.setText(String.valueOf(randomNum1) + " + " + String.valueOf(randomNum));

            FightAction();
        }
    }
    public void FightAction() {
        bundle = getIntent().getExtras();
        int levelLoaded = bundle.getInt("data");
        level = levelLoaded;
            Button answerBut1 = findViewById(R.id.answerButton1);
            Button answerBut2 = findViewById(R.id.answerButton2);
            Button answerBut3 = findViewById(R.id.answerButton3);
            Button answerBut4 = findViewById(R.id.answerButton4);
            answerBut1.setText(String.valueOf(num1));
            answerBut2.setText(String.valueOf(num2));
            answerBut3.setText(String.valueOf(num3));
            answerBut4.setText(String.valueOf(num4));
            correctResponse = 0;
            Timer = findViewById(R.id.TimerTV);
            Timer.setVisibility(View.VISIBLE);
            fighttimer = new CountDownTimer(answerTime, 1000) {
                int TimerCount = answerTimeCountdown;

                @Override
                public void onTick(long millisUntilFinished) {
                    TimerCount--;
                    Timer.setText(String.valueOf(TimerCount));
                }

                @Override
                public void onFinish() {
                    if(clicked == 0)
                    {
                        PlayerHealth--;
                        TextView PlayerHealthTV = findViewById(R.id.playerhealthtv);
                        PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
                    }
                    if(PlayerHealth < 1 || EnemyHealth < 1)
                    {
                        int score  = PlayerHealth;
                        Intent intent = new Intent(FightActivity.this, LevelResultsActivity.class);
                        intent.putExtra("score", score);
                        fighttimer.cancel();
                        startActivity(intent);

                    }
                    else
                    {
                        setProblems();
                    }


                }
            }.start();
            clicked = 0;

                answerBut1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (num1 == answer && clicked != 1) {
                            EnemyHealth--;
                            correctResponse = 1;
                            clicked++;
                        } else if(num1 != answer && clicked != 1){
                            PlayerHealth--;
                            TextView PlayerHealthTV = findViewById(R.id.playerhealthtv);
                            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
                            correctResponse = 0;
                            clicked++;
                        }
                        TextView EnemyHealthTV = findViewById(R.id.enemyhealthtv);
                        EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
                    }
                });
                answerBut2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (num2 == answer && clicked != 1) {
                            EnemyHealth--;
                            correctResponse = 1;
                            clicked++;
                        } else if(num2 != answer && clicked != 1){
                            PlayerHealth--;
                            TextView PlayerHealthTV = findViewById(R.id.playerhealthtv);
                            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
                            correctResponse = 0;
                            clicked++;
                        }
                        TextView EnemyHealthTV = findViewById(R.id.enemyhealthtv);
                        EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
                    }
                });
                answerBut3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (num3 == answer && clicked != 1) {
                            EnemyHealth--;
                            correctResponse = 1;
                            clicked++;
                        } else if(num3 != answer && clicked != 1){
                            PlayerHealth--;
                            TextView PlayerHealthTV = findViewById(R.id.playerhealthtv);
                            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
                            correctResponse = 0;
                            clicked++;
                        }
                        TextView EnemyHealthTV = findViewById(R.id.enemyhealthtv);
                        EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
                    }
                });
                answerBut4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (num4 == answer && clicked != 1) {
                            EnemyHealth--;
                            correctResponse = 1;
                            clicked++;
                        } else if(num4 != answer && clicked != 1){
                            PlayerHealth--;
                            TextView PlayerHealthTV = findViewById(R.id.playerhealthtv);
                            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
                            correctResponse = 0;
                            clicked++;
                        }
                        TextView EnemyHealthTV = findViewById(R.id.enemyhealthtv);
                        EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
                    }
                });



    }


public void FightStats()
    {
        bundle = getIntent().getExtras();
        int levelLoaded = bundle.getInt("data");
        level = levelLoaded;
        TextView PlayerHealthTV = findViewById(R.id.playerhealthtv);
        TextView EnemyHealthTV = findViewById(R.id.enemyhealthtv);
        TextView AttDefTV = findViewById(R.id.AttackOrDefendTV);
        Timer = findViewById(R.id.TimerTV);
        PlayerHealth = 0;
        EnemyHealth = 0;
        if(level == 1)
        {
            PlayerHealth = 3;
            EnemyHealth = 10;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 6000;
            answerTimeCountdown = 6;
        }
        if(level == 2)
        {
            PlayerHealth = 3;
            EnemyHealth = 15;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 5000;
            answerTimeCountdown = 5;
        }
        if(level == 3)
        {
            PlayerHealth = 3;
            EnemyHealth = 15;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 5000;
            answerTimeCountdown = 5;
        }
        if(level == 4)
        {
            PlayerHealth = 3;
            EnemyHealth = 20;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 5000;
            answerTimeCountdown = 5;
        }
        if(level == 5)
        {
            PlayerHealth = 3;
            EnemyHealth = 20;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 5000;
            answerTimeCountdown = 5;
        }
        if(level == 6)
        {
            PlayerHealth = 3;
            EnemyHealth = 20;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 5000;
            answerTimeCountdown = 5;
        }
        if(level == 7)
        {
            PlayerHealth = 3;
            EnemyHealth = 20;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 5000;
            answerTimeCountdown = 5;
        }
        if(level == 8)
        {
            PlayerHealth = 3;
            EnemyHealth = 20;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 5000;
            answerTimeCountdown = 5;
        }
        if(level == 9)
        {
            PlayerHealth = 3;
            EnemyHealth = 20;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 5000;
            answerTimeCountdown = 5;
        }
        if(level == 10)
        {
            PlayerHealth = 3;
            EnemyHealth = 20;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 5000;
            answerTimeCountdown = 5;
        }
        if(level == 11)
        {
            PlayerHealth = 3;
            EnemyHealth = 25;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 3000;
            answerTimeCountdown = 3;
        }
    }

public void finish()
{
    if (correctResponse == 0 && clicked == 0) {
        PlayerHealth--;
        TextView PlayerHealthTV = findViewById(R.id.playerhealthtv);
        PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
    }

}

}