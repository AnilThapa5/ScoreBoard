package com.example.scorecard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt1;
    private TextView txt2;

    private int teamAScore;
    private int teamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.scorea);
        txt2 = findViewById(R.id.scoreb);



    }

    public void  buttonScore1(View view){

        teamAScore=teamAScore+1;
        displayScoreForTeamA(teamAScore);
    }

    public void  buttonScore2(View view){

        teamAScore=teamAScore+2;
        displayScoreForTeamA(teamAScore);
    }

    public void  buttonScore3(View view){

        teamAScore=teamAScore+5;
        displayScoreForTeamA(teamAScore);
    }

    public void  buttonScore4(View view){

        teamBScore=teamBScore+1;
        displayScoreForTeamB(teamBScore);
    }

    public void  buttonScore5(View view){

        teamBScore=teamBScore+2;
        displayScoreForTeamB(teamBScore);
    }

    public void  buttonScore6(View view){

        teamBScore=teamBScore+2;
        displayScoreForTeamB(teamBScore);
    }

    public void displayScoreForTeamA(int score)
    {
        txt1.setText(String.valueOf(score));
    }

    public void displayScoreForTeamB(int score)
    {
        txt2.setText(String.valueOf(score));
    }

    public void resetbtn(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayScoreForTeamA(teamAScore);
        displayScoreForTeamB(teamBScore);

    }


}