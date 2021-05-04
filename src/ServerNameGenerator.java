public class ServerNameGenerator {
    public static void main(String [] args){

        String [] nouns = {"house", "car", "motorcycle", "bicycle", "desk", "dog", "parrot", "pen", "scissors", "computer"};
        String [] adjectives = {"pretty", "cool", "hard", "bubbly", "expensive", "impressive", "ostentatious", "needy", "caring", "smart"};
        System.out.println("Here is your server name: ");
        System.out.println(randomElement(nouns) + "-" + randomElement(adjectives));

//        for (int i = 0; i < 9; i++){
//            i = (int)(Math.random()*9+0);
//            System.out.println("Here is your server name: " + nouns[i] + "-" + adjectives[i]);
//        }
    }

    public static String randomElement(String[] word){
        return word[(int)Math.floor(Math.random()*(word.length-1))];
    }
}
