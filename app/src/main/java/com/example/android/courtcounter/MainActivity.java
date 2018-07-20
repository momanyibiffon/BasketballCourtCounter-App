package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int totalPointsForTeamA = 0;
    int totalPointsForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*displayForTeamA(8);*/
    }
    /*Team A
    Updates team A when three points button is clicked*/
    public void addThreeForTeamA(View view){
        totalPointsForTeamA = totalPointsForTeamA + 3;
        displayForTeamA(totalPointsForTeamA);
    }

    /*Updates team A when two points button is clicked*/
    public void addTwoForTeamA(View view){
        totalPointsForTeamA = totalPointsForTeamA + 2;
        displayForTeamA(totalPointsForTeamA);
    }
    /*Updates team A when one points button is clicked*/
    public void addOneForTeamA(View viw){
        totalPointsForTeamA = totalPointsForTeamA +1;
        displayForTeamA(totalPointsForTeamA);
    }
    /*Updates the total scores in team A when called in other methods*/
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /*Team B
    Updates team B when three points button is clicked*/
    public void addThreeForTeamB(View view){
        totalPointsForTeamB = totalPointsForTeamB + 3;
        displayForTeamB(totalPointsForTeamB);
    }

    /*Updates team A when two points button is clicked*/
    public void addTwoForTeamB(View view){
        totalPointsForTeamB = totalPointsForTeamB + 2;
        displayForTeamB(totalPointsForTeamB);
    }
    /*Updates team A when one points button is clicked*/
    public void addOneForTeamB(View view){
        totalPointsForTeamB = totalPointsForTeamB +1;
        displayForTeamB(totalPointsForTeamB);
    }
    /*Updates the total scores in team A when called in other methods*/
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /*Reseting the scores for both teams*/
    public void resetScores(View view){
        totalPointsForTeamA = 0;
        totalPointsForTeamB = 0;

        displayForTeamA(totalPointsForTeamA);
        displayForTeamB(totalPointsForTeamB);
    }
}
