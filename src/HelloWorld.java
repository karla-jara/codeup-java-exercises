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

        // 5.
         long myNumber = 0;
         System.out.println(myNumber);
        // if "myNumber" was assigned to "long" without a value an error will state: variable myNumber might not have been initialized

        // 6.
         double myNumberDouble = 3.14;
         System.out.println(myNumberDouble);
        // if "myNumber" was assigned to 3.14, error states: incompatible types: possible lossy conversion from double to long


        // 7.
         long myNumber1 = 123L;
         System.out.println(myNumber1);
        // if "myNumber" was assigned to 123L, code prints 123

        // 8.
         long myNumber2 = 123;
         System.out.println(myNumber2);
        // if "myNumber" was assigned to 123, code prints 123

        // 9.
        float myNumber3 = 123;
        System.out.println(myNumber3);
        // if myNumber value 3.14 declared as a Float then error: incompatible types: double cannot be converted to java.lang.Float
        // if value of 123 declared as a Float then error: incompatible types: int cannot be converted to java.lang.Float
        // if myNumber value 3.14 declared as a float then error: possible lossy conversion from double to float. fix by explicitly assigning the value 3.14F or (float) 3.14
        // We can fix this by assigning myNumber value 123 and declare as a float or double instead of long then system prints: 123.0

        // 10.
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        // line 46: prints 5 bc it executes the printing of 5 before it increments by 1
        // line 47: prints 6 after the increment is executed

        int z = 5;
        System.out.println(++z);
        System.out.println(z);
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

        int three = (int) o;
        System.out.println(three);
        // Above error states: Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        // this states that since the original assignment of "o" was a string and the assignment to Object is the word "three" then that is not and integer and cannot be assigned to an Integer object of "int"

//        int three = (int) "three";
        // error states: incompatible types: java.lang.String cannot be converted to int
        // this specifies the value itself is not a number and cannot be converted to an integer


        // 13.
        int n = 4;
        n = n + 5;
        System.out.println(n); // prints 9
        // x += 5; shorthand for the code above retains same value

        int t = 3;
        int s = 4;
        s = s * t;
        System.out.println(s); // prints 12
        // y *= x shorthand for the code above retains same value

        int a = 10;
        int b = 2;
        a = a / b;
        b = b - a;
        System.out.println(a); // prints 5
        System.out.println(b); // print -3
        // x /= y; shorthand for the code above retains same value
        // y -= x; shorthand for the code above retains same value


        // 14.
        float y = Integer.MAX_VALUE;
        y -= 1;
        System.out.println(y);
        // prints -2147483648 may be over floating // ask Douglas why he said this







    }
}
