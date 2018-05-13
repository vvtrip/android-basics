package com.example.android.courtcounter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreteamA=0;
    int scoreteamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the three pointer for Team A.
     */
    public void athree(View v) {
        scoreteamA+=3;
        displayForTeamA(scoreteamA);

    }

    /**
     * Displays the two pointer for Team A.
     */
    public void atwo(View v) {
        scoreteamA+=2;
       displayForTeamA(scoreteamA);

    }

    /**
     * Displays the one pointer for Team A.
     */
    public void afree(View v) {
        scoreteamA+=1;
        displayForTeamA(scoreteamA);
    }
    /**
     * Displays the three pointer for Team B.
     */
    public void bthree(View v) {
        scoreteamB+=3;
        displayForTeamB(scoreteamB);

    }

    /**
     * Displays the two pointer for Team B.
     */
    public void btwo(View v) {
        scoreteamB+=2;
        displayForTeamB(scoreteamB);

    }

    /**
     * Displays the one pointer for Team B.
     */
    public void bfree(View v) {
        scoreteamB+=1;
        displayForTeamB(scoreteamB);
    }
    /**
     * Resets the score for both the teams.
     */
    public void reset(View v) {
        displayForTeamA(0);
        displayForTeamB(0);
        scoreteamA=0;
        scoreteamB=0;
    }
}
