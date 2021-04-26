import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        int myFavoriteNumber = 33;
        System.out.println(myFavoriteNumber);
        // 1. Above output: 33

        String myString = "Coding is eternal";
        System.out.println(myString);
        // 2. Above output: Coding is eternal

        // String myString = 'c';
        // 3. Above displays error: java: incompatible types: char cannot be converted to java.lang.String

        // String myString = 3.14159;
        // 4. Above displays error: java: incompatible types: double cannot be converted to java.lang.String

        // long myNumber;
        // System.out.println(myNumber);
        // 5. if "myNumber" was assigned to "long" without a value an error will state: variable myNumber might not have been initialized

        // long myNumber = 3.14;
        // System.out.println(myNumber);
        // 6. if "myNumber" was assigned to 3.14, error states: incompatible types: possible lossy conversion from double to long

        // long myNumber = 123L;
        // System.out.println(myNumber);
        // 7. if "myNumber" was assigned to 123L, code prints 123

        // long myNumber = 123;
        // System.out.println(myNumber);
        // 8. if "myNumber" was assigned to 123, code prints 123

        float myNumber = 123;
        System.out.println(myNumber);
        // 9. if myNumber value 3.14 declared as a Float then error: incompatible types: double cannot be converted to java.lang.Float
        // if value of 123 declared as a Float then error: incompatible types: int cannot be converted to java.lang.Float
        // if myNumber value 3.14 declared as a float then error: possible lossy conversion from double to float. fix by explicitly assigning the value 3.14F or (float) 3.14
        // We can fix this by assigning myNumber value 123 and declare as a float or double instead of long then system prints: 123.0


//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
        // 10. line 46: prints 5 bc it executes the printing of 5 before it increments by 1
        // line 47: prints 6 after the increment is executed

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        // line 51: prints 6 bc the execution of ++ is performed b4 the printing of x
        // line 52:  6 is printed again after the previous line incremented


        // 11. int class = 5; cannot assign a variable with name of class- error displays: not a statement

        // 12.
        String theNumberThree = "three";
        System.out.println(theNumberThree);
        // Above prints: three

        Object o = theNumberThree;
        System.out.println(o);
        // Above prints: three

//        int three = (int) o;
//        System.out.println(three);
        // Above error states: Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')

        // this states that since the original assignment of "o" was a string and the assignment to Object is the word "three" then that is not and integer and cannot be assigned to an Integer object of "int"
//        int three = (int) "three";
        // error states: incompatible types: java.lang.String cannot be converted to int
        // this specifies the value itself is not a number and cannot be converted to an integer


        // 13.
//        int x = 4;
//        x = x + 5;
//        System.out.println(x); prints 9
        // x += 5; shorthand for the code above retains same value

//        int x = 3;
//        int y = 4;
//        y = y * x;
//        System.out.println(y); prints 12
        // y *= x shorthand for the code above retains same value

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//        System.out.println(x); // prints 5
//        System.out.println(y); // print -3
        // x /= y; shorthand for the code above retains same value
        // y -= x; shorthand for the code above retains same value

        // 14.

        float z = Integer.MAX_VALUE;
        z -= 1;
        System.out.println(z);
        // prints -2147483648 may be over floating







    }
}
