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

        //2. exercise continues on lines 67 - 77
//        getInteger(1,10);
//        Scanner in = new Scanner(System.in);
////        System.out.println("Enter a number between " + min + " and " + max + ".");
////        int min = in.nextInt();
//
//        System.out.print("Please enter a number between 1 and 10: ");
//        int inputNum = in.nextInt();
//        if(inputNum > 0 || inputNum < 10){

//        }
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
    }

    // Multiply without the multiplication operator
    public static int multiplyWithoutOperator(int num1, int num2){
        int product = 0;
        for(int i = 0; i<num2;i++){

            product += num1;
        }
        return product;
    }

//    //     2. Method that validates user input is in certain range
//    public static int getInteger(int min, int max) {
////        int input = input.nextInt;
//
//        Scanner in = new Scanner(System.in);
////        System.out.print("Please enter a number between 1 and 10: ");
////        int inputNum = in.nextInt();
//
//        do {
//            System.out.println("Enter a number between " + min + " and " + max + ".");
//            input = in.nextInt();
//            in = new Scanner(System.in);
//        } while (input > min || input < max);
//        return input;
//}






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
