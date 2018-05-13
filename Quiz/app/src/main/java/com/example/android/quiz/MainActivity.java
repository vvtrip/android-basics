package com.example.android.quiz;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    RadioButton q1c3;
    RadioButton q2c2;
    RadioButton q3c3;
    CheckBox q4c1;
    CheckBox q4c2;
    CheckBox q4c3;
    CheckBox q4c4;
    RadioButton q5c1;
    RadioButton q6c2;
    RadioButton q7c2;
    RadioButton q8c1;
    RadioButton q9c3;
    EditText q10a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submit(View view) {
        int answer1_score = 0;
        int answer2_score = 0;
        int answer3_score = 0;
        int answer4_score = 0;
        int answer5_score = 0;
        int answer6_score = 0;
        int answer7_score = 0;
        int answer8_score = 0;
        int answer9_score = 0;
        int answer10_score = 0;
        int final_score = 0;
        String result;

        //question 1
        Boolean answer1;

        q1c3 = (RadioButton) this.findViewById(R.id.q1c3);
        answer1 = q1c3.isChecked();
        if (answer1) {
            answer1_score = 1;
        }

        //question 2
        Boolean answer2;

        q2c2 = (RadioButton) this.findViewById(R.id.q2c2);
        answer2 = q2c2.isChecked();
        if (answer2) {
            answer2_score = 1;
        }


        //question 3
        Boolean answer3;

        q3c3 = (RadioButton) this.findViewById(R.id.q3c3);
        answer3 = q3c3.isChecked();
        if (answer3) {
            answer3_score = 1;
        }

        //question 4
        Boolean answer4c1;
        Boolean answer4c2;
        Boolean answer4c3;
        Boolean answer4c4;

        q4c1 = (CheckBox) this.findViewById(R.id.q4c1);
        q4c2 = (CheckBox) this.findViewById(R.id.q4c2);
        q4c3 = (CheckBox) this.findViewById(R.id.q4c3);
        q4c4 = (CheckBox) this.findViewById(R.id.q4c4);

        answer4c1 = q4c1.isChecked();
        answer4c2 = q4c2.isChecked();
        answer4c3 = q4c3.isChecked();
        answer4c4 = q4c4.isChecked();
        if (answer4c1 && answer4c2 && answer4c3 && !answer4c4) {
            answer4_score = 1;
        }

        //question 5
        Boolean answer5;

        q5c1 = (RadioButton) this.findViewById(R.id.q5c1);
        answer5 = q5c1.isChecked();
        if (answer5) {
            answer5_score = 1;
        }

        //question 6
        Boolean answer6;

        q6c2 = (RadioButton) this.findViewById(R.id.q6c2);
        answer6 = q6c2.isChecked();
        if (answer6) {
            answer6_score = 1;
        }

        //question 7
        Boolean answer7;

        q7c2 = (RadioButton) this.findViewById(R.id.q7c2);
        answer7 = q7c2.isChecked();
        if (answer7) {
            answer7_score = 1;
        }

        //question 8
        Boolean answer8;

        q8c1 = (RadioButton) this.findViewById(R.id.q8c1);
        answer8 = q8c1.isChecked();
        if (answer8) {
            answer8_score = 1;
        }

        //question 9
        Boolean answer9;

        q9c3 = (RadioButton) this.findViewById(R.id.q9c3);
        answer9 = q9c3.isChecked();
        if (answer9) {
            answer9_score = 1;
        }

        //question 10
        String answer10;

        q10a = (EditText) this.findViewById(R.id.q10a);
        answer10 = q10a.getText().toString();
        if (answer10.equals("+91")) {
            answer10_score = 1;
        }


        // final score

        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
                answer6_score + answer7_score + answer8_score + answer9_score + answer10_score;

        result = "You scored " + final_score + " out of 10.";

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, result, duration);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.show();
    }
}
