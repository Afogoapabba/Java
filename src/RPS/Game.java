package RPS;

import java.util.Scanner;

public class Game
{
    public static void main(String[] args)
    {
        RockPaperScissors Game = new RockPaperScissors();

        Scanner scn = new Scanner(System.in);
        Fist fist = new Fist();

        Player player1 = new Player();
        Player playerCPU = new Player();
        player1.setName("Petter");
        playerCPU.setName("CPU");
        Game.setPlaying(true);
        System.out.println("Lets play Rock Paper Scissors! pick one Rock, Paper, Scissors");
        while (Game.isPlaying())
        {
            playerCPU.setChoice(fist.Play());

            if (scn.hasNextLine())
            {
                player1.setChoice(scn.nextLine().toUpperCase());
                Game.PlayRockPaperScissors(player1,playerCPU);
            }
            else
            {
                System.out.println("bad input");
            }

        }















    }
}
