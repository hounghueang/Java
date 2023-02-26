package _interface;

public class Rectangle implements IShape{
    double Width;
    double Length;
    public Rectangle(double width, double length){
        this.Width = width;
        this.Length = length;
    }
    @Override
    public double getArea() {
        return Width*Length;
    }

    @Override
    public double getPerimeter() {
        return 2*Length*Width;
    }
}
