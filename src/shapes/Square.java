package shapes;

public class Square extends Rectangle {
    // constructor
    public Square(int length, int width,int side) {
        super(length, width);
        super.length = side;
        super.width = side;
    }
}
