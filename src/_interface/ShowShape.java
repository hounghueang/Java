package _interface;

public class ShowShape {
    public static void main(String[] args){
        IShape c1 = new Circle(8);
        IShape r1 = new Rectangle(6,7);
        IShape[] list = {c1,r1};
                for (IShape s: list){
                    System.out.println(s.getArea()+"\n"+s.getPerimeter());
                }
    }
}
