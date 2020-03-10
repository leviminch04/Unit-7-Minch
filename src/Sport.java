import java.util.ArrayList;

public class Sport
{
    private String name = "";
    
    String goal = "";
    ArrayList<String> rules = new ArrayList<>();

    public Sport(String name, String goal)
    {
        this.name = name;
        this.goal = goal;
    }

    public String getName()
    {
        return name;
    }

    public String getGoal()
    {
        return goal;
    }
    public String rules()
    {
        return rules.toString();
    }
    public ArrayList<String> getRules()
    {
        return rules;
    }

    public void addRule(String rule)
    {
        rules.add(rule);
    }

    public void setGoal(String goal)
    {
        this.goal = goal;
    }
}