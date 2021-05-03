import java.util.Scanner;

public class HighLow {
    public static void main(String[] args){
        int randomNum = (int)(Math.random()*100+1);
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 100: ");
        int count = 0;
        for(int i = 0; i < 100; i++){
            int userGuess = in.nextInt();
            if (count < 15){
                if (userGuess > 0 && userGuess <= 100){
                    if (userGuess < randomNum){
                        System.out.println("HIGHER");
                        count += 1;
                    }
                    else if (userGuess > randomNum){
                        System.out.println("LOWER");
                        count += 1;
                    } else {
                        System.out.println("GOOD GUESS!");
                        System.out.println("You guessed " + count + " time(s) before you guessed correctly.");
                        break;
                    }
                } else {
                    System.out.println("Your input was not a valid guess");
                }
            } else {
                System.out.println("I'm sorry this is taking too long, how about I just give you the answer. \n The number is " + randomNum + ".");
                break;
            }
        }
    }
}
