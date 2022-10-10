public class Player
{
  private String name;
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    private int score;

    public void setScore(int score)
    {
       this.score += score;
    }

    public int getScore()
    {
        return score;
    }

    private String choice;

    public String getChoice()
    {
        return choice;
    }

    public void setChoice(String choice)
    {
        this.choice = choice;
    }
}
