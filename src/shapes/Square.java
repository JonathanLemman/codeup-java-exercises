package shapes;

public class Square extends Rectangle {

    private int side;

    // constructor
    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    // methods
    public int getArea() {
        return (int) Math.pow(side, 2);
    }

    public int getPerimeter() {
        return 4 * side;
    }

}
