package wk3;

public class Movie {

    private String movieName;
    private int[] ratings;

    public Movie(String name, int[] movieRatings){
        this.movieName = name;
        this.ratings = movieRatings;
    }
   public double calculateAverageRating(){
        int sum = 0;
       for (int i = 0; i < ratings.length; i++) {
           sum = sum + ratings[i];

       }
       return sum / ratings.length;
   }
   public void displayMovieDetails(){
       System.out.println("Movie: " + movieName);
       System.out.println("Ratings: ");
       for (int i = 0; i < ratings.length; i++){
           System.out.println(ratings[i] + " ");
       }
       System.out.println("Average Rating: " + calculateAverageRating());
   }

}
