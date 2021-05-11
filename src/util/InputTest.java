package util;

import java.util.InputMismatchException;

public class InputTest {
    public static void main(String [] args) throws Exception {

        Input inputOf = new Input();

        System.out.println("inputOf.getString() = " + inputOf.getString());

        System.out.println("inputOf.yesNo() = " + inputOf.yesNo());

        System.out.println("inputOf.getInt(3,5) = " + inputOf.getInt(3,5));

        System.out.println("inputOf.getInt() = " + inputOf.getInt());

        System.out.println("inputOf.getDouble(30.0,40.0) = " + inputOf.getDouble(30.0, 40.0));

        System.out.println("inputOf.getDouble() = " + inputOf.getDouble());

    }
}
