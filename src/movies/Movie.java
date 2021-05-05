package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String movieName, String movieCategory){
        name = movieName;
        category = movieCategory;
    }

    public String getMovie(){
        return name;
    }

    public void setName(String newMovie){
        this.name = newMovie;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String newCategory){
        this.category = newCategory;
    }

    public String allMovies(){
        return name + category;
    }




}
