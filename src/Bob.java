import java.util.Scanner;
public class Bob {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Do you want to talk with Bob?\n");
        System.out.println("Gotta warn you... Bob is a teenager\n");
        System.out.println("Enter Y to proceed, or N if you changed your mind: \n");


        String wanaTalk = in.next();

        while (wanaTalk.equalsIgnoreCase("Y")){
            System.out.println("Go ahead..");
            Scanner in2 = new Scanner(System.in);
            String talking = in2.next();
            if (talking.endsWith("?")){
                System.out.println("Sure.");
            }
            if (talking.endsWith("!")){
                System.out.println("Whoa, chill out!");
            }
            if (talking.endsWith(" ")){
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
        }
        while (wanaTalk.equalsIgnoreCase("N")){
            System.out.println("That's ok.. we get it");
            break;
        }
    }

}
