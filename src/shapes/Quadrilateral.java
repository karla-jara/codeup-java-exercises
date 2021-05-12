package shapes;

abstract class Quadrilateral extends Shape implements Measurable{

    protected double length;
    protected double width;

    public Quadrilateral(double l, double w){
            this.length = l;
            this.width = w;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public abstract double setLength();

    public abstract double setWidth();




}
