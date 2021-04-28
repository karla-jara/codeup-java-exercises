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

        System.out.print(getInteger(1, 10));



    }



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
        //
    }

    // Multiply without the multiplication operator
    public static int multiplyWithoutOperator(int num1, int num2){
        int product = 0;
        for(int i = 0; i<num2;i++){

            product += num1;
        }
        return product;
    }

    // Do above with recursion
//
//    public static int addRecur(int num1, int num2){
//        int addedRecur = 0;
//        if ((num1 >= 0) & (num2 >=0)) {
//            addedRecur = num1 + num2;
//        }
//        System.out.println(addedRecur);
//    }


//     2. Method that validates user input is in certain range
//    int thisRange = getInteger(1, 10);
    public static int getInteger(int min, int max) {

        Scanner in = new Scanner(System.in);
        System.out.print("\"Please enter a number between 1 and 10\"");
        int userRangeInput = in.nextInt();
//        String match = "";
//        while

        if ((userRangeInput > 0) && (userRangeInput <= 10)) {
            System.out.println("Congratulations! " + userRangeInput + "is in the range of 1 and 10");
        } else
            System.out.println("Your number was not in range, please try again");

//        return System.out.println("Your number has been validated");

    }

//        if (min <= min){




    /*
    public static long getPower(int base, int exponent) {
    if (exponent == 0) {
        return 1;
    } else if (exponent == 1) {
        return base;
    } else if (exponent == 2) {
        return base * base;
    }
    return base * getPower(base, exponent - 1);
}
     */



}
