public class Square extends Rectangle{
    int s = 0;
    public Square(int s){
        super(s, s);
    }

    public String toString()
    {
        return super.toString() + " [SQUARE]";
    }

    public static void main(String[] args) {
        Quadrilateral[] shapes = {new Rectangle(4, 8), new Square(5)};
        System.out.println(shapes[0]);
        System.out.println(shapes[1]);
    }
}