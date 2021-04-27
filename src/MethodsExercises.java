public class MethodsExercises {

    public static void main(String[] args){
        // called methods from outside main
        addition(3, 3);
        subtraction(3, 3);
        multiplication(3, 3);
        division(3, 3);
        modulus(32, 3);// if num2 is zero exception error
        System.out.println(multiplyWithoutOperator(3, 3));





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

//    public static void addRecur()


    // 2. Method that validates user input is in certain range
//    public static int getInteger(int min, int max){
//
//    }


}
