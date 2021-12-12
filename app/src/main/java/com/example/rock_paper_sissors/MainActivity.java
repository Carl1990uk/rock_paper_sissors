package com.example.rock_paper_sissors;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // 1: rock, 2: paper, 3: scissors
    // rock > scissors
    // scissors > paper
    // paper > rock

    public void newGame(View view){
        TextView textUsersScore = (TextView) findViewById(R.id.textUsersScore);
        textUsersScore.setText("0");
        TextView textComputerScore = (TextView) findViewById(R.id.textComputerScore);
        textComputerScore.setText("0");
        int rand = new Random().nextInt(3) + 1;
    }
    public void userScore(){
        TextView textUsersScore = (TextView) findViewById(R.id.textUsersScore);
        Integer usersc = Integer.parseInt(textUsersScore.getText().toString());
        usersc++;
        String UserScored = String.valueOf(usersc);
        textUsersScore.setText(UserScored);
    }
    public void computerScore(){
        TextView textComputerScore = (TextView) findViewById(R.id.textComputerScore);
        Integer userCS = Integer.parseInt(textComputerScore.getText().toString());
        userCS++;
        String UserScored = String.valueOf(userCS);
        textComputerScore.setText(UserScored);
    }

    public void rock(View view){
        int rand = new Random().nextInt(3) + 1;
        if(rand == 3){
            Log.i("Info", "Rock won");
            userScore();
        } else{
            Log.i("Info", "you wong");
            computerScore();
        }
    }
    public void paper(View view){
        int rand = new Random().nextInt(3) + 1;
        if(rand == 1){
            Log.i("Info", "paper won");
            userScore();
        }else{
            Log.i("Info", "you wong");
            computerScore();
        }
    }public void scissors(View view){
        int rand = new Random().nextInt(3) + 1;
        if(rand == 2){
            Log.i("Info", "scissors won");
            userScore();
        }else{
            Log.i("Info", "you wong");
            computerScore();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textUsersScore = (TextView) findViewById(R.id.textUsersScore);
        textUsersScore.setText("0");
        TextView textComputerScore = (TextView) findViewById(R.id.textComputerScore);
        textComputerScore.setText("0");
    }
}