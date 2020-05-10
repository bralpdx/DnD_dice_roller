package com.example.d20roller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView roll_value = findViewById(R.id.roll_value);

        ImageButton d4Button = findViewById(R.id.d4_button);
        ImageButton d6Button = findViewById(R.id.d6_button);
        ImageButton d8Button = findViewById(R.id.d8_button);
        ImageButton d10Button = findViewById(R.id.d10_button);
        ImageButton d12Button = findViewById(R.id.d12_button);
        ImageButton d20Button = findViewById(R.id.d20_button);

        // Updates roll_value when d4 die is rolled
        d4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roll_value.setText(roll_die(4));
            }
        });
        // Updates roll_value when d6 die is rolled
        d6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roll_value.setText(roll_die(6));
            }
        });
        // Updates roll_value when d8 die is rolled
        d8Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roll_value.setText(roll_die(8));
            }
        });
        // Updates roll_value when d10 die is rolled
        d10Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roll_value.setText(roll_die(10));
            }
        });
        // Updates roll_value when d12 die is rolled
        d12Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roll_value.setText(roll_die(12));
            }
        });
        // Updates roll_value when d20 die is rolled
        d20Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roll_value.setText(roll_die(20));
            }
        });
    }

    // Creates die of num sides and "rolls" die, returning result
    // as a string.
    private String roll_die(int num){
        if(num < 4 || num > 20)
            throw new Error("Invalid die size encountered");
        die a_die = new die(num);
        int result = a_die.roll();
        String text_res = Integer.toString(result);

        return  text_res;
    }
}
