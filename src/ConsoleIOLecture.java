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
        System.out.printf("My iPhone cost %d", currencyPennies);






    }
}
