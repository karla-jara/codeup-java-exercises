package shapes;

abstract class Quadrilateral extends Shape {

    protected int length;
    protected int width;

    public Quadrilateral(int l, int w){
            length = l;
            width = w;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }




}
