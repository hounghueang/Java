package Shape;
public class Square extends Rectangle{
    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return width;
    }
    public void setSide(double side){
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side) {
        setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" + "width=" + width + ", length=" + length + ", color='" + color + '\'' + ", filled=" + filled + '}';
    }
}
