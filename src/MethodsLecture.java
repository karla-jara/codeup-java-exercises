public class MethodsLecture {
    public static void main(String[] args){
        System.out.println("Hello, Methods");
        // --- defining and calling methods w various inputs
        sayGreeting();
        sayInput("Hello, Class!");
        System.out.println(getGreetingWithName("Marco, getDefaultGreeting!"));
        System.out.println(returnProductOfThreeNumbers(1,2,3));
        System.out.println(getGreetingWithName("Hola, ", "clase Marco!"));






    }
    // no inputs and no outputs
    public  static void sayGreeting(){
        System.out.println(getDefaultGreeting());
    }
    // no returned output with input
    public static void sayInput(String input) {
        System.out.println(input);

    }

    // return output without input
    public static String getDefaultGreeting(){
        return "Hello, ";
    }

    // return output with input
    public static String getGreetingWithName(String name){
        return getDefaultGreeting() + " " + name;
    }

    // return output with input using numbers
    public static double returnProductOfThreeNumbers(double num1, double num2, double num3){
        double result = num1 * num2 * num3;
        return result;
    }

    // method overloading
    public static String getGreetingWithName(String salutation, String name){
        return salutation + name;
    }

}
