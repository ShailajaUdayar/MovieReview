package com.goanna.app.data;

import java.util.*;

public class MovieDataSource {

    private static final List<Movie> MOVIE_DATA_SOURCE = new ArrayList<>();


    static {
        Movie m1 = new Movie();
        m1.setTitle("The Shawshank Redemption");
        m1.setActor("Morgan Freeman");
        m1.setGenre(Genre.DRAMA);
        m1.setRating(9.3);
        m1.setYear(1994);
        MOVIE_DATA_SOURCE.add(m1);

        Movie m2 = new Movie();
        m2.setTitle("The Dark Knight");
        m2.setActor("Christian Bale");
        m2.setGenre(Genre.ACTION);
        m2.setRating(9.0);
        m2.setYear(2008);
        MOVIE_DATA_SOURCE.add(m2);

        Movie m3 = new Movie();
        m3.setTitle("Inception");
        m3.setActor("Leonardo DiCaprio");
        m3.setGenre(Genre.SCIFI);
        m3.setRating(8.8);
        m3.setYear(2010);
        MOVIE_DATA_SOURCE.add(m3);

        Movie m4 = new Movie();
        m4.setTitle("The Conjuring");
        m4.setActor("Patrick Wilson");
        m4.setGenre(Genre.HORROR);
        m4.setRating(7.5);
        m4.setYear(2013);
        MOVIE_DATA_SOURCE.add(m4);

        Movie m5 = new Movie();
        m5.setTitle("The Suicide Squad");
        m5.setActor("Margot Robbie");
        m5.setGenre(Genre.COMEDY);
        m5.setRating(7.6);
        m5.setYear(2021);
        MOVIE_DATA_SOURCE.add(m5);

    }

    public static List<Movie> getMoviesByGenre(Genre genre) {
        List<Movie> movies = new ArrayList<>();
        for (Movie m : MOVIE_DATA_SOURCE) {
            if (genre == m.getGenre()) {
                movies.add(m);
            }
        }
        return movies;
    }

    public static List<Movie> getMoviesByYear(int fromYear, int toYear) {
        List<Movie> movies = new ArrayList<>();
        for (Movie m : MOVIE_DATA_SOURCE) {
            if (m.getYear() >= fromYear && m.getYear() <= toYear) {
                movies.add(m);
            }
        }
        return movies;
    }

    public static List<Movie> getMoviesByActor(String actor) {
        List<Movie> movies = new ArrayList<>();
        for (Movie m : MOVIE_DATA_SOURCE) {
            if (m.getActor().equalsIgnoreCase(actor)) {
                movies.add(m);
            }
        }
        return movies;
    }

    public static Map<Integer, String> getAvailableActors() {
        Map<Integer, String> actors = new HashMap<>();
        int i = 1;
        for (Movie m : MOVIE_DATA_SOURCE) {
            actors.put(i, m.getActor());
            i++;
        }
        return actors;
    }

}
