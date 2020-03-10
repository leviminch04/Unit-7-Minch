public class Snowboarding extends Sport
{
    String boardType= "";
    String rule = "dont fall";
    String conditions = "";
    String snowType = "";
    public Snowboarding(String boardType)
    {
        super("snowboarding","dont fall");
        this.boardType = boardType;
    }

    public void setConditions(String conditions)
    {
        this.conditions = conditions;
    }

    public String getConditions()
    {
        return conditions;
    }

    public void boardType(String boardType)
    {
        this.boardType = boardType;
    }

    public void setSnowType(String snowType)
    {
        this.snowType = snowType;
    }

    public String getSnowType()
    {
        return snowType;
    }

    public String getBoardType()
    {
        return boardType;
    }
    
    public String rules()
    {
        return rule;
    }

    public int compare(Snowboarding other)
    {
        if(this.getBoardType().equals(other.getBoardType()))
            return 1;
        return -1;
    }

    public String toString()
    {
        return "board type: " + this.getBoardType() + " conditions: " + this.getConditions();
    }
}