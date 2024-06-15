import java.awt.*;

public class Ex {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(new Point(0,0),1);
        c1.setCentre(new Point(0,0));
        c1.setRadius(5);
        System.out.println(c1.radius);
        System.out.println(c1.centre);
        System.out.println(c2.radius);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
    }
}
