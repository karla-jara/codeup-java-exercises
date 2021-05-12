package shapes;

class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double setLength() {
        return length;
    }

    @Override
    public double setWidth() {
        return width;
    }

    @Override
    public double getPerimeter() {
        return (2*length) + (2*width);
    }

    @Override
    public double getArea() {
        return length*width;
    }
//
//    @Override
//    public double setLength() {
//        return this.length;
//    }
//
//    @Override
//    public double setWidth() {
//        return this.width;
//    }


//    private int side;
//
//    public Square(int side){
//        super(side, side);
//        this.side = side;
//    }
//
//    public int getArea(){
//        System.out.println("override");
//        return side*side;
//    }
//
//    public int getPerimeter(){
//        System.out.println("override");
//        return 4*side;
//    }


}
