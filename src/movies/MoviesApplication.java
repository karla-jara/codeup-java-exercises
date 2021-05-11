package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args){

//        Scanner in = new Scanner(System.in);


        System.out.println("What would you like to do?");

        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the sci-fi category");

        System.out.println("Enter your choice: ");
        Input inputMovieChoice = new Input();
        String inputSelected = inputMovieChoice.getString();
        System.out.println("inputMovieChoice = " + inputMovieChoice);
        if (inputSelected == "1"){
            Movie newMovieChoice = new Movie(inputSelected, inputSelected);

            Arrays.stream(MoviesArray.findAll()).toList();

//            System.out.println("view all movies: " + newMovieChoice.allMovies());
        }
//            Movie selectedArray = new Movie (movieNam, movieCat);
//            System.out.println(MoviesArray.findAll().toString());

//            (int i = 0; i < MoviesArray.findAll().length; i++){
//              if (selectedArray[i] == )
//        } if (inputSelected == 0){

//            selectedArray.getCategory();
//        } if (inputSelected == 3){

//        }


    }

}
