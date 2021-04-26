import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String [] args){

        //1. copied code to main method:
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        // 2. Prompt a user to enter an integer and store that value in an int variable using nextInt method:
        // What happens if data entered is not an integer?
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInput = in.nextInt();
        System.out.println("You entered: \"" + userInput + "\" ");

        Scanner words = new Scanner(System.in);

        System.out.print("Please enter 3 words: ");



    }
}
