package wk3;

public class Tester {

    public static void main(String[] args){
        int[] ratings = {3, 4, 5, 3, 2};

        Movie movie1 = new Movie("inception", ratings);
         movie1.displayMovieDetails();
        System.out.println("Calculated average: " + movie1.calculateAverageRating());
    }
}
