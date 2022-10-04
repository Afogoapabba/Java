

public class RockPaperScissors
{
    private boolean playing;

    public boolean isPlaying()
    {
        return playing;
    }

    public void setPlaying(boolean playing)
    {
        this.playing = playing;
    }

    public void PlayRockPaperScissors(Player player, Player cpu)
    {
        switch (player.getChoice())
        {
            case "ROCK":
                if (cpu.getChoice().equals("SCISSOR"))
                {
                    System.out.println(cpu.getName()+" picked "+cpu.getChoice()+", "+player.getName()+" Wins!");
                    player.score +=1;
                }
                else if (cpu.getChoice().equals("PAPER"))
                {
                    System.out.println(cpu.getName()+" picked "+cpu.getChoice()+", "+player.getName()+" Lose!");
                    cpu.score +=1;
                }
                else
                {
                    System.out.println(cpu.getName()+" picked "+cpu.getChoice()+" it's a draw.");
                }
                break;
            case "PAPER":
                if (cpu.getChoice().equals("ROCK"))
                {
                    System.out.println(cpu.getName()+" picked "+cpu.getChoice()+", "+player.getName()+" Wins!");
                    player.score +=1;
                }
                else if (cpu.getChoice().equals("SCISSOR"))
                {
                    System.out.println(cpu.getName()+" picked "+cpu.getChoice()+", "+player.getName()+" Lose!");
                    cpu.score +=1;
                }
                else
                {
                    System.out.println(cpu.getName()+" picked "+cpu.getChoice()+" it's a draw.");
                }
                break;
            case "SCISSOR":
                if (cpu.getChoice().equals("PAPER"))
                {
                    System.out.println(cpu.getName()+" picked "+cpu.getChoice()+", "+player.getName()+" Wins!");
                    player.score +=1;
                }
                else if (cpu.getChoice().equals("ROCK"))
                {
                    System.out.println(cpu.getName()+" picked "+cpu.getChoice()+", "+player.getName()+" Lose!");
                    cpu.score +=1;
                }
                else
                {
                    System.out.println(cpu.getName()+" picked "+cpu.getChoice()+" it's a draw.");
                }
                break;
            default:
                System.out.println("Bad input!, valid inputs are 'rock', 'paper,'scissors");

        }
        System.out.println(player.getName()+" : "+player.score);
        System.out.println(cpu.getName()+" : "+cpu.score);

        System.out.println(" Best of 3, play again!");

        if (player.score >= 3 || cpu.score >=3)
        {
            playing = false;

            String winner;
            if (player.score > cpu.score)
            {
                winner = player.getName();
            }
            else
            {
                winner = cpu.getName();
            }
            System.out.println("Winner BO3 = "+ winner);
        }
    }
}
