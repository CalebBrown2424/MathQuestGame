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
    String level;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combat_ui);
        initialFightMessageCounter = 0;
        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
        String levelLoaded = bundle.getString("data");
            level = levelLoaded;
            }
        FightTime();
        FightStats();
    }

    public void FightTime() {
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
            }
        }.start();
    }

    public void setProblems() {

        final TextView problemTV = findViewById(R.id.ProblemTextView);
        if (1==1) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum + 1;

            num1 = (int) ((Math.random() * 10) + 1);
            num2 = (int) ((Math.random() * 10) + 1);
            while (num2 == num1)
                num2 = (int) ((Math.random() * 10) + 1);
            num3 = (int) ((Math.random() * 10) + 1);
            while (num3 == num1 || num3 == num2)
                num3 = (int) ((Math.random() * 10) + 1);
            num4 = (int) ((Math.random() * 10) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3)
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
    }

    public void FightAction() {
        if (1==1) {
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
            new CountDownTimer(answerTime, 1000) {
                int TimerCount = answerTimeCountdown;

                @Override
                public void onTick(long millisUntilFinished) {

                    TimerCount--;
                    Timer.setText(String.valueOf(TimerCount));
                }
                @Override
                public void onFinish() {
                    if (correctResponse == 0) {
                        PlayerHealth--;
                        TextView PlayerHealthTV = findViewById(R.id.playerhealthtv);
                        PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
                    }
                    setProblems();
                }
            }.start();
                clicked = 0;
                answerBut1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (num1 == answer&& clicked != 1) {
                            EnemyHealth--;
                            correctResponse = 1;
                            clicked++;
                        }else {

                            correctResponse = 0;
                        }
                        TextView EnemyHealthTV = findViewById(R.id.enemyhealthtv);
                        EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
                    }
                });
                answerBut2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (num2 == answer&& clicked != 1) {
                            EnemyHealth--;
                            correctResponse = 1;
                            clicked++;
                        }else {

                            correctResponse = 0;
                        }

                        TextView EnemyHealthTV = findViewById(R.id.enemyhealthtv);
                        EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));

                    }
                });
                answerBut3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (num3 == answer&& clicked != 1) {
                            EnemyHealth--;
                            correctResponse = 1;
                            clicked++;
                        }else {

                            correctResponse = 0;
                        }
                        TextView EnemyHealthTV = findViewById(R.id.enemyhealthtv);
                        EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
                    }
                });
                answerBut4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (num4 == answer&& clicked != 1) {
                            EnemyHealth--;
                            correctResponse = 1;
                            clicked++;
                        }else {
                            correctResponse = 0;
                        }
                        TextView EnemyHealthTV = findViewById(R.id.enemyhealthtv);
                        EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
                    }
                });
            }

    }


public void FightStats()
    {
        TextView PlayerHealthTV = findViewById(R.id.playerhealthtv);
        TextView EnemyHealthTV = findViewById(R.id.enemyhealthtv);
        TextView AttDefTV = findViewById(R.id.AttackOrDefendTV);
        Timer = findViewById(R.id.TimerTV);
        PlayerHealth = 0;
        EnemyHealth = 0;
        if(1 == 1)
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
    }



}