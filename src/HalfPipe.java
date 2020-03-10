public class HalfPipe extends Snowboarding
{
    private int points = 0;
    public HalfPipe()
    {
        super("Freestyle");
    }

    public String getSnowType()
    {
        return "groomed";
    }

    public String getGoal()
    {
        return "score the most points";
    }

    public int getPoints()
    {
        return points;
    }

    public void setPoints(int points)
    {
        this.points = points;
    }   

    public int compare(HalfPipe other)
    {
        if(this.getPoints() > other.getPoints())
            return 0;
        else if(this.getPoints() < other.getPoints())
            return 1;
        return -1;
    }

    public String toString()
    {
        return super.toString() + " points: " + getPoints();
    }
}