package com.example.diceroller;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private int points = 0;

    public void roll_the_dice(final View view) {

        final TextView tv = findViewById(R.id.textView);
        EditText user_input = (EditText) findViewById(R.id.number_input);
        TextView score = findViewById(R.id.Score);
        Random rand = new Random();
        final int number = rand.nextInt(6) + 1;
        tv.setText(Integer.toString(number));
        int input = Integer.parseInt((user_input.getText().toString()));
        if (input < 1 || input > 6) {
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();

        }
            if (input == number) {
                Toast.makeText(this, "Congratulations", Toast.LENGTH_SHORT).show();
                points++;
                score.setText("Score:" + Integer.toString(points));
            } else {
                Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
            }

            Button play_dice_breakers = findViewById(R.id.button2);
            play_dice_breakers.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    List<String> Questions = new ArrayList<>();
                    Questions.add("If you could go anywhere in the world, where would you go?");
                    Questions.add("If you were stranded on a desert island, what three things would you want to take with you?");
                    Questions.add("If you could eat only one food for the rest of your life, what would that be?");
                    Questions.add("If you won a million dollars, what is the first thing you would buy?");
                    Questions.add("If you could spend the day with one fictional character, who would it be?");
                    Questions.add("If you found a magic lantern and a genie gave you three wishes, what would you wish?");

                    Random rand2 = new Random();
                         Questions.get(rand2.nextInt(Questions.size()));
                         final int number2 = rand2.nextInt(6) + 1;
                        if (number2 == 1){
                            tv.setText(Questions.get(0));
                        }
                        if (number2 == 2){
                        tv.setText(Questions.get(1));
                    }
                    if (number2 == 3){
                        tv.setText(Questions.get(2));
                    }
                    if (number2 == 4){
                        tv.setText(Questions.get(3));
                    }
                    if (number2 == 5){
                        tv.setText(Questions.get(4));
                    }
                    if (number2 == 6){
                        tv.setText(Questions.get(5));
                    }
                }
            });
        }
    }





