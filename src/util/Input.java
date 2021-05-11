package util;

import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class Input {
    private String scanner;
    Scanner in = new Scanner(System.in);

    public Input(){
        this.scanner= "scan";
    }

    public String getString(){
        System.out.println("Enter input");
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

    public int getInt(int min, int max) {
        try {
            System.out.println("Please enter an integer within " + min + " and " + max + ":");
            int input = Integer.valueOf(this.getString());
            if (input >= min && input <= max) {
                return input;
            } else {
                return getInt(min, max);
            }
        } catch (Exception e) {
            System.out.println("This is not a valid input");
            return getInt(min, max);
        }
    }

    public int getInt(){
        System.out.println("Please enter an integer: ");
        return in.nextInt();
    }

    public double getDouble(double min, double max){
        try{
            System.out.println("Please enter a double within " + min + " and " + max + ":");
            double input = Double.valueOf(this.getString());
            if (input >= min && input <= max){
                return input;
            } else {
                getDouble(min,max);
            }
            return input;
        } catch (Exception e) {
            System.out.println("This is not a valid input");
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        System.out.println("Please enter a double: ");
        return in.nextDouble();
    }

//    public int getBinary(IntBinaryOperator binary){
//        try{
//            System.out.println("Please enter a binary number: ");
//            int input =
//        }
//    }

}
