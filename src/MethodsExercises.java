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
    }

    // 2. Method that validates user input is in certain range
    public static int getInteger (int min, int max) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 10: ");
        int inputNum = in.nextInt();
        if (inputNum > 0 && inputNum <= 10) {
            System.out.println("Congratulations, your number is valid!");
        } else {
            System.out.println("Sorry, that is not within the range of 1 to 10");
            getInteger(1, 10);
        }
        return inputNum;
    }

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
