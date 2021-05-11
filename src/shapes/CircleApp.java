package shapes;
import util.Input;

public class CircleApp {
    private static int circlesCreated = 0;
    public static void main(String [] args){

        boolean anotherCircle;

        do {

        System.out.println("Please enter the radius of your circle, ");

        Input inputRadius = new Input();
        double radius = inputRadius.getDouble();
        Circle circle = new Circle(radius);
        circlesCreated += 1;
        System.out.println("circle.getArea() = " + circle.getArea());
        System.out.println("circle.getCircumference() = " + circle.getCircumference());
        System.out.println("Would you like to create another circle?");
        Input inputForCircle = new Input();
        anotherCircle = inputForCircle.yesNo();
        } while (anotherCircle);
        System.out.println("Total number of circles created: " + circlesCreated);
    }
}
