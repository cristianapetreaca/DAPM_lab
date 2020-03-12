package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class XandO extends AppCompatActivity {


    int activePlayer = 0;
    boolean gameIsActive = true;
    // 2 unplayed
    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    int[][] winningPositions = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x_a_n_do);
    }

    public void dropIn(View view) {
        ImageView counter = (ImageView) view;
        // get the current Image View (counter tag)
        int tappedCounter = Integer.parseInt(counter.getTag().toString());

        //if the space is empty(is 2) and the game is not over
        if (gameState[tappedCounter] == 2 && gameIsActive) {
            //set the current player
            gameState[tappedCounter] = activePlayer;
            if (activePlayer == 0) {
                // setImageResource for counter as x
                counter.setImageResource(R.drawable.x);
                // change the player's turn
                activePlayer = 1;
            } else {
                // setImageResource for counter as zero
                counter.setImageResource(R.drawable.zero);
                activePlayer = 0;
            }
            for (int[] winningPosition : winningPositions) {
                if (gameState[winningPosition[0]] == gameState[winningPosition[1]] &&
                        gameState[winningPosition[1]] == gameState[winningPosition[2]] &&
                        gameState[winningPosition[0]] != 2) {

                    gameIsActive = false;
                    String winner = "Player2 -> 0";

                    if (gameState[winningPosition[0]] == 0) {
                        winner = "Player1 -> x";
                    }

                    TextView textView = findViewById(R.id.winner);
                    textView.setText(winner + " has won!");
                    LinearLayout linearLayout = findViewById(R.id.playAgain);
                    linearLayout.setVisibility(View.VISIBLE);


                } else {
                    boolean gameIsOver = true;

                    for (int counterState : gameState) {
                        if (counterState == 2)
                            gameIsOver = false;
                    }
                    if (gameIsOver) {

                        TextView textView = findViewById(R.id.winner);
                        textView.setText("It's a draw");
                        LinearLayout linearLayout = findViewById(R.id.playAgain);
                        linearLayout.setVisibility(View.VISIBLE);


                    }
                }
            }
        }
    }

    public void playAgain(View view) {
        gameIsActive = true;
        LinearLayout layout = (LinearLayout)findViewById(R.id.playAgain);
        layout.setVisibility(View.INVISIBLE);
        activePlayer = 0;
        for (int i = 0; i < gameState.length; i++) {
            gameState[i] = 2;
        }
        GridLayout gridLayout = (GridLayout)findViewById(R.id.gridLayout);
        for (int i = 0; i < gridLayout.getChildCount(); i++) {
            ((ImageView) gridLayout.getChildAt(i)).setImageResource(0);
        }


    }


}
