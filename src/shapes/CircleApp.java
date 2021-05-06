package shapes;

import java.util.Scanner;
import util.Input;
public class CircleApp {
    public static void main(String [] args){
//        System.out.println("please enter the radius of a circle: ");
//        Scanner radius = new Scanner(System.in);
//

        Input inputRadius = new Input();
//        System.out.println("inputRadius.getInt() = " + inputRadius.getInt());
        double radi = inputRadius.getDouble();
        Circle circle = new Circle(radi);

        System.out.println("circle.getArea() = " + circle.getArea());
        System.out.println("circle.getCircumference() = " + circle.getCircumference());

    }
}
