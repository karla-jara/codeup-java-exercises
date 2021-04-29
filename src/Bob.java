import java.util.Scanner;
public class Bob {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Do you want to talk with Bob?");
        System.out.println("Gotta warn you... Bob is a teenager");
        System.out.println("Enter Y to proceed, or N is you changed your mind");


        String wanaTalk = in.next();
        if (wanaTalk.equalsIgnoreCase("Y")){

        }
    }

}
