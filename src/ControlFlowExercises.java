import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){

        // 1a. while 5 to 15 by one
        int i = 5;
        while (i <= 15){
            System.out.println(i);
            i++;
        }

        // 1b-1. do-while 0 to 100 by twos
        int byTwos = 0;
        do {
            System.out.println(byTwos);
            byTwos += 2;
        } while (byTwos <= 100);

        // 1b-2. do-while 100 to -10 by fives
        int byFives = 100;
        do {
            System.out.println(byFives);
            byFives -= 5;
        } while (byFives >= -10);

        // 1b-3. do-while 2 to 1,000,000 by squaring number
        long numSq = 2;
        do {
            System.out.println(numSq);
            numSq *= numSq;
        } while (numSq < 10000000);

        // 1c-1. for loop 5 to 15 by one

        for (int byOne = 5; byOne <= 15; byOne++){
            System.out.println(byOne);
        }

        // 1c-2. for loop 0 to 100 by twos
        for(int byTwo = 0; byTwo <= 100; byTwo+=2){
            System.out.println(byTwo);
        }

        // 1c-3. for loop 100 to -10 by fives
        for(int by5 = 100; by5 >= -10; by5-=5){
            System.out.println(by5);
        }

        // 1c-4. for loop 2 to 1,000,000 by squaring number
        for(long by2 = 2; by2 < 1000000; by2*=by2){
            System.out.println(by2);
        }


        // 2. FizzBuzz

        for(int x = 1; x <= 100; x++){
            if ((x % 3 == 0) & (x % 5 == 0)){
                System.out.println("FizzBuzz");
                continue;
            } if (x % 3 == 0){
                System.out.println("Fizz");
                continue;
            } if (x % 5 == 0){
                System.out.println("Buzz");
            } else
                System.out.println(x);
        }

        // 3. table of powers
        Scanner in = new Scanner(System.in);

        System.out.print("What number would you like to go up to?");

        int userInt = in.nextInt();


        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int n = 1; n <= userInt; n++){
            System.out.println(n +"      | "+ n*n + "       | " + n*n*n);


        }

        // 4. Convert given number grades to letter grades


        Scanner sc = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
// is only one Scanner needed for multiple inputs in this case two inputs integer and string
        String answer;
        do {
            System.out.println("Please provide a grade from 0 to 100");
            int userGr = sc.nextInt();
            String grade = "";

            if (userGr <= 100){
                grade = String.valueOf('A');

            } else if (userGr >= 80){
                grade = String.valueOf('B');

            } else if (userGr >= 67){
                grade = String.valueOf('C');

            } else if (userGr >= 60){
                grade = String.valueOf('D');

            } else if (userGr >= 0){
                grade = String.valueOf('F');

            }
            //Display grade
            System.out.println("Your grade: " + grade);

            // Ask user if they would like to continue
            System.out.println("Would you like to continue? Enter yes or no");
            answer = input2.next();

        } while (answer.equals("yes") || answer.equals("Yes"));











    }
}
