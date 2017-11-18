package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.practiceset2.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayGoaLForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamA(String foul) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));
    }

    public void displayFoulForTeamB(String foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));
    }

    public void addGoalA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayGoaLForTeamA(scoreTeamA);


    }

    public void addGoalB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayGoalForTeamB(scoreTeamB);


    }

    public void addFoulA(View view) {
        foulTeamA = foulTeamA + 1;
        String fouls = "Fouls: " + foulTeamA;
        displayFoulForTeamA(fouls);

    }

    public void addFoulB(View view) {
        foulTeamB = foulTeamB + 1;
        String fouls = "Fouls: " + foulTeamB;
        displayFoulForTeamB(fouls);

    }
    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayGoaLForTeamA(scoreTeamA);
        displayGoalForTeamB(scoreTeamB);
        foulTeamA = 0;
        foulTeamB = 0;
        String resetedFoulA = "Fouls: " + foulTeamA;
        displayFoulForTeamA(resetedFoulA);
        String resetedFoulB = "Fouls: " + foulTeamB;
        displayFoulForTeamB(resetedFoulB);
    }




}


