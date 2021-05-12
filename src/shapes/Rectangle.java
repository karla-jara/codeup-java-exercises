package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double l, double w) {
        super(l, w);
    }

    @Override
    public double setLength() {
        return 0;
    }

    @Override
    public double setWidth() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return (2*length) + (2*width);
    }

    @Override
    public double getArea() {
        return length*width;
    }


//    protected int length;
//    protected int width;
//
//    public Rectangle(int rectangleLength, int rectangleWidth){
//        length = rectangleLength;
//        width = rectangleWidth;
//    }
//
//    public int getArea(){
//        return length*width;
//    }
//
//    public int getPerimeter(){
//        return (2*length) + (2*width);
//    }


}
