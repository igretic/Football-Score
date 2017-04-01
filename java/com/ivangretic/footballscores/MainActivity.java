package com.ivangretic.footballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

/* Initialization of all the necessary variables */

    int pointsTeamA = 0;
    int pointsTeamB = 0;
    int cornerA = 0;
    int cornerB = 0;
    int yellowA = 0;
    int yellowB = 0;
    int redA = 0;
    int redB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Handling team scores */

    public void addTeamAScore(View view) {
        pointsTeamA = pointsTeamA + 1;
        scoreTeamA(pointsTeamA);
    }

    public void addTeamBScore(View view) {
        pointsTeamB = pointsTeamB + 1;
        scoreTeamB(pointsTeamB);
    }

    public void scoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void scoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /* Handling team yellow cards */

    public void addTeamAYellow(View view) {
        yellowA = yellowA + 1;
        yellowTeamA(yellowA);
    }

    public void addTeamBYellow(View view) {
        yellowB = yellowB + 1;
        yellowTeamB(yellowB);
    }

    public void yellowTeamA(int score) {
        Button scoreView = (Button) findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(score));
    }

    public void yellowTeamB(int score) {
        Button scoreView = (Button) findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(score));
    }

    /* Handling team corners */

    public void addTeamACorner(View view) {
        cornerA = cornerA + 1;
        cornerTeamA(cornerA);
    }

    public void addTeamBCorner(View view) {
        cornerB = cornerB + 1;
        cornerTeamB(cornerB);
    }

    public void cornerTeamA(int score) {
        Button scoreView = (Button) findViewById(R.id.team_a_corner);
        scoreView.setText(String.valueOf(score));
    }

    public void cornerTeamB(int score) {
        Button scoreView = (Button) findViewById(R.id.team_b_corner);
        scoreView.setText(String.valueOf(score));
    }

    /* Handling team red cards */

    public void addTeamARed(View view) {
        redA = redA + 1;
        redTeamA(redA);
    }

    public void addTeamBRed(View view) {
        redB = redB + 1;
        redTeamB(redB);
    }

    public void redTeamA(int score) {
        Button scoreView = (Button) findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(score));
    }

    public void redTeamB(int score) {
        Button scoreView = (Button) findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(score));
    }

    /* Reset button */

    public void resetScores(View view) {
        redTeamA(0);
        redTeamB(0);
        yellowTeamA(0);
        yellowTeamB(0);
        cornerTeamA(0);
        cornerTeamB(0);
        scoreTeamA(0);
        scoreTeamB(0);
        pointsTeamA = 0;
        pointsTeamB = 0;
        cornerA = 0;
        cornerB = 0;
        yellowA = 0;
        yellowB = 0;
        redA = 0;
        redB = 0;
    }
}
