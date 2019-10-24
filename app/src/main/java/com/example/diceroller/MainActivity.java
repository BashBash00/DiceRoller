package com.example.diceroller;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int number_input;


    EditText number_input1;



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

    public void on_button_click(View view) {

        TextView tv = this.findViewById(R.id.textView);
        TextView tv2 = this.findViewById(R.id.textView2);
        TextView score = this.findViewById(R.id.Score);
        int Score1 = 0;
        Score1++;
        Score1.toString();
        score.setText(Integer.toString(Score1));
        Random r = new Random();
        int number = r.nextInt(7 - 1) + 1;
        tv.setText(Integer.toString(number));

        number_input1 = findViewById(R.id.number_input);
        number_input = Integer.valueOf(number_input1.getText().toString());
        if (number_input == r.nextInt(7 - 1) + 1) {

            tv2.setText("Congratulations !");
            score.setText(Score1);
            Score1++;
            //Score1.toString#
            //number_input hint should be 0



        }
        else{
            tv2.setText("");
        }

    }
}


