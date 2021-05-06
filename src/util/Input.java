package util;

import java.util.Scanner;

public class Input {
    private String scanner;

    public Input(){
        this.scanner= "scan";
    }

    Scanner in = new Scanner(System.in);


    public String getString(){
        return scanner;
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
        return in.nextInt();

    }

    public int getInt(){
        System.out.println("Please enter an integer: ");
        return in.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.println("Please enter a double within " + min + " and " + max + ":");
        return in.nextDouble();
    }

    public double getDouble(){
        System.out.println("Please enter a double: ");
        return in.nextDouble();
    }

}
