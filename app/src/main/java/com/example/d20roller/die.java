package com.example.d20roller;
import java.util.Random;

public class die {

    public die(int sides){
        num_sides = sides;
    }

    // Generates random int between 1 and num_sides (inclusive)
    public int roll(){
        Random rand = new Random();
        int result = rand.nextInt(num_sides) + 1;
        return result;
    }

    private int num_sides;
}
