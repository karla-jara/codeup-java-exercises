package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args){
        Movie[] moviesArray = MoviesArray.findAll();

        System.out.println("What would you like to do?");

        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the sci-fi category");

        System.out.println("Enter your choice: ");
        Input inputMovieChoice = new Input();
        int inputSelected = inputMovieChoice.getInt();
        if (inputSelected == 0){
            System.out.println("Good-bye, have a great day!");
        }
        if (inputSelected == 1){
            for (int i = 0; i < moviesArray.length; i++){
                System.out.println(moviesArray[i].allMovies());
            }
        } if (inputSelected == 2){
            for(int i = 0; i < moviesArray.length; i++){
                if(moviesArray[i].getCategory().equalsIgnoreCase("animated")){
                    System.out.println(moviesArray[i].allMovies());
                }
            }
        } if (inputSelected == 3){
            for(int i = 0; i < moviesArray.length; i++){
                if(moviesArray[i].getCategory().equalsIgnoreCase("drama")){
                    System.out.println(moviesArray[i].allMovies());
                }
            }
        } if (inputSelected == 4){
            for (int i = 0; i < moviesArray.length; i++){
                if(moviesArray[i].getCategory().equalsIgnoreCase("horror")){
                    System.out.println(moviesArray[i].allMovies());
                }
            }
        } if (inputSelected == 5){
            for (int i = 0; i < moviesArray.length; i++){
                if(moviesArray[i].getCategory().equalsIgnoreCase("sci-fi")){
                    System.out.println(moviesArray[i].allMovies());
                }
            }
        }
    }

}
