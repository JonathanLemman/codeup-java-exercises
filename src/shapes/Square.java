package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    void setLength(double length) {
        super.length = length;
    }

    @Override
    void setWidth(double width) {
        super.width = width;
    }

    @Override
    public double getPerimeter() {
        return (2 * super.length) + (2 * super.width);
    }

    @Override
    public double getArea() {
        return super.length * super.width;
    }
}
