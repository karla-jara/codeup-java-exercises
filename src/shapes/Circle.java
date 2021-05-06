package shapes;

public class Circle {
    private double radius;

    public Circle(double rad){
        radius = rad;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public double getArea(){
        return Math.PI*(radius*radius);
    }

    public double getCircumference(){
        return  2*(Math.PI*radius);
    }


}
