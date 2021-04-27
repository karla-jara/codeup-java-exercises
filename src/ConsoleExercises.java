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
        String word1 = words.next();
        String word2 = words.next();
        String word3 = words.next();

        System.out.println("Your first word entered is: \n" + word1);
        System.out.println("Your second word entered is: \n" + word2);
        System.out.println("Your third word entered is: \n" + word3);
        System.out.println("Your words entered together are: \n" + word1 + " " + word2 + " " + word3);

        Scanner sentence = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentenceInput = sentence.nextLine();
        System.out.println("The sentence entered is: " + sentenceInput);

        // Calculate the perimeter of the classroom

        Scanner length = new Scanner(System.in);
        Scanner height = new Scanner(System.in);

        System.out.print("Please enter the classroom height: ");
        double heightInput = height.nextDouble();
        System.out.print("Please enter the classroom length:");
        double lengthInput = length.nextDouble();

        // Area of classroom
        double area = heightInput * lengthInput;
        System.out.println("The area of classroom is: " + area);

        // Perimeter of classroom
        double perimeter = (2*heightInput) + (2*lengthInput);
        System.out.println("The perimeter of the classroom is: " + perimeter);






    }
}
