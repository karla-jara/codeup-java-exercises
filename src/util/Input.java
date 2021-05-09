package util;

import java.util.Scanner;

public class Input {
    private String scanner;
    Scanner in = new Scanner(System.in);

    public Input(){
        this.scanner= "scan";
    }

    public String getString(){
        System.out.println("Please enter something");
//        Input inputOf = new Input();
        String input = in.nextLine();
        return input;
    }

    public boolean yesNo(){
        System.out.println("Enter yes or no");
        String input = in.nextLine();
        if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")){
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max){
        System.out.println("Please enter an integer within " + min + " and " + max + ":");
        int input = in.nextInt();
        if (input <= min || input >= max) {
            getInt(min, max);
        } else {
            return input;
        }
        return input;
    }

    public int getInt(){
        System.out.println("Please enter an integer: ");
        return in.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.println("Please enter a double within " + min + " and " + max + ":");
        double input = in.nextDouble();
        if (input <= min || input >= max){
            getDouble(min,max);
        } else {
            return input;
        }
        return input;
    }

    public double getDouble(){
        System.out.println("Please enter a double: ");
        return in.nextDouble();
    }


}
