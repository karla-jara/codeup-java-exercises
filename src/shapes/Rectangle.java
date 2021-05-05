package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int rectangleLength, int rectangleWidth){
        length = rectangleLength;
        width = rectangleWidth;
    }

    public int getArea(int recLength, int recWidth){
        return this.length*this.width;
    }

    public int getPerimeter(int recLength, int recWidth){
        return (2*this.length) + (2*this.width);
    }


}
