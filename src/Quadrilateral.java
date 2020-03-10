public abstract class Quadrilateral
{
    public static final int NUM_SIDES = 4;
    private int[] sides;
    private int[] angles;

    public Quadrilateral(int[] sides, int [] angles)
    {
        this.sides = sides;
        this.angles = angles;
    }

    public int getSide(int index)
    {
        return sides[index];
    }

    public int calcPerimeter(){int perm = 0;for(int i : sides){perm += i;}return perm;}

    public abstract double calcArea();

    public String toString(){
        String result = "Quadrilateral: ";
        for (int i : sides) {
            result += i + " "; 
        }
        return result;
    }

    public static void main(String[] args) {
//        Quadrilateral q = new Quadrilateral({1,2,3,4}, {90,90,90,90});
    }
}