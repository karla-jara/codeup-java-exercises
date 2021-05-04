package util;

import java.util.Scanner;

public class Input {
    private String scanner;
    Scanner in = new Scanner(System.in);

    public String getString(){
        return scanner;
    }

    public boolean yesNo(){
        return scanner.equalsIgnoreCase("yes") || scanner.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max){
        System.out.println("Please enter a integer within " + min + " and " + max);
        if(in.nextInt() < min & in.nextInt() > max){
            getInt();
        }
        return in.nextInt();
    }

    public void getInt(){
        in.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.println("Please enter a double within " + min + " and " + max);
        if(in.nextDouble() < min & in.nextDouble() > max){
            getDouble();
        } return in.nextDouble();
    }

    public double getDouble(){
        return in.nextDouble();
    }

    public static void main(String[] args){
       yesNo(boolean);
    }
}
