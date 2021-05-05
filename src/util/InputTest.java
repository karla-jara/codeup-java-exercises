package util;

public class InputTest {
    public static void main(String [] args){

        Input inputOf = new Input();

        System.out.println("inputOf.getString() = " + inputOf.getString());
        System.out.println("inputOf.yesNo() = " + inputOf.yesNo());
        System.out.println("inputOf.getInt(3,5) = " + inputOf.getInt(3,5));
        System.out.println("inputOf.getInt() = " + inputOf.getInt());
        System.out.println("inputOf.getDouble(3,4) = " + inputOf.getDouble(3, 4));
        System.out.println("inputOf.getDouble() = " + inputOf.getDouble());

    }
}
