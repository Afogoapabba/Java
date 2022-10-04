import java.util.Random;

public class Fist
{



    public String Play()
    {
         Random rng = new Random();
         String output;
         int input = rng.nextInt(3);

        if (input == 0)
        {
            output = "ROCK";
        }
        else if (input == 1)
        {
            output = "PAPER";
        }
        else
        {
            output = "SCISSOR";
        }
        return output;

    }




}
