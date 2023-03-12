package Shape;

public class TestAbstractShape {
    public static void main(String[] args){
        Shape c1 = new Circle("width", false, 4);
        Shape c2 = new Circle("width", false, 5);
        Shape r1 = new Rectangle(6,6);
        Shape r2 = new Rectangle(7,8);
        Shape S1 = new Square(9);
        Shape S2 = new Square(5);
        Shape [] list = {c1,c2,r1,r2,S1,S2};
        for (Shape i: list) {
            System.out.println(i.toString());


        }
    }
}
