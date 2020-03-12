public class Carrot extends Vegetable {
    private String instructions;
    public Carrot()
    {
        super("Carrot", "Root");
        instructions = "plant in the ground and water";
    }

    @Override
    public String feed() {
        return null;
    }

    @Override
    public String water() {
        return null;
    }

    @Override
    public String getInstructions() {
        return instructions;
    }

    @Override
    public String harvest() {
        return null;
    }
}
