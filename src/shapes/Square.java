package shapes;

public abstract class Square extends Quadrilateral {
    public Square(int l, int w) {
        super(l, w);
    }

    @Override
    public int setLength() {
        return this.length;
    }

    @Override
    public int setWidth() {
        return this.width;
    }


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
