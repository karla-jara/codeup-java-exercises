import java.util.Arrays;

public class ConsoleIOLecture {
    public static void main(String[] args){
        System.out.println("Console IO Lecture");


        //=================print() and println()

        //this:
//        System.out.println("here");
//        System.out.println("there");
        // prints here next line there

        System.out.print("here\n");
        System.out.print("there\n");

        System.out.print("here");
        System.out.print("there");

        String firstName = "Karla";
        String lastName = "Jara";
        System.out.println(firstName + " " + lastName);


        /// printf() / .format()

        // Print a formatted string using th following .. printf(formatString)

        // same output as print():
        System.out.printf("Hello , %s!\n", firstName);
        System.out.printf("Hello , %s %s!\n", firstName, lastName);

        //numbers
        int numberOfPets = 3;
        String typeOfPets = "cats";
        System.out.printf("I have %d %s. \n", numberOfPets, typeOfPets);


        // currency:
        int currencyPennies = 1000;
        System.out.printf("My iPhone cost %d \n", currencyPennies);

        //============================array demos==========================

        // declares and array
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize elements
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("These are the elements in the array: " + Arrays.toString(anArray));

        // can also create array with shortcut syntax:
        int[] shortSyntaxArray = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33};
        System.out.println("Theses are the elements of another array: " + Arrays.toString(shortSyntaxArray));

        String [][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones", "Jara"}
        };

        System.out.println(names[0][0] + names[1][0]);
        System.out.println(names[0][2] + names[1][1]);
        System.out.println("The length of anArray is: " + anArray.length);
        System.out.println("The length of names is: " + names.length);

        // Copy data from one array to the other

        char [] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
//        char [] copyTo = new char [7]; // longer version

        char [] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2,9);

//        System.arraycopy(copyFrom, 2, copyTo, 0, 7); // longer version than above
        System.out.println(new String(copyTo));


    }
}
