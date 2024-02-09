package com.example.bootcampapp.Screens.Screens.Helper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bootcampapp.R;

public class AndroidActivity extends AppCompatActivity {


    // ARRAY OF QUESTIONS ============================================
    private String[] questionsArray= {"Q.1 Which company developed android?", "Q.2 What is the current version of Android Studio?(as of Feb 2024)", "Q.3 Which is the official language of Android?", "Q.4 Who is the biggest competitor of android?"};


    private String[] btnOption1Text = {"Google", "Flamingo", "Java", "Windows"};
    private String[] btnOption2Text = {"Amazon", "Giraffe", "Swift","Linux" };
    private String[] btnOption3Text = {"Jet Brains", "Hedgehog", "C++","IOS" };
    private String[] btnOption4Text = {"Microsoft", "Monkey", "Kotlin", "Symbian"};


    private boolean[] validateOption1 = {true, false, false, false};
    private boolean[] validateOption2 = {false, false, false, false};
    private boolean[] validateOption3 = {false, true, false, true};
    private boolean[] validateOption4 = {false, false, true, false};

    private int index = 0;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);

        TextView question = findViewById(R.id.question);
        Button button1 = findViewById(R.id.opt1);
        Button button2 = findViewById(R.id.opt2);
        Button button3 = findViewById(R.id.opt3);
        Button button4 = findViewById(R.id.opt4);

        question.setText(questionsArray[index]);
        button1.setText(btnOption1Text[index]);
        button2.setText(btnOption2Text[index]);
        button3.setText(btnOption3Text[index]);
        button4.setText(btnOption4Text[index]);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index < questionsArray.length) {
                    boolean[] currentValidation = null;
                    Button clickedButton = (Button) view;

                    if (view == button1) {
                        currentValidation = validateOption1;
                    } else if (view == button2) {
                        currentValidation = validateOption2;
                    } else if (view == button3) {
                        currentValidation = validateOption3;
                    } else if (view == button4) {
                        currentValidation = validateOption4;
                    }

                    if (currentValidation != null) {
                        if (currentValidation[index])
                                score++;
                    }
                }
            }
        };

    }
}