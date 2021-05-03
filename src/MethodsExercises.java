import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args){
        // called methods from outside main
        addition(3, 3);
        subtraction(3, 3);
        multiplication(3, 3);
        division(3, 3);
        modulus(32, 3);// if num2 is zero exception error
        System.out.println(multiplyWithoutOperator(3, 3));
//        System.out.println(addRecur(30, 3));

        //2.
        getInteger(1,10);
        //3.
        getFactorial();
        //4.
        diceRoll();
    }

    // 2. Method that validates user input is in certain range
    public static int getInteger (int min, int max){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 10: ");
        int inputNum = in.nextInt();
        if (inputNum > 0 && inputNum <= 10){
            System.out.println("Congratulations, your number is valid!");
        } else{
            System.out.println("Sorry, that is not within the range of 1 to 10");
            getInteger(1, 10);
        }
        return inputNum;
    }

    //3. Finds the factorial value
    public static void goAgain(){
        System.out.println("Ok, thank you for playing. Come back any time!");
    }
    public static long getFactorial (){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 10: ");
        long inputNum = in.nextLong();
        if (inputNum > 0 && inputNum <= 10){
            Scanner proceed = new Scanner(System.in);
            System.out.println("Number " + inputNum + " is valid. Would you like to continue? \n Please enter Y for yes or N for no.");
            String answer = proceed.next();
            if (answer.equalsIgnoreCase("y")){
                long factored = 1;
                for (var f = 1; f <= inputNum; f++){
                    factored = factored * f;
                    System.out.println(inputNum + "! = " + inputNum + " x " + f + " = " + factored);
                }
            }else if (answer.equalsIgnoreCase("n")){
                goAgain();
            }
                Scanner proceed2 = new Scanner(System.in);
                System.out.println("Would you like to continue? \n Please enter Y for yes or N for no.");
                String answer2 = proceed2.next();

                if (answer2.equalsIgnoreCase("n")){
                    goAgain();
                }else if (answer2.equalsIgnoreCase("y")){
                    getFactorial();
                } else {
                    System.out.println("Sorry, you entry was not valid :(");
                }
        }
        return inputNum;
    }



    // 4.  Create an application that simulates dice rolling.
    public static int diceRoll(){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number of sides on a pair of dice: ");
        int sides = in.nextInt();
        System.out.println("Thank you for your input, Now let's roll the dice!");
        while (true){
            int diceA = (int)(Math.random()*sides+1);
            int diceB = (int)(Math.random()*sides+1);
            int rollTotal = diceA + diceB;
            System.out.println("Total points for this roll is: " + rollTotal);
            if (rollTotal==2 || rollTotal==3 || rollTotal==12){
                System.out.println("With a total of " + rollTotal + " points rolled. The game ends :(\n" );
                break;
            } else if (rollTotal==7 || rollTotal==11){
                System.out.println("Great roll! You totalled " + rollTotal + "! \n You Win!!");
                break;
            }
            Scanner proceed3 = new Scanner(System.in);
            System.out.println("Would you like to continue? \n Please enter Y for yes or N for no.");
            String answer3 = proceed3.next();

            if (answer3.equalsIgnoreCase("n")){
                goAgain();
            }else if (answer3.equalsIgnoreCase("y")){
                diceRoll();
            } else {
                System.out.println("Sorry, you entry was not valid :(");
            }
        } return sides;

    }

    // 5. Game Development 101


    // Addition
    public static void addition(int num1, int num2){
        System.out.println(num1 + num2);
    }

    // Subtraction
    public static void subtraction(int num1, int num2){
        System.out.println(num1 - num2);
    }

    // Multiplication
    public static void multiplication(int num1, int num2){
        System.out.println(num1*num2);
    }

    // Division
    public static void division(int num1, int num2){
        System.out.println(num1/num2);
    }

    // Modulus
    public static void modulus(int num1, int num2){
        System.out.println(num1 % num2);
    }

    // Multiply without the multiplication operator
    public static int multiplyWithoutOperator(int num1, int num2){
        int product = 0;
        for(int i = 0; i<num2;i++){

            product += num1;
        }
        return product;
    }

}
