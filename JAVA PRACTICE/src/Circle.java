import java.awt.*;

public class Circle {
    Point centre;
    Double radius;
    Circle(){};
    Circle (Point centre, double radius) {
        this.centre= centre;
        this.radius = radius;
    }
    double getPerimeter(){
        return 2* Math.PI*radius;
    }
    double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    void setCentre(Point centre){
        this.centre = centre;
    }

}
