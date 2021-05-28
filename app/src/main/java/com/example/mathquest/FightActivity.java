package com.example.mathquest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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
        if (level == 12) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum - 1;

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
            problemTV.setText(String.valueOf(randomNum) + "- 1");

            FightAction();
        }
        if (level == 13) {
            int randomNum = (int) ((Math.random() * 15) + 2);
            answer = randomNum - 2;

            num1 = (int) ((Math.random() * 15) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 15) + 1);
            num2 = (int) ((Math.random() * 15) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 15) + 1);
            num3 = (int) ((Math.random() * 15) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 15) + 1);
            num4 = (int) ((Math.random() * 15) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 15) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + "- 2");

            FightAction();
        }
        if (level == 14) {
            int randomNum = (int) ((Math.random() * 20) + 3);
            answer = randomNum - 3;

            num1 = (int) ((Math.random() * 20) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 20) + 1);
            num2 = (int) ((Math.random() * 20) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 20) + 1);
            num3 = (int) ((Math.random() * 20) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 20) + 1);
            num4 = (int) ((Math.random() * 20) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 20) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + "- 3");

            FightAction();
        }
        if (level == 15) {
            int randomNum = (int) ((Math.random() * 20) + 4);
            answer = randomNum - 4;

            num1 = (int) ((Math.random() * 20) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 20) + 1);
            num2 = (int) ((Math.random() * 20) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 20) + 1);
            num3 = (int) ((Math.random() * 20) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 20) + 1);
            num4 = (int) ((Math.random() * 20) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 20) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + "- 4");

            FightAction();
        }
        if (level == 16) {
            int randomNum = (int) ((Math.random() * 20) + 5);
            answer = randomNum - 5;

            num1 = (int) ((Math.random() * 20) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 20) + 1);
            num2 = (int) ((Math.random() * 20) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 20) + 1);
            num3 = (int) ((Math.random() * 20) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 20) + 1);
            num4 = (int) ((Math.random() * 20) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 20) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + "- 5");

            FightAction();
        }
        if (level == 17) {
            int randomNum = (int) ((Math.random() * 20) + 6);
            answer = randomNum - 6;

            num1 = (int) ((Math.random() * 20) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 20) + 1);
            num2 = (int) ((Math.random() * 20) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 20) + 1);
            num3 = (int) ((Math.random() * 20) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 20) + 1);
            num4 = (int) ((Math.random() * 20) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 20) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + "- 6");

            FightAction();
        }
        if (level == 18) {
            int randomNum = (int) ((Math.random() * 20) + 7);
            answer = randomNum - 7;

            num1 = (int) ((Math.random() * 20) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 20) + 1);
            num2 = (int) ((Math.random() * 20) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 20) + 1);
            num3 = (int) ((Math.random() * 20) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 20) + 1);
            num4 = (int) ((Math.random() * 20) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 20) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + "- 7");

            FightAction();
        }
        if (level == 19) {
            int randomNum = (int) ((Math.random() * 20) + 8);
            answer = randomNum - 8;

            num1 = (int) ((Math.random() * 20) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 10) + 1);
            num2 = (int) ((Math.random() * 20) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 20) + 1);
            num3 = (int) ((Math.random() * 20) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 20) + 1);
            num4 = (int) ((Math.random() * 20) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 20) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + "- 8");

            FightAction();
        }
        if (level == 20) {
            int randomNum = (int) ((Math.random() * 20) + 9);
            answer = randomNum - 9;

            num1 = (int) ((Math.random() * 20) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 10) + 1);
            num2 = (int) ((Math.random() * 20) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 20) + 1);
            num3 = (int) ((Math.random() * 20) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 20) + 1);
            num4 = (int) ((Math.random() * 20) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 20) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + "- 9");

            FightAction();
        }
        if (level == 21) {
            int randomNum = (int) ((Math.random() * 50) + 10);
            answer = randomNum - 10;

            num1 = (int) ((Math.random() * 50) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 50) + 1);
            num2 = (int) ((Math.random() * 50) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 50) + 1);
            num3 = (int) ((Math.random() * 50) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 50) + 1);
            num4 = (int) ((Math.random() * 50) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 50) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + "- 10");

            FightAction();
        }
        if (level == 22) {
            int randomNum1 = (int) ((Math.random() * 20) + 10);
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum1 - randomNum;

            num1 = (int) ((Math.random() * 20) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 20) + 1);
            num2 = (int) ((Math.random() * 20) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 20) + 1);
            num3 = (int) ((Math.random() * 20) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 20) + 1);
            num4 = (int) ((Math.random() * 20) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 20) + 1);
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
            problemTV.setText(String.valueOf(randomNum1) + " - " + String.valueOf(randomNum));

            FightAction();
        }
        if (level == 23) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum * 1;

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
            problemTV.setText(String.valueOf(randomNum) + "x 1");

            FightAction();
        }
        if (level == 24) {
            int randomNum = (int) ((Math.random() * 20) + 1);
            answer = randomNum * 2;

            num1 = (int) ((Math.random() * 20) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 20) + 1);
            num2 = (int) ((Math.random() * 20) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 20) + 1);
            num3 = (int) ((Math.random() * 20) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 20) + 1);
            num4 = (int) ((Math.random() * 20) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 20) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + "x 2");

            FightAction();
        }
        if (level == 25) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum * 3;

            num1 = (int) ((Math.random() * 30) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 30) + 1);
            num2 = (int) ((Math.random() * 30) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 30) + 1);
            num3 = (int) ((Math.random() * 30) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 30) + 1);
            num4 = (int) ((Math.random() * 30) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 30) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + "x 3");

            FightAction();
        }
        if (level == 26) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum * 4;

            num1 = (int) ((Math.random() * 40) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 40) + 1);
            num2 = (int) ((Math.random() * 40) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 40) + 1);
            num3 = (int) ((Math.random() * 40) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 40) + 1);
            num4 = (int) ((Math.random() * 40) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 40) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + "x 4");

            FightAction();
        }
        if (level == 27) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum * 5;

            num1 = (int) ((Math.random() * 50) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 50) + 1);
            num2 = (int) ((Math.random() * 50) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 50) + 1);
            num3 = (int) ((Math.random() * 50) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 50) + 1);
            num4 = (int) ((Math.random() * 50) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 50) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + "x 5");

            FightAction();
        }
        if (level == 28) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum * 6;

            num1 = (int) ((Math.random() * 60) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 60) + 1);
            num2 = (int) ((Math.random() * 60) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 60) + 1);
            num3 = (int) ((Math.random() * 60) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 60) + 1);
            num4 = (int) ((Math.random() * 60) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 60) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + "x 6");

            FightAction();
        }
        if (level == 29) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum * 7;

            num1 = (int) ((Math.random() * 70) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 70) + 1);
            num2 = (int) ((Math.random() * 70) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 70) + 1);
            num3 = (int) ((Math.random() * 70) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 70) + 1);
            num4 = (int) ((Math.random() * 70) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 70) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + "x 7");

            FightAction();
        }
        if (level == 30) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum * 8;

            num1 = (int) ((Math.random() * 80) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 80) + 1);
            num2 = (int) ((Math.random() * 80) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 80) + 1);
            num3 = (int) ((Math.random() * 80) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 80) + 1);
            num4 = (int) ((Math.random() * 80) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 80) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + "x 8");

            FightAction();
        }
        if (level == 31) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum * 9;

            num1 = (int) ((Math.random() * 90) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 90) + 1);
            num2 = (int) ((Math.random() * 90) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 90) + 1);
            num3 = (int) ((Math.random() * 90) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 90) + 1);
            num4 = (int) ((Math.random() * 90) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 90) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + "x 9");

            FightAction();
        }
        if (level == 32) {
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum * 10;

            num1 = (int) ((Math.random() * 100) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 100) + 1);
            num2 = (int) ((Math.random() * 100) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 100) + 1);
            num3 = (int) ((Math.random() * 100) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 100) + 1);
            num4 = (int) ((Math.random() * 100) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 100) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + "x 10");

            FightAction();
        }
        if (level == 33) {
            int randomNum1 = (int) ((Math.random() * 10) + 1);
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum1 * randomNum;

            num1 = (int) ((Math.random() * 80) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 80) + 1);
            num2 = (int) ((Math.random() * 80) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 80) + 1);
            num3 = (int) ((Math.random() * 80) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 80) + 1);
            num4 = (int) ((Math.random() * 80) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 80) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + " x " + String.valueOf(randomNum1));

            FightAction();
        }
        if (level == 34) {

            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum / 1;

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
            problemTV.setText(String.valueOf(randomNum) + "/ 1");

            FightAction();
        }
        if (level == 35) {

            int randomNum = (int) ((Math.random() * 10) + 1);
            randomNum = randomNum * 2;
            answer = randomNum / 2;

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
            problemTV.setText(String.valueOf(randomNum) + "/ 2");

            FightAction();
        }
        if (level == 36) {

            int randomNum = (int) ((Math.random() * 10) + 1);
            randomNum = randomNum * 3;
            answer = randomNum / 3;

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
            problemTV.setText(String.valueOf(randomNum) + "/ 3");

            FightAction();
        }
        if (level == 37) {

            int randomNum = (int) ((Math.random() * 10) + 1);
            randomNum = randomNum * 4;
            answer = randomNum / 4;

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
            problemTV.setText(String.valueOf(randomNum) + "/ 4");

            FightAction();
        }
        if (level == 38) {

            int randomNum = (int) ((Math.random() * 10) + 1);
            randomNum = randomNum * 5;
            answer = randomNum / 5;

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
            problemTV.setText(String.valueOf(randomNum) + "/ 5");

            FightAction();
        }
        if (level == 39) {

            int randomNum = (int) ((Math.random() * 10) + 1);
            randomNum = randomNum * 6;
            answer = randomNum / 6;

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
            problemTV.setText(String.valueOf(randomNum) + "/ 6");

            FightAction();
        }
        if (level == 40) {

            int randomNum = (int) ((Math.random() * 10) + 1);
            randomNum = randomNum * 7;
            answer = randomNum / 7;

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
            problemTV.setText(String.valueOf(randomNum) + "/ 7");

            FightAction();
        }
        if (level == 41) {

            int randomNum = (int) ((Math.random() * 10) + 1);
            randomNum = randomNum * 8;
            answer = randomNum / 8;

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
            problemTV.setText(String.valueOf(randomNum) + "/ 8");

            FightAction();
        }
        if (level == 42) {

            int randomNum = (int) ((Math.random() * 10) + 1);
            randomNum = randomNum * 9;
            answer = randomNum / 9;

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
            problemTV.setText(String.valueOf(randomNum) + "/ 9");

            FightAction();
        }
        if (level == 43) {

            int randomNum = (int) ((Math.random() * 10) + 1);
            randomNum = randomNum * 10;
            answer = randomNum / 10;

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
            problemTV.setText(String.valueOf(randomNum) + "/ 10");

            FightAction();
        }
        if (level == 44) {
            int randomNum1 = (int) ((Math.random() * 10) + 1);
            int randomNum = (int) ((Math.random() * 10) + 1);
            randomNum = randomNum * randomNum1;
            answer = randomNum / randomNum1;

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
            problemTV.setText(String.valueOf(randomNum) +" / " + String.valueOf(randomNum1));

            FightAction();
        }
        if (level == 45) {
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
        if (level == 46) {
            int randomNum1 = (int) ((Math.random() * 20) + 10);
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum1 - randomNum;

            num1 = (int) ((Math.random() * 20) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 20) + 1);
            num2 = (int) ((Math.random() * 20) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 20) + 1);
            num3 = (int) ((Math.random() * 20) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 20) + 1);
            num4 = (int) ((Math.random() * 20) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 20) + 1);
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
            problemTV.setText(String.valueOf(randomNum1) + " - " + String.valueOf(randomNum));

            FightAction();
        }
        if (level == 47) {
            int randomNum1 = (int) ((Math.random() * 10) + 1);
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum1 * randomNum;

            num1 = (int) ((Math.random() * 80) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 80) + 1);
            num2 = (int) ((Math.random() * 80) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 80) + 1);
            num3 = (int) ((Math.random() * 80) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 80) + 1);
            num4 = (int) ((Math.random() * 80) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 80) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + " x " + String.valueOf(randomNum1));

            FightAction();
        }
        if (level == 48) {
            int randomNum1 = (int) ((Math.random() * 10) + 1);
            int randomNum = (int) ((Math.random() * 10) + 1);
            randomNum = randomNum * randomNum1;
            answer = randomNum / randomNum1;

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
            problemTV.setText(String.valueOf(randomNum) +" / " + String.valueOf(randomNum1));

            FightAction();
        }
        if (level == 49) {
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
        if (level == 50) {
            int randomNum1 = (int) ((Math.random() * 20) + 10);
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum1 - randomNum;

            num1 = (int) ((Math.random() * 20) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 20) + 1);
            num2 = (int) ((Math.random() * 20) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 20) + 1);
            num3 = (int) ((Math.random() * 20) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 20) + 1);
            num4 = (int) ((Math.random() * 20) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 20) + 1);
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
            problemTV.setText(String.valueOf(randomNum1) + " - " + String.valueOf(randomNum));

            FightAction();
        }
        if (level == 51) {
            int randomNum1 = (int) ((Math.random() * 10) + 1);
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum1 * randomNum;

            num1 = (int) ((Math.random() * 80) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 80) + 1);
            num2 = (int) ((Math.random() * 80) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 80) + 1);
            num3 = (int) ((Math.random() * 80) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 80) + 1);
            num4 = (int) ((Math.random() * 80) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 80) + 1);
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
            problemTV.setText(String.valueOf(randomNum) + " x " + String.valueOf(randomNum1));

            FightAction();
        }
        if (level == 52) {
            int randomNum1 = (int) ((Math.random() * 10) + 1);
            int randomNum = (int) ((Math.random() * 10) + 1);
            randomNum = randomNum * randomNum1;
            answer = randomNum / randomNum1;

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
            problemTV.setText(String.valueOf(randomNum) +" / " + String.valueOf(randomNum1));

            FightAction();
        }
        if (level == 53) {
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
        if (level == 54) {
            int randomNum1 = (int) ((Math.random() * 20) + 10);
            int randomNum = (int) ((Math.random() * 10) + 1);
            answer = randomNum1 - randomNum;

            num1 = (int) ((Math.random() * 20) + 1);
            while(num1 == answer)
                num1 = (int) ((Math.random() * 20) + 1);
            num2 = (int) ((Math.random() * 20) + 1);
            while (num2 == num1 || num2 == answer)
                num2 = (int) ((Math.random() * 20) + 1);
            num3 = (int) ((Math.random() * 20) + 1);
            while (num3 == num1 || num3 == num2 || num3 == answer)
                num3 = (int) ((Math.random() * 20) + 1);
            num4 = (int) ((Math.random() * 20) + 1);
            while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                num4 = (int) ((Math.random() * 20) + 1);
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
            problemTV.setText(String.valueOf(randomNum1) + " - " + String.valueOf(randomNum));

            FightAction();
        }
        if (level == 55) {
            int randomnumber = (int) ((Math.random() * 4) + 1);
            if(randomnumber == 1) {
                int randomNum1 = (int) ((Math.random() * 10) + 1);
                int randomNum = (int) ((Math.random() * 10) + 1);
                answer = randomNum1 + randomNum;

                num1 = (int) ((Math.random() * 10) + 1);
                while (num1 == answer)
                    num1 = (int) ((Math.random() * 10) + 1);
                num2 = (int) ((Math.random() * 10) + 1);
                while (num2 == num1 || num2 == answer)
                    num2 = (int) ((Math.random() * 10) + 1);
                num3 = (int) ((Math.random() * 10) + 1);
                while (num3 == num1 || num3 == num2 || num3 == answer)
                    num3 = (int) ((Math.random() * 10) + 1);
                num4 = (int) ((Math.random() * 10) + 1);
                while (num4 == num1 || num4 == num2 || num4 == num3 || num4 == answer)
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
            if(randomnumber == 2) {
                int randomNum1 = (int) ((Math.random() * 20) + 10);
                int randomNum = (int) ((Math.random() * 10) + 1);
                answer = randomNum1 - randomNum;

                num1 = (int) ((Math.random() * 20) + 1);
                while(num1 == answer)
                    num1 = (int) ((Math.random() * 20) + 1);
                num2 = (int) ((Math.random() * 20) + 1);
                while (num2 == num1 || num2 == answer)
                    num2 = (int) ((Math.random() * 20) + 1);
                num3 = (int) ((Math.random() * 20) + 1);
                while (num3 == num1 || num3 == num2 || num3 == answer)
                    num3 = (int) ((Math.random() * 20) + 1);
                num4 = (int) ((Math.random() * 20) + 1);
                while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                    num4 = (int) ((Math.random() * 20) + 1);
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
                problemTV.setText(String.valueOf(randomNum1) + " - " + String.valueOf(randomNum));

                FightAction();
            }
            if(randomnumber == 3) {
                int randomNum1 = (int) ((Math.random() * 10) + 1);
                int randomNum = (int) ((Math.random() * 10) + 1);
                answer = randomNum1 * randomNum;

                num1 = (int) ((Math.random() * 80) + 1);
                while(num1 == answer)
                    num1 = (int) ((Math.random() * 80) + 1);
                num2 = (int) ((Math.random() * 80) + 1);
                while (num2 == num1 || num2 == answer)
                    num2 = (int) ((Math.random() * 80) + 1);
                num3 = (int) ((Math.random() * 80) + 1);
                while (num3 == num1 || num3 == num2 || num3 == answer)
                    num3 = (int) ((Math.random() * 80) + 1);
                num4 = (int) ((Math.random() * 80) + 1);
                while (num4 == num1 || num4 == num2 || num4 == num3|| num4 == answer)
                    num4 = (int) ((Math.random() * 80) + 1);
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
                problemTV.setText(String.valueOf(randomNum) + " x " + String.valueOf(randomNum1));

                FightAction();
            }
            if(randomnumber == 4) {
                int randomNum1 = (int) ((Math.random() * 10) + 1);
                int randomNum = (int) ((Math.random() * 10) + 1);
                randomNum = randomNum * randomNum1;
                answer = randomNum / randomNum1;

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
                problemTV.setText(String.valueOf(randomNum) +" / " + String.valueOf(randomNum1));

                FightAction();
            }
        }
    }
    public void FightAction() {
        TextView EnemyHealthTV = findViewById(R.id.enemyhealthtv);
        EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
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
                    TextView EnemyHealthTV = findViewById(R.id.enemyhealthtv);
                    EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
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
        if(level >= 1 && level <= 11)
        {

            if(level >= 1 && level <= 10)
            {
                ImageView enemy =(ImageView) findViewById(R.id.enemyView);
                enemy.setBackgroundResource(R.drawable.mathquestadditionpig__3___1_);
            }
            else if (level == 11)
            {
                ImageView enemy =(ImageView) findViewById(R.id.enemyView);
                enemy.setBackgroundResource(R.drawable.additionboss);
            }
        }
        if(level > 11 && level <= 22)
        {
            ConstraintLayout layout3 =(ConstraintLayout)findViewById(R.id.fightbackground);
            layout3.setBackgroundResource(R.drawable.subractionfightbg);
            if(level >= 11 && level <= 21)
            {
                ImageView enemy =(ImageView) findViewById(R.id.enemyView);
                enemy.setBackgroundResource(R.drawable.subtractionmonster);
            }
            else if (level == 22)
            {
                ImageView enemy =(ImageView) findViewById(R.id.enemyView);
                enemy.setBackgroundResource(R.drawable.subtractionboss);
            }
        }
        if(level > 22 && level <= 33)
        {
            ConstraintLayout layout4 =(ConstraintLayout)findViewById(R.id.fightbackground);
            layout4.setBackgroundResource(R.drawable.mutiplicationfightbg);
            if(level >= 22 && level <= 32)
            {
                ImageView enemy =(ImageView) findViewById(R.id.enemyView);
                enemy.setBackgroundResource(R.drawable.mutiplicationmonster);

            }
            else if (level == 33)
            {
                ImageView enemy =(ImageView) findViewById(R.id.enemyView);
                enemy.setBackgroundResource(R.drawable.multiplicationboss);


            }
        }
        if(level > 33 && level <= 44)
        {
            ConstraintLayout layout5 =(ConstraintLayout)findViewById(R.id.fightbackground);
            layout5.setBackgroundResource(R.drawable.divisionfightbg);
            if(level >= 33 && level <= 43)
            {
                ImageView enemy =(ImageView) findViewById(R.id.enemyView);
                enemy.setBackgroundResource(R.drawable.divisionmonster);
            }
            else if (level == 44)
            {
                ImageView enemy =(ImageView) findViewById(R.id.enemyView);
                enemy.setBackgroundResource(R.drawable.divisionboss);
            }
        }
        if(level > 44 && level <= 55)
        {
            ConstraintLayout layout6 =(ConstraintLayout)findViewById(R.id.fightbackground);
            layout6.setBackgroundResource(R.drawable.allfightbg);
            if(level >= 44 && level <= 54)
            {
                ImageView enemy =(ImageView) findViewById(R.id.enemyView);
                enemy.setBackgroundResource(R.drawable.allmonster);
            }
            else if (level == 55)
            {
                ImageView enemy =(ImageView) findViewById(R.id.enemyView);
                enemy.setBackgroundResource(R.drawable.allboss);
            }
        }
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
        if(level == 12)
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
        if(level == 13)
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
        if(level == 14)
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
        if(level == 15)
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
        if(level == 16)
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
        if(level == 17)
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
        if(level == 18)
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
        if(level == 19)
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
        if(level == 20)
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
        if(level == 21)
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
        if(level == 22)
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
        if(level == 23)
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
        if(level == 24)
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
        if(level == 25)
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
        if(level == 26)
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
        if(level == 27)
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
        if(level == 28)
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
        if(level == 29)
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
        if(level == 30)
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
        if(level == 31)
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
        if(level == 32)
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
        if(level == 33)
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
        if(level == 34)
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
        if(level == 35)
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
        if(level == 36)
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
        if(level == 37)
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
        if(level == 38)
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
        if(level == 39)
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
        if(level == 40)
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
        if(level == 41)
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
        if(level == 42)
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
        if(level == 43)
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
        if(level == 44)
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
        if(level == 45)
        {
            PlayerHealth = 3;
            EnemyHealth = 10;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 5000;
            answerTimeCountdown = 5;
        }
        if(level == 46)
        {
            PlayerHealth = 3;
            EnemyHealth = 10;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 5000;
            answerTimeCountdown = 5;
        }
        if(level == 47)
        {
            PlayerHealth = 3;
            EnemyHealth = 10;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 5000;
            answerTimeCountdown = 5;
        }
        if(level == 48)
        {
            PlayerHealth = 3;
            EnemyHealth = 10;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 5000;
            answerTimeCountdown = 5;
        }
        if(level == 49)
        {
            PlayerHealth = 3;
            EnemyHealth = 15;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 4000;
            answerTimeCountdown = 4;
        }
        if(level == 50)
        {
            PlayerHealth = 3;
            EnemyHealth = 15;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 4000;
            answerTimeCountdown = 4;
        }
        if(level == 51)
        {
            PlayerHealth = 3;
            EnemyHealth = 15;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 4000;
            answerTimeCountdown = 4;
        }
        if(level == 52)
        {
            PlayerHealth = 3;
            EnemyHealth = 15;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 4000;
            answerTimeCountdown = 4;
        }
        if(level == 53)
        {
            PlayerHealth = 3;
            EnemyHealth = 20;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 4000;
            answerTimeCountdown = 4;
        }
        if(level == 54)
        {
            PlayerHealth = 3;
            EnemyHealth = 20;
            PlayerHealthTV.setText("Health: " + String.valueOf(PlayerHealth));
            EnemyHealthTV.setText("Health: " + String.valueOf(EnemyHealth));
            Timer.setVisibility(View.INVISIBLE);
            AttDefTV.setVisibility(View.INVISIBLE);
            answerTime = 4000;
            answerTimeCountdown = 4;
        }
        if(level == 55)
        {
            PlayerHealth = 3;
            EnemyHealth = 30;
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