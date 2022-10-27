package RPS;

import java.util.Random;

public class Fist
{
    static final String rock = "ROCK";
    static final String paper = "PAPER";
    static final String scissor = "SCISSOR";


    public String Play()
    {
         Random rng = new Random();
         String output;
         int input = rng.nextInt(3);

        if (input == 0)
        {
            output = rock;
        }
        else if (input == 1)
        {
            output = paper;
        }
        else
        {
            output = scissor;
        }
        return output;

    }




}
